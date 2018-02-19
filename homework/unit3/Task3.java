package by.htp.jd1_2018.homework.unit3;

//Задача на умножение квадратных матриц

import java.util.Random;
import java.util.Scanner;

public class Task3 {
	
	public static void main (String[] arqs) {
		
		int n = 0;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите размер квадратной матрицы: ");
		
		do{
			while(!sc.hasNextInt()) {
				System.out.println("Введите целое положиельное число =>>");
				sc.next();
			}
		
			n = sc.nextInt();
		
			if (n <= 0)
				System.out.println("Введите положительное число =>>");
		
		}while(n <= 0);
		
		int [][] mas1 = new int[n][n];
		int[][] mas2 = new int [n][n];
		int[][] sumMas12 = new int[n][n];
		int [][] multiplMas12 = new int[n][n];
		
		System.out.println("----------------------------------");
		randomMas(mas1);
		System.out.println("----------------------------------");
		randomMas(mas2);
		System.out.println("----------------------------------");
		
		sumMas(mas1, mas2, sumMas12);
		
		System.out.println("----------------------------------");
		
		multiplicationMas(mas1, mas2, multiplMas12, n);
		
		
		
		
	}
	
	public static void randomMas (int[][] mas) {
		
		Random ran = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			
			for (int j = 0; j < mas.length; j ++) {
				
				mas[i][j] = ran.nextInt(10);
				System.out.print("[" + mas[i][j]+ "] ");
				
			}
			
			System.out.println();
		}
		
	}
	
	public static void sumMas (int[][] mas1, int[][] mas2, int[][] mas3) {
		
		for(int i = 0; i < mas1.length; i++) {
			for(int j = 0; j< mas1[i].length; j++) {
				mas3[i][j] = mas1[i][j] + mas2[i][j];
				System.out.print("["  + mas3[i][j]+ "] ");
			}
			
			System.out.println();
		}
		
	}
	
	public static void multiplicationMas(int [][]a, int[][] b, int[][] c,int n) {
		
		for (int i = 0; i < n; i++) {
			for( int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					c[i][j] = c[i][j] + a[i][k]*b[k][j];
				}
				System.out.print(c[i][j] + "  ");
			}
			System.out.println();
		}
		
		
	}

}
