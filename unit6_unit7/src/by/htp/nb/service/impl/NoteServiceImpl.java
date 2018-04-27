package by.htp.nb.service.impl;

import java.io.IOException;
import java.util.List;

import by.htp.nb.dao.DAOFactory;
import by.htp.nb.entity.Note;
import by.htp.nb.entity.User;
import by.htp.nb.service.NoteService;

public class NoteServiceImpl implements NoteService {

	@Override
	public void createNote(User user, String text) throws IOException {
		DAOFactory daoFactory = DAOFactory.getInstance();
		daoFactory.getNoteDAO().createNote(user, text);		
	}

	@Override
	public List<Note> findNotes(User user, String text) throws IOException {
		DAOFactory daoFactory = DAOFactory.getInstance();
		showNotes(daoFactory.getNoteDAO().findNotes(user, text));
		return daoFactory.getNoteDAO().findNotes(user, text);		
	}

	@Override
	public List<Note> findNotes(User user, int day, int month, int year) throws IOException {
		DAOFactory daoFactory = DAOFactory.getInstance();	
		showNotes(daoFactory.getNoteDAO().findNotes(user, day, month, year));
		return daoFactory.getNoteDAO().findNotes(user, day, month, year);
	}

	
	@Override
	public void editNote(User user, Note note, String text) throws IOException {
		DAOFactory daoFactory = DAOFactory.getInstance();
		daoFactory.getNoteDAO().editNote(user, note, text);	
		
	}

	@Override
	public void editNote(User user, Note note, int day, int month, int year) throws IOException {
		DAOFactory daoFactory = DAOFactory.getInstance();
		daoFactory.getNoteDAO().editNote(user, note, day, month, year);	
		
	}

	@Override
	public void removeNote(User user, Note note) throws IOException {
		DAOFactory daoFactory = DAOFactory.getInstance();
		daoFactory.getNoteDAO().removeNote(user, note);
	}

	@Override
	public void showNote(Note note) {
		DAOFactory daoFactory = DAOFactory.getInstance();
		daoFactory.getNoteDAO().showNote(note);
		
	}

	@Override
	public void showNotes(List<Note> noteList) {
		DAOFactory daoFactory = DAOFactory.getInstance();
		daoFactory.getNoteDAO().showNotes(noteList);
		
	}

}
