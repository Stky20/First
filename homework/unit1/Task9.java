package by.htp.jd1_2018.homework.unit1;

import java.util.Scanner;

public class Task9 {
	
	public static void main(String[] arqs) {
		
		double a = 0, b = 0, h = 0,  min = 0, max = 0, x = 0, func;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Введите а и b отрезка [a, b] для вычисления на нём значения F(x):");
		
		while (!scan.hasNextDouble()) {
			System.out.println("Введите число");
			scan.next();
		}
		
		if (scan.hasNextDouble()) {
			a = scan.nextDouble();
		}
		
		System.out.println("a = " + a);
		
		while (!scan.hasNextDouble()) {
			System.out.println("Введите число");
			scan.next();
		}
		
		if (scan.hasNextDouble()) {
			b = scan.nextDouble();
		}
		
		System.out.println("b = " + b);
		
		max = Math.max(a, b);
		min = Math.min(a, b);
		
		System.out.println("Введите h - шаг нахождения  F(x) на отрезке [a,b]");
		
		while (!scan.hasNextDouble()) {
			System.out.println("Введите число");
			scan.next();
		}
							
		do {
			
			if (scan.hasNextDouble()) {
			h = scan.nextDouble();
			}
			
			if (h < 0) {
				System.out.println("Шаг h не должен быть отрицательными!!!");
			} 
				
			if (h  >( max - min )) {
				System.out.println("Шаг h не должен превышать длинну отрезка [a,b]!!!");
			
			}
		} while ((h < 0) || ( h  >( max - min )));
		
		System.out.println("h = " + h);
		
		if( h > 0 ) {
			
		System.out.print("Значение x:               ");
		System.out.println("Значение F(x):");		
		
			while((min <= max)) {
				x = min;
				func = 2 * Math.tan(x / 2) + 1;
				min = min + h;
				System.out.print("   " + x + "                    ");	
				System.out.println(func);
			}
		} else {
			
			func = 2 * Math.tan(a / 2) + 1;
			func = 2 * Math.tan(b / 2) + 1;
			
			System.out.print("   x = a = " + a + "               ");
			System.out.println("Значение F(a) = " + func);
			
			System.out.print("   x = b = " + b + "               ");
			System.out.println("Значение F(b) = " + func);
		}
		
			
	}

}
