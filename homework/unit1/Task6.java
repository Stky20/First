package by.htp.jd1_2018.homework.unit1;

import java.util.Scanner;

public class Task6 {
	
	public static void main(String[] arqs) {
		
		int n = 0, number = 0, usek = 0, usek1 = 0, count1 = 0, count2 = 0, count3 =0;
		double m = 0;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ведите колличество целых и вещественных чисел: ");
		
		do {	
			while(!sc.hasNextInt()) {
				System.out.println("Неверное n попробуйте еще:");
				sc.next();
			}
		}while(n<0);
			
		n = sc.nextInt();
		System.out.println("Введите " + n + " целых чисел> ");
	
		for(int i = 0; i < n; i++) {
			
			System.out.println("> ");
			
				while(!sc.hasNextInt()) {
					System.out.println("Ведите целое число: ");
					sc.next();
				}
			number = sc.nextInt();	
			System.out.println("Введено целое число: " + number);
		}
		
		System.out.println("Введите " + n + " вещественных чисел> ");
		
		for(int i = 0; i < n; i++) {
			while(!sc.hasNextDouble()) {
				System.out.println("Ведите вещественное число: ");
				sc.next();
			}
			
			m = sc.nextDouble();
			System.out.println("Вещественное число: " + m);
			
			usek = (int)m;
			System.out.println("Вещественное число после усечения: " + usek);
			
			if (usek%2 == 0)
				count1++;
			
			if (usek > 15)
				count2++;
			
			if (usek%2 == 0)
				usek1 = usek;
			
			if (usek1 >15)
				count3++;
		}
		
		System.out.println("Четных чисел среди усеченных: " + count1);
		System.out.println("Чисел >15 среди усеченных: " + count2);
		System.out.println("Четных чисел >15 среди усеченных: " + count3);
		
	}

}
