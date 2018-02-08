package by.htp.jd1_2018.homework.unit2;

import java.util.Random;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		int n = 0;
		int k = 0;
		
		System.out.println("Введите колличество элементов массива n:");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		

		while (!sc.hasNextInt()) {
			System.out.println("Введите число:");
			sc.next();
		}

		n = sc.nextInt();
		
//      		
//		while (n <= 0) { 
//			System.out.println("Введите неотрицательное число ");
//			sc.next();
//		}
				
		int[] mas = new int[n];
		
		masInicializeAndPrint(mas);
		
		System.out.println("\nВведите k ");
		
		while (!sc.hasNextInt()) {
			System.out.println("Введите число:");
			sc.next();
		}
		
		k = sc.nextInt();
		
		sumKratnK(mas, k);

	}
	
	public static void masInicializeAndPrint(int[] a) {
		Random ran = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = ran.nextInt(100);
		}
		
		System.out.println("Имем следующий массив");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static void sumKratnK (int[] a, int b) {
		
		int sumKratnK = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % b == 0) {
				sumKratnK = sumKratnK + a[i];
			}
		}
		
		System.out.println("Сумма элементов массива кратных k : " + sumKratnK);
	}

}
