package by.htp.jd1_2018.homework.unit1;

import java.util.Scanner;

public class Task7 {
	
	public static void main(String[] arqs) {
		
		double a = 0, b = 0, c = 0, d = 0;
		double res;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Введите числа a, b, c, d: ");
		
		while(!scan.hasNextDouble()) {
			System.out.println("Введите число!!!");
			scan.next();
		}
		
		if (scan.hasNextDouble()) {
			a=scan.nextDouble();
			System.out.println("а = " + a);
		}
		
		while(!scan.hasNextDouble()) {
			System.out.println("Введите число!!!");
			scan.next();
		}
		
		if (scan.hasNextDouble()) {
			b=scan.nextDouble();
			System.out.println("b = " + b);
		}
		
		while(!scan.hasNextDouble()) {
			System.out.println("Введите число!!!");
			scan.next();
		}
		
		if (scan.hasNextDouble()) {
			c=scan.nextDouble();
			System.out.println("c = " + c);
		}
		
		while(!scan.hasNextDouble()) {
			System.out.println("Введите число!!!");
			scan.next();
		}
		
		if (scan.hasNextDouble()) {
			d=scan.nextDouble();
			System.out.println("d =" + d);
		}
		
		if ((c != 0) && (d != 0)) {
			res = a / c * b / d - (a * b - c) / c * d;
			
		}else {
			System.out.println("Знаменатель равен нулю.");
			res = Double.NaN;
		}
		
		System.out.println("Результат: " + res);		
	}

}
