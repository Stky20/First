package by.htp.jd1_2018.homework.task3;

public class Main {

	public static void main(String[] arqs) {
		
		NoteBook noteBook = new NoteBook();
		
		noteBook.addNote(new Note(1, "Today is monday"));
		noteBook.addNote(new Note(2, "Hi, my name is"));
		noteBook.addNote(new Note(3, "Putin is going to become a future president of Russia"));
		noteBook.addNote(new Note(4, "It is important note."));
		noteBook.addNote(new Note(5, "Don`t forget to do homework"));
		noteBook.addNote(new Note(6, "Java is international languege"));
		noteBook.addNote(new Note(7, "Someday Belarus will be greatest country in the world"));
		noteBook.addNote(new Note(8, "I realy don`t know any other politics in Belarus exept Alexander"));
		noteBook.addNote(new Note(9, "I wonder if i can learn java during jamaican rum with coke"));
		noteBook.addNote(new Note(10, "What else can i wright?"));
				
		noteBook.printNoteBook();
				
		noteBook.findNote("we");
		
		noteBook.findNote("Belarus");
		
		noteBook.findNote("homework");
				
	}
}
