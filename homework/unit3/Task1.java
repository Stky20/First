package by.htp.jd1_2018.homework.unit3;

//Задача: найти максимальный элемент каждого столбца матиицы n*n

import java.util.Random;
import java.util.Scanner;


public class Task1 {
	
	public static void main(String[] arqs) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Ввeдиту размер квадратной матрицы: ");
		
		do{
			
			while(!sc.hasNextInt()) {
				System.out.println("Введите целое положиельное число =>>");
				sc.next();
			}
		
			n = sc.nextInt();
		
			if (n<=0)
				System.out.println("Введите положительное число =>> ");
		
		}while(n<=0);
	
		
		
		int[][] a = new int[n][n];
		
//		printMas(a);
		
		for(int i = 0; i < a.length; i++ ) {
			for (int j = 0; j < a[i].length; j ++) {
				Random random = new Random();
				a[i][j] = random.nextInt(10);
			}
		}
		
		printMas(a);
		
		int indexMaxI = 0;
				
		for(int j = 0; j <= (n - 1); j++) {
			
			for(int i = 1; i <= (n - 1); i++) {
				if (a[indexMaxI][j] < a[i][j])
					indexMaxI = i;
					
			}
			System.out.println("Максимальный элемент матрицы в первом столбце равен: " + a[indexMaxI][j]);
			indexMaxI = 0;
		}
		
		
		
		
		
	}
	
	public static void printMas(int[][] b) {
			for(int i = 0; i < b.length; i++ ) {
			
			for (int j = 0; j < b[i].length; j ++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		
		
	}

}

	
