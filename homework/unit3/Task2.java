package by.htp.jd1_2018.homework.unit3;
//Задача на замену строк в массиве 
//нужно доделать проверку задаваемых номеров строк чтобы они небыли больше размера массива

import java.util.Random;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		int n = 0;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		Random ran = new Random();
		
		System.out.println("Введите размерность квадратного массива = >> ");
		
//		stupidityCheck(n);
		do{
			
			while(!sc.hasNextInt()) {
				System.out.println("Введите целое положиельное число =>>");
				sc.next();
			}		
			
			n = sc.nextInt();
		
			if (n<=0)
				System.out.println("Введите положительное число =>> ");
		
		}while(n<=0);
		
		
		System.out.println(n);
		
		int[][] mas = new int[n][n];
		
		randomizingMassiv(mas,ran);
		
		printMas(mas);
		
		System.out.println("Введите номера двух строк от 1 до " + n + "-й включительно, которые вы бы хотели поменять местами: ");
		
		int firstLine;
		int secondLine;
		
		do{
			while(!sc.hasNextInt()) {
				System.out.println("Введите целое положиельное число =>>");
				sc.next();
			}
		
			firstLine = sc.nextInt();
		
			if ((firstLine <= 0) && (firstLine > n))
				System.out.println("Введите положительное число от 1 до " + n + " =>>");
		
		}while(firstLine <= 0 && firstLine > n);
		
		System.out.println("Вы ввели номер первой строки: " + firstLine);
		firstLine = firstLine - 1;
		
		do{
			while(!sc.hasNextInt()) {
				System.out.println("Введите целое положиельное число от 1 до " + n + " =>>");
				sc.next();
			}
		
			secondLine = sc.nextInt();
			
			if ((secondLine <= 0) && (secondLine > n))
				System.out.println("Введите положительное число =>> ");
		
		}while((secondLine <= 0) && (secondLine > 0));
		
		System.out.println("Вы ввели номер второй строки: " + secondLine);
		secondLine = secondLine - 1;
		
		int[] zapasnaiaStroka = new int[n];
		
		zamenaStrok(mas, zapasnaiaStroka, firstLine, secondLine);
		
		System.out.println("после замены строк вы получили массив: ");
		
		printMas(mas);
				
	}
	
	public static void printMas (int[][] b) {
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j<b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}
	

	
	public static void randomizingMassiv(int[][] mas, Random ran) {
		for (int i = 0; i < mas.length; i++) {
			
			for (int j = 0; j<mas[i].length; j++) {
				mas[i][j] = ran.nextInt(10);
			}
		}
		
	}
	
	public static void zamenaStrok(int[][] a, int[] b, int c, int d) {
		
		for (int i = 0; i < b.length; i ++) {
				b [i] = a [c][i];
		}
		
		for (int i = 0; i < a.length; i ++) {
			a [c][i] = a[d][i];
		}
		
		for (int i = 0; i < a.length; i ++) {
			a [d][i] = b[i];
		}
		
		
	}

}
//	public static int stupidityCheck(int n) {      Почему- то не работает???????????????????
//			
//		@SuppressWarnings("resource")
//		Scanner scan = new Scanner(System.in);
//		
//		do{
//			
//			while(!scan.hasNextInt()) {
//				System.out.println("Введите целое положиельное число =>>");
//				scan.next();
//			}		
//			
//			n = scan.nextInt();
//		
//			if (n<=0)
//				System.out.println("Введите положительное число =>> ");
//		
//			}while(n<=0);
//		
//		return n;
//	}