package by.htp.nb.controller.impl;

import java.io.IOException;

import by.htp.nb.controller.Comand;
import by.htp.nb.entity.Note;
import by.htp.nb.entity.User;
import by.htp.nb.service.NoteService;
import by.htp.nb.service.ServiceFactory;

public class EditNote implements Comand  {

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public String execute(String[] params) {
		String nickName = params[3];
		String password = params[5];
		String name = params[7];
		String surname = params[9];
		int id = Integer.parseInt(params[1]);
		String oldNote = params[12];
		int day = Integer.parseInt(params[14]);
		int month = Integer.parseInt(params[16]);
		int year = Integer.parseInt(params[18]);
		String newText = params[20];
		
		User user = new User(id, nickName, password, name, surname);
		
		if(params[10].equals(false)) {
			System.out.println("You are not logged in (from controller).");
			user.setLogedIn(false);
			return user.toString() + "/" + user.isLogedIn();
		}
		
		Note note = new Note(oldNote);
		note.setDate(day,  month,  year);
		
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		NoteService noteService = serviceFactory.getNoteService();
		
		if (!oldNote.isEmpty()) {
			try {
				noteService.editNote(user, note, newText);
				System.out.println("cahnging note text is done(from controller).");
			} catch (IOException e) {
				e.printStackTrace();
				
			}
		}else {
						
			try {
				noteService.editNote(user, note, day, month, year);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("cahnging note date is done(from controller).");
		}
				
		return user.toString() + "/" + user.isLogedIn();
	}

}
