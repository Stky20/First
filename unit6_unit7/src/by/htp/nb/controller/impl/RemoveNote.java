package by.htp.nb.controller.impl;

import java.io.IOException;

import by.htp.nb.controller.Comand;
import by.htp.nb.entity.Note;
import by.htp.nb.entity.User;
import by.htp.nb.service.NoteService;
import by.htp.nb.service.ServiceFactory;

public class RemoveNote implements Comand  {

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public String execute(String[] params) {
		String nickName = params[3];
		String password = params[5];
		String name = params[7];
		String surname = params[9];
		int id = Integer.parseInt(params[1]);
		String removebleNote = params[12];
		int day = Integer.parseInt(params[14]);
		int month = Integer.parseInt(params[16]);
		int year = Integer.parseInt(params[18]);
				
		User user = new User(id, nickName, password, name, surname);
		
		if(params[10].equals(false)) {
			System.out.println("You are not logged in (from controller).");
			user.setLogedIn(false);
			return user.toString() + "/" + user.isLogedIn();
		}
		
		Note note = new Note(removebleNote);
		note.setDate(day,  month,  year);
		
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		NoteService noteService = serviceFactory.getNoteService();
		
		try {
			noteService.removeNote(user, note);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Note is removed(from controller).");
		
		return user.toString() + "/" + user.isLogedIn();
	}

}
