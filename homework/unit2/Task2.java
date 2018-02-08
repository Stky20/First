package by.htp.jd1_2018.homework.unit2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		double elMas = 0;
		double[] mas = new double[5];
		
		System.out.println("Введите элементы массива ==>");
		
		for (int i = 0; i < mas.length; i++) {
			
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			
			while(!sc.hasNextDouble()) {
				System.out.println("Введите число ");
				sc.next();
			}
		
			elMas = sc.nextDouble();
			mas[i] = elMas;
		}
		
		
		maxInMas (mas);
		
		minInMas (mas);
		
		sortMas (mas);
			
		
		
	}
	
	public static void maxInMas (double[] a) {
		
		int index = 0;
		double max = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(max < a[i]) {
				index = i;
				max = a[i];
			}
		}
		System.out.println("Максимальный элемент массива равен  " + max + "его индекс: " + index);
	}
	
	public static void minInMas (double[] a) {
		
		int index = 0;
		double min = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(min > a[i]) {
				index = i;
				min = a[i];
			}
		}
		System.out.println("Минимальный элемент массива равен  " + min + " его индекс: " + (index + 1));
	}
	
	public static void sortMas (double[] a) {
		
		int indexMin = 0;
		
		System.out.println("Массыв отсортированный по возрастанию: ");
		
		for (int i = 0; i < a.length; i++) {
			indexMin = i;
			
			for (int j = i + 1; j < a.length; j++) {
				
				if (a[j] < a[indexMin]) {
					indexMin = j;
//					double b = a[i];
//					a[i] = a[j];
//					a[j] = b;
				}
				
			}
			
			double b = a[i];
			a[i] = a[indexMin];
			a[indexMin] = b;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
			System.out.println();
			
	}

}
