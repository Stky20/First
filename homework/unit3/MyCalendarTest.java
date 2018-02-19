package by.htp.jd1_2018.homework.unit3;

//Задача: Календарь на год

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyCalendarTest {
	
	public static void main(String[] args) {
	
		GregorianCalendar d = new GregorianCalendar();
		int today = d.get(Calendar.DAY_OF_MONTH);
		int month = d.get(Calendar.MONTH);
		int year = d.get(Calendar.YEAR);
	
		d.set(Calendar.DAY_OF_MONTH, 1);
		d.set(Calendar.MONTH, 0);
	
		int weekday = d.get(Calendar.DAY_OF_WEEK);
		System.out.println("ВС ПН ВТ СР ЧТ ПТ СБ");
	
		for(int i = Calendar.SUNDAY; i< weekday; i++) {
			System.out.print("   ");
		}
	
		do {
			int day = d.get(Calendar.DAY_OF_MONTH);
			int newMonth = d.get(Calendar.MONTH);
		
			if (day < 10) 
				System.out.print(" ");
		
			System.out.print(day);
		
			if ((day == today) && (newMonth == month))
				System.out.print("*");
			else
				System.out.print(" ");
		
			if(weekday == Calendar.SATURDAY)
				System.out.println();
		
			d.add(Calendar.DAY_OF_MONTH, 1);
		
			weekday = d.get(Calendar.DAY_OF_WEEK);
		

				if (d.get(Calendar.DAY_OF_MONTH) == 1) {
		
					System.out.println();
					System.out.println();
			
					if (d.get(Calendar.YEAR) == year) {
						System.out.println("ВС ПН ВТ СР ЧТ ПТ СБ");
			
						for(int i = Calendar.SUNDAY; i< weekday; i++) 
							System.out.print("   ");
					}
			
				}
				
		}while(d.get(Calendar.YEAR) == year);
	
		if (weekday != Calendar.SATURDAY)
			System.out.println("");
	}	

}



