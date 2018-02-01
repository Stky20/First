package by.htp.jd1_2018.homework.unit1;

import java.util.Scanner;

public class Task3 {
	
	public static void main(String[] arqs) {
		
		double a = 0, b = 0, c = 0;   //Программа сама потребовала инициализировать переменные? Чёт я забыл почему???????????????????????
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите a: ");
		
			while(!sc.hasNextDouble()) {
				System.out.println("Вы ввели неверное a\nВведите а: ");// Почему при вводе десятичной дроби с "." выдает: вы ввели неверное a, b, c??????????????????????????????????????????????????????
				sc.next();
			}
			
		if(sc.hasNextDouble())//Нужна ли эта строка в нашем случае???????????????????????????? я её везде подабавлял
			a = sc.nextDouble();	
			
		System.out.println("а= " + a);
		
		System.out.println("Введите b: ");
		
			while(!sc.hasNextDouble()) {
				System.out.println("Вы ввели неверное b\nВведите b: ");
				sc.next();
			}
			
			if(sc.hasNextDouble())//Нужна ли эта строка в нашем случае???????????????????????????? я её везде подабавлял
				b = sc.nextDouble();
		
		System.out.println("b= " + b);
						
			if (a > b) {
				
				System.out.println("Ведите с: 5");
					while(!sc.hasNextDouble()) {
						System.out.println("Вы ввели неверное c\nВведите с: ");
						sc.next();
					}
					
					if(sc.hasNextDouble())//Нужна ли эта строка в нашем случае???????????????????????????? я её везде подабавлял
						c = sc.nextDouble();
				
					System.out.println("c = "+ c + "\n\nb + c = " + (b + c));
			
			}else if (a == b) {
				
				System.out.println("Конец");
				
			}else if (a < b){
				System.out.println("Ведите с: ");
					while(!sc.hasNextDouble()) {
						System.out.println("Вы ввели неверное c\nВведите с: ");
						sc.next();
					}
					
				if(sc.hasNextDouble())//Нужна ли эта строка в нашем случае???????????????????????????? я её везде подабавлял
					c = sc.nextDouble();
					
					System.out.println("c = "+ c + "\n\na + b + c = " + (a + b + c) + " Новый год!");
			}
		
	}

}
