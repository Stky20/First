package by.htp.jd1_2018.homework.unit5;


import java.util.ArrayList;
import java.util.List;

public class NoteBook {
	private String ownerName;
	private String ownerSurname;
	
	
	private ArrayList<Note> notes;
	
	public NoteBook(String ownerName, String ownerSurname){
		this.ownerName=ownerName;
		this.ownerSurname=ownerSurname;
		
		notes = new ArrayList<Note>(); 
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerSurname() {
		return ownerSurname;
	}

	public void setOwnerSurname(String ownerSurname) {
		this.ownerSurname = ownerSurname;
	}

	public ArrayList<Note> getNotes() {
		return notes;
	}

	public void setNotes(ArrayList<Note> notes) {
		this.notes = notes;
	}
	
	
	public void add(String text, int year, int month, int day){
		Note newNote = new Note(text, new Data(year, month, day), true);
		notes.add(newNote);
	}
	
	public Note findNote(String text){
		for (@SuppressWarnings("unused") Note note: notes){
			
		}
		return null;
	}
	
	public List<Note> findNote (Data d){
		return null;
	}
	
	public void remove(String text){
		
	}

}
