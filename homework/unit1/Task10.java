package by.htp.jd1_2018.homework.unit1;

import java.util.Scanner;

public class Task10 {
	
	public static void main (String[] arqs) {
		
		double x = 0, fun = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Введите значение x: ");
		
		while (!sc.hasNextDouble()) {
			System.out.println("Введите число:");
			sc.next();
		}
		
		
		while(sc.hasNextDouble()) {
			x = sc.nextDouble();
			if (x <= -3) {
				fun = 9;
				System.out.println("F(x) = " + fun);
			} else if (x > 3){
				fun = 1 / ( x * x + 1);
				System.out.println("F(x) = " + fun);
			} else {
				System.out.println("При заданном x функция не имеет решений.");
			}
		
		}
			
	}

}
