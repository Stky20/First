package by.htp.jd1_2018.homework.unit3.task5;

//Задача на создание классов Student и Customer

import java.util.Date;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Student s1;
		Student s2;
		
		Customer c1;
		Customer c2;
		
		s1 = new Student(1, "Панасевич", "Юрий", "Владимирович", "Минск", "Инф_технологии", 
							new Date(1995-1900,8,6), 85642315, 1);
		s2 = new Student(1, "Герезо", "Алексей", "Геннадьевич", "Брест", "Инф_технологии",
							new Date(1992-1900,10,24), 7596246, 3);
		
		c1 = new Customer ("cust1", "Сергеев", "Илья", 
							"Васильевич", "Саратов", new Date(1950 - 1900, 5, 6), 
							"3461 1823 4587 6954", 7564964, 1689548534);
		
		c2 = new Customer ("cust2", "Алевсеев", "Александр", 
				"Александрович", "Львов", new Date(1969 - 1900, 11, 5), 
				"1976 4956 4915 9766", 1763485, 186846549);
		
		s1.show();
		
		s2.show();
		
		c1.show();
		
		c2.show();
		

	}

	

}
