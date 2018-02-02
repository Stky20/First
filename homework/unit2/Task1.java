package by.htp.jd1_2018.homework.unit2;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
	
	public static void main (String[] arqs) {
		
		int size;
		
		size = readSizeFromConsole();
		
		System.out.println("Size " + size);
		
		int[] mas = new int[size];
		
		for (int i = 0; i < mas.length; i++) {
			mas[i] = randomInt();
		}
		
		printOurArray("Получился массив:  ", mas);
		
		streightSort(mas); 							//Unit2 Task1
		
		printOurArray("Получился массив:  ", mas);
		
		streightSort2(mas);							//Unit2 Task1
		
		printOurArray("Получился массив:  ", mas);
		
		bubbleSort(mas);
		
		printOurArray("Получился массив:  ", mas);
		
		System.out.println("Длинна масива: " + mas.length);
		
	}
	
	public static int readSizeFromConsole() {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);	
		
		int x= 0;
		
		System.out.println("Введите длинну мссива: ");
		
		while (!scan.hasNextInt()) {
			scan.next();
			System.out.println("Введите число: ");
		}
		
		x = Math.abs(scan.nextInt());
		
		return x;
		
	}
	
	public static int randomInt() {
		
		Random randomArray = new Random();
		
		int x = 0;
		
		x = randomArray.nextInt(100);
		
		return x;		
		
	}
	
	public static void printOurArray(String message, int[] mas) {
		
		System.out.println(message);
		
		for(int i = 0; i < mas.length; i++) {
			
			System.out.println("значние " + (i + 1) + "-го элемента массива: " + mas[i]);
			
		}
			
	}
	
	public static void streightSort(int[] mas) {   							//Unit2 Task1
		
		for (int i = 0; i < mas.length; i++) {
			
			for (int j = i + 1; j < mas.length; j ++) {
				
				if (mas[j]< mas[i]) {
					
					int min = mas[i];
					mas[i] = mas[j];
					mas[j] = min;
					
				}
				
			}
			
		}
		
	}
	
	public static void streightSort2(int[] mas) {  							//Unit2 Task1
		
		for (int i = 0; i < mas.length; i++) {
			
			int index = i;
			
			for (int j = i + 1; j < mas.length; j ++) {
				
				if (mas[j]< mas[i]) {
					index = j;
				}
				
			int min = mas[i];
			mas[i] = mas[index];
			mas[index] = min;
			}
			
		}
		
	}
	
	public static void bubbleSort(int[] mas) {
		
		for (int i = 0; i < mas.length; i++) {
			
			for (int j = 0; j < mas.length - i - 1; j ++) {
				
				if (mas[j] < mas[j + 1]) {
					int max = mas[j];
					mas[j] = mas[j + 1];
					mas[j + 1] = max;
				}
				
			
			}
			
		}
		
	}

}
