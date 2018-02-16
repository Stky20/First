package by.htp.jd1_2018.homework.unit5;

import java.util.Comparator;

public class NoteComparator implements Comparator<Note> {

	@Override
	public int compare(Note arg1, Note arg2) {
		int year1;
		int year2;
		
		year1=arg1.getDate().getYear();
		year2=arg2.getDate().getYear();
		
		if(year1>year2){
			return 1;
		}
		
		if(year1<year2){
			return -1;
		}
		return 0;
	}

}

