package by.htp.jd1_2018.homework.task3;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {
	
	public List<Note> noteBook; 
			
	public NoteBook () {		
		noteBook = new ArrayList<Note>();				
	}
	
	public NoteBook (Note note) {		
		noteBook = new ArrayList<Note>();
		noteBook.add(note);			
	}	

	public void addNote (Note note){
		noteBook.add(note);
	}
	
	public void findNote(String textNote) {
		int index = 0;
		for(Note note1: noteBook) {
			if(note1.noteText.contains(textNote)) {
				note1.printNote();
			}else {			
			index++;
			}
		}	
			
		if (index == noteBook.size()) {
			System.out.println("There is no notes with  text: " + "[" +textNote + "], " + "in Note Book");
		}
		
	}	
	
	public void printNoteBook() {
		for(Note pNote: noteBook) {
			System.out.println("**************************************************");
			System.out.println(pNote.id + " - ID number of note" + "\n" + "Date of note: " + pNote.noteDate + "\n" + "Text of note: \n" +pNote. noteText);
			System.out.println("**************************************************");
		}
	}
}
