package by.htp.jd1_2018.homework;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] arqs) {
		
		int n = 0, number = 0, sum = 0, count1 = 0, count2 = 0;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ведите колличество строк: ");
		
			do {
				while(!scan.hasNextInt()) {
					System.out.println("Неверное n ");
					scan.next();
				}
				
				n=scan.nextInt();
				
			}while(n<0);
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("> ");
				
				while(!scan.hasNextInt()) {
					System.out.println("Ведите целое число ");
					scan.next();
				}
			
			number = scan.nextInt();
			
			if (number%2 == 0) {
				count1 = count1++;
			}else if(number%3 == 0) {
				sum += number;
			}else if(Math.abs(number) < 3) {
				count2 = count2++;
			}
		}
	
		System.out.println("Колличество четных чисел: " + count1);
		System.out.println("Сумма чисел кратных трем: " + sum);
		System.out.println("Колличество чисел модуль которых меньше 3: " + count2);

	}
}
	
