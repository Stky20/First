package by.htp.jd1_2018.homework.unit1;

import java.util.Scanner;

public class Task2 {
	
	public static void main(String[] arqs) {
		
		double a = 0, b = 0, c = 0, d;  // Программа не требовала инициализировать переменные
		// в отличее от Таск 3   ПОЧЕМУ?????????????????????????????????????????????????
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Введите a: ");
			
			while(!scan.hasNextDouble()) { 
				
			//Почему при вводе дроби с "." значения  a, b и c выдает неверное значение???????????????????????????
				
				System.out.println("Вы ввели неверое значение а!!!\n\nВведите а: ");
				scan.next(); // не забыть про эту строку
			}
		
		if(scan.hasNextDouble())//Нужна ли эта строка в нашем случае???????????????????????????? я её везде подабавлял
			a = scan.nextDouble();
		
		System.out.println("Введите b: ");
		
			while(!scan.hasNextDouble()) {
				System.out.println("Вы ввели неверное значение b!!!\n\nВведите b: ");
				scan.next();
			}
		
		if(scan.hasNextDouble())//Нужна ли эта строка в нашем случае???????????????????????????? я её везде подабавлял
			b = scan.nextDouble();
		
		System.out.println("Введите с: ");
		
			while(!scan.hasNextDouble()) {
				System.out.println("Вы ввели неверное значение c!!!\n\nВведите с: ");
				scan.next();
			}

		if(scan.hasNextDouble())//Нужна ли эта строка в нашем случае???????????????????????????? я её везде подабавлял
			c = scan.nextDouble();
		
		d = a * a - (b - c)*(b - c) + Math.log(b * b + 1);
		
		System.out.println("d = " + d);
	}

}
