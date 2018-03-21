package by.htp.jd1_2018.homework.task1;

import java.util.Random;

public class Student {
	
	public String id;
	public String surname;
	public String name;
	int[] marks = new int [6];
	
	public Student(String surname, String name, int mark1, int mark2, int mark3, int mark4, int mark5, int mark6) {
		
		Random ran = new Random();
		
		this.id = (ran.nextInt(100)+ ran.nextInt(100)) + surname;
		this.surname = surname;
		this.name = name;
		
		if ((mark1 < 1 && mark1 >10)||(mark2 < 1 && mark2 >10)||(mark3 < 1 && mark3 >10)||
			(mark4 < 1 && mark4 >10)||(mark5 < 1 && mark5 >10)||(mark6 < 1 && mark6 >10)) {
			System.out.println("Оценки студентов должны быть от 0 до 10. Вы указали неверные оценки студента);");
			return;
		}
		
		this.marks[0] = mark1;
		this.marks[1] = mark2;
		this.marks[2] = mark3;
		this.marks[3] = mark4;
		this.marks[4] = mark5;
		this.marks[5] = mark6;
		
	}
			
		
	
	public double averageRating() {
		
		double averageRating = 0;
		
		for(int i = 0; i < this.marks.length; i++) 
			averageRating = averageRating + this.marks[i];
			
		averageRating = averageRating/this.marks.length;
		
		return averageRating;
		
	}
	
	public boolean otlichnik() {
		
		boolean otlichnik;
		
		if(	(this.marks[0] == 9 || this.marks[0] == 10) &&
			(this.marks[1] == 9 || this.marks[1] == 10) &&
			(this.marks[2] == 9 || this.marks[2] == 10) &&
			(this.marks[3] == 9 || this.marks[3] == 10) &&
			(this.marks[4] == 9 || this.marks[4] == 10) &&
			(this.marks[5] == 9 || this.marks[5] ==10)) 
			
			otlichnik = true;
		else 
			otlichnik = false;
		
		
		return otlichnik;			
	}
	
	public boolean studentImeetDva() {
		
		boolean dvoeshnik;
		
		if(	this.marks[0] < 3 || 
			this.marks[1] < 3 || 
			this.marks[2] < 3 || 
			this.marks[3] < 3 || 
			this.marks[4] < 3 || 
			this.marks[5] < 3)
			dvoeshnik = true;
		else
			dvoeshnik = false;
			
		return dvoeshnik;
	}
	
		
		
		

	

}
