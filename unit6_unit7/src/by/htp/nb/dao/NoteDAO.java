package by.htp.nb.dao;

import java.io.IOException;
import java.util.List;

import by.htp.nb.entity.Note;
import by.htp.nb.entity.User;

public interface NoteDAO {
	
	void createNote (User user, String text) throws IOException;
	List<Note> findNotes (User user, String text) throws IOException;
	List<Note> findNotes(User user, int day, int month, int year) throws IOException;
	void editNote (User user, Note note, String text) throws IOException;
	void editNote(User user, Note note, int day, int month, int year) throws IOException;
	void removeNote (User user, Note note) throws IOException;
	void showNote(Note note);
	void showNotes(List<Note> noteList);
	
	

}
