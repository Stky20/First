package by.htp.nb.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import by.htp.nb.dao.NoteDAO;
import by.htp.nb.entity.Note;
import by.htp.nb.entity.User;

public class FileNoteDAO implements NoteDAO {
	
	
	
	@Override
	public void createNote(User user, String text) throws IOException {
		
		if(user.isLogedIn()) {
		
			BufferedReader reader = new BufferedReader(new FileReader(user.getId() + "_notes.txt"));
	
			List<String> notesList = new ArrayList<String>();
		
			String line;
			while((line = reader.readLine()) != null) {
				notesList.add(line);
			}
			reader.close();
		
			Note note = new Note(text);
		
			notesList.add(note.getDate().get(Calendar.DAY_OF_MONTH) + "/" +   //формат записи нотов в файл день|месяц|год|текст
					(note.getDate().get(Calendar.MONTH) + 1) + "/" +
					note.getDate().get(Calendar.YEAR) + "/" + text);
		
			FileWriter writer = new FileWriter (user.getId() + "_notes.txt");
		
			for (String line1: notesList) {
				writer.write(line1 + "\n");
			}
			writer.close();
		}else {
			System.out.println("Yuo are not logged in");
		}
	}

	@Override
	public List<Note> findNotes(User user, String text) throws IOException {
		
		if(user.isLogedIn()) {
			
			BufferedReader reader = new BufferedReader(new FileReader(user.getId() + "_notes.txt"));
	
			List<String> notesList = new ArrayList<String>();
		
			String line;
			while((line = reader.readLine()) != null) {
				notesList.add(line);
			}
			reader.close();
			
			List<Note> wantedNotes = new ArrayList<Note>();
			
			for (String line1: notesList) {
				if(line1.contains(text)) {
					Note wantedNote = new Note(line1.split("/")[3]);
					wantedNote.setDate(Integer.parseInt(line1.split("/")[0]), Integer.parseInt(line1.split("/")[1]), Integer.parseInt(line1.split("/")[2]));
					wantedNotes.add(wantedNote);
				}
			}
			
			return wantedNotes;
			
		}else {
			System.out.println("Yuo are not logged in");
			return new ArrayList<Note>();
		}
	}
	
	
	@Override
	public List<Note> findNotes(User user, int day, int month, int year) throws IOException {
		if(user.isLogedIn()) {
		
			BufferedReader reader = new BufferedReader(new FileReader(user.getId() + "_notes.txt"));
		
			List<String> notesList = new ArrayList<String>();
	
			String line;
			while((line = reader.readLine()) != null) {
			notesList.add(line);
			}
			reader.close();
			
			List<Note> wantedNotes = new ArrayList<Note>();
		
			for (String line1: notesList) {
				if(line1.contains(day + "/" + month + "/" + year)) {
					Note wantedNote = new Note(line1.split("/")[3]);
					wantedNote.setDate(day, month, year);
					wantedNotes.add(wantedNote);
				}
				
			}
		return wantedNotes;
		
		}else {
			System.out.println("Yuo are not logged in");
			return new ArrayList<Note>();	
		}	
			
	}

	@Override
	public void editNote(User user, Note note, String text) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(user.getId() + "_notes.txt"));
		
		List<String> notesList = new ArrayList<String>();

		String line;
		while((line = reader.readLine()) != null) {
		notesList.add(line);
		}
		reader.close();
		
		int index = notesList.indexOf(note.toString());
		if(index > -1) {
			notesList.remove(index);
			notesList.add(index, note.toString() + text);
		} else {
			System.out.println("Note isn`t changed, becouse it isnt found.");
		}
		
		
		FileWriter writer = new FileWriter (user.getId() + "_notes.txt");
		
		for (String line1: notesList) {
			writer.write(line1 + "\n");
		}
		writer.close();
		
	}
	
	@Override
	public void editNote(User user, Note note, int day, int month, int year) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(user.getId() + "_notes.txt"));
		
		List<String> notesList = new ArrayList<String>();

		String line;
		while((line = reader.readLine()) != null) {
		notesList.add(line);
		}
		reader.close();
		
		int index = notesList.indexOf(note.toString());
			
		note.setDate(day, month, year);
		
		if(index > -1) {
			notesList.remove(index);
			notesList.add(index, note.toString());
		} else {
			System.out.println("Note isn`t changed, becouse it isnt found.");
		}
		
		FileWriter writer = new FileWriter (user.getId() + "_notes.txt");
		
		for (String line1: notesList) {
			writer.write(line1 + "\n");
		}
		writer.close();
		
	}

	@Override
	public void removeNote(User user, Note note) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(user.getId() + "_notes.txt"));
		
		List<String> notesList = new ArrayList<String>();

		String line;
		while((line = reader.readLine()) != null) {
			notesList.add(line);
		}
		
		reader.close();
									
		int index = notesList.indexOf(note.toString());
		if (index > - 1) {
			notesList.remove(index);
		}else {
			System.out.println("Note can`t be removed, becourse there is no such note.");
		}
		
		
		FileWriter writer = new FileWriter (user.getId() + "_notes.txt");
		
		for (String line1: notesList) {
			writer.write(line1 + "\n");
		}
		writer.close();
		
	}

	@Override
	public void showNote(Note note) {
		System.out.println(note.getDate().get(Calendar.DAY_OF_MONTH) + "." +
				(note.getDate().get(Calendar.MONTH) + 1) + "." +
				note.getDate().get(Calendar.YEAR) + " " + note.getText());
		
		
	}
	
	@Override
	public void showNotes(List<Note> noteList) {
		
		for(Note note: noteList) {
			showNote(note);
			System.out.println();
		}		
		
	}

}
