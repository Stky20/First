package by.htp.nb.controller.impl;

import java.io.IOException;

import by.htp.nb.controller.Comand;
import by.htp.nb.entity.User;
import by.htp.nb.service.NoteService;
import by.htp.nb.service.ServiceFactory;

public class FindNote implements Comand {

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public String execute(String[] params) {
		String nickName = params[3];
		String password = params[5];
		String name = params[7];
		String surname = params[9];
		int id = Integer.parseInt(params[1]);
		String newNote = params[12];
		int day = Integer.parseInt(params[14]);
		int month = Integer.parseInt(params[16]);
		int year = Integer.parseInt(params[18]);
		
		User user = new User(id, nickName, password, name, surname);
		
		if(params[10].equals(false)) {
			System.out.println("You are not logged in (from controller).");
			user.setLogedIn(false);
			return user.toString() + "/" + user.isLogedIn();
		}
		
		if (!newNote.equals(null)) {
			ServiceFactory serviceFactory = ServiceFactory.getInstance();
			NoteService noteService = serviceFactory.getNoteService();
			
			try {
				noteService.findNotes(user, newNote);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Notes with asked text(from controller).");
		}else {
			ServiceFactory serviceFactory = ServiceFactory.getInstance();
			NoteService noteService = serviceFactory.getNoteService();
			
			try {
				noteService.findNotes(user, day, month, year);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Notes from asked date(from controller).");
		}
		return user.toString() + "/" + user.isLogedIn();
	}

}
