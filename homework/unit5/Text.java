package by.htp.jd1_2018.homework.unit5;


import java.util.ArrayList;
import java.util.TreeSet;

@SuppressWarnings("unused")
public class Text {

	public static void main(String[] args) {
			
		Note note1 = new Note ("note1", new Data(2018, 2, 15),true);
		Note note2 = new Note ("note2", new Data(2023, 3, 15),true);
		Note note3 = new Note ("note3", new Data(2012, 4, 15),true);
		
	//	note1.compareTo(note2);
		
		/*TreeSet<Note> set = new TreeSet<Note>();
		
		set.add(note1);
		set.add(note2);
		set.add(note3);
		for (Note n: set){
			System.out.println(n.getDate().getYear());
		}*/
		
		
		NoteComparator comparator = new NoteComparator();
		TreeSet<Note> set2 = new TreeSet<Note>(/*comparator*/);
		
		set2.add(note1);
		set2.add(note2);
		set2.add(note3);
		
		for (Note n: set2){
			System.out.println(n.getDate().getYear());
		}
		

	}

}

