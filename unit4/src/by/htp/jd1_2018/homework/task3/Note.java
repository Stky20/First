package by.htp.jd1_2018.homework.task3;

import java.util.Date;

public class Note {
	int id;
	String noteText;
	Date noteDate = new Date();
	
	public Note() {
		id = 0;
		noteText = "";
	}
	
	public Note(int id, String noteText) {
		this.id = id;
		this.noteText = noteText;
	}

	public String getNoteText() {
		return noteText;
	}

	public void setNoteText(String noteText) { //исправление записи
		this.noteText = noteText;
	}

	public Date getNoteDate() {
		return noteDate;
	}

	public void setNoteDate(Date noteDate) { //исправление даты записи
		this.noteDate = noteDate;
	}
	
	public void printNote() {
		System.out.println("****************************************");
		System.out.println(id + " - ID number of note" + "\n" + "Date of note " + noteDate + "\n" + "Text of note: \n" + noteText);
		System.out.println("**************************************************");
		
	}
			
}
