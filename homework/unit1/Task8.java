package by.htp.jd1_2018.homework.unit1;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] arqs) {

		double a = 0, b = 0, c = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите а: ");

		while (!sc.hasNextDouble()) {
			System.out.println("Введите действительное число");
			sc.next();
		}

		if (sc.hasNextDouble())
			a = sc.nextDouble();

		System.out.println("a =" + a + "\n ");
		
		System.out.println("Введите b: ");

		while (!sc.hasNextDouble()) {
			System.out.println("Введите действительное число");
			sc.next();
		}

		if (sc.hasNextDouble())
			b = sc.nextDouble();

		System.out.println("b =" + b + "\n ");
		
		System.out.println("Введите c: ");

		while (!sc.hasNextDouble()) {
			System.out.println("Введите действительное число");
			sc.next();
		}

		if (sc.hasNextDouble())
			c = sc.nextDouble();

		System.out.println("c =" + c);

		if (a >= 0) {
			System.out.println("Квадрат a = " + Math.pow(a, 2));
		} else {
			System.out.println("Четвертая степень а = " + Math.pow(a, 4));
		}

		if (b >= 0) {
			System.out.println("Квадрат b = " + Math.pow(b, 2));
		} else {
			System.out.println("Четвертая степень b = " + Math.pow(b, 4));
		}

		if (c >= 0) {
			System.out.println("Квадрат c = " + Math.pow(c, 2));
		} else {
			System.out.println("Четвертая степень c = " + Math.pow(c, 4));
		}

	}

}
