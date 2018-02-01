package by.htp.jd1_2018.homework.unit1;

import java.util.Scanner;

public class Task4 {
	
	public static void main(String[] arqs) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		double a = 0, b = 0, c = 0;

		System.out.println("Введите a= ");
		
		// ОПЯТЬ та же ерунда - вводишь дробь с "." выдает: Вы ввели не верное a, b, c??????????????????????
			while(!sc.hasNextDouble()) {
				System.out.println("Вы ввели неверное a\nВведите а: ");
				sc.next();
			}
			if (sc.hasNextDouble())//Нужна ли эта строчка??????? Кажется разобрался, но...
				a = sc.nextDouble();
			
			System.out.println("a = " + a);
		
		
		System.out.println("Введите b= ");
		
			while(!sc.hasNextDouble()) {
				System.out.println("Вы ввели неверное b\nВведите b: ");
				sc.next();
			}
		
			if (sc.hasNextDouble())
				b = sc.nextDouble();
		
			System.out.println("b = " + b);
		
		if (a == b) {
			
			System.out.println("скоро Новый Год!");
			
		} else {
			
			System.out.println("Введите с: ");
			
				while(!sc.hasNextDouble()) {
					System.out.println("Вы ввели неверное c\nВведите c: ");
					sc.next();
				}
			
				if(sc.hasNextDouble())
					c = sc.nextDouble();
			
			System.out.println("a = " + a);
			System.out.println("a + b + c= " + (a + b + c));
			System.out.println("a * a + b * b = " + (a * a + b * b));
			System.out.println("Chelsea FC");
			
		}
			
		}


	}


