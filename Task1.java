package by.htp.jd1_2018.homework;

import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] arqs) {
		
		int a = 0, b = 0;
		double c = 0, s = 0;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Нахождение гиппотенузы и площади прямоугольного треугольника по двум катетам.\n"+"");
//		System.out.println("");				
		do {	
			System.out.println("Введите положительное целочисленое значение катета а: ");
		
			while(!sc.hasNextDouble()) {
				System.out.println("Вы ввели неверное значение a");
				System.out.println("Введите положительное целочисленное значение катета a: ");
				sc.next(); //ВОПРОС, почему так?!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			}
			
			a = sc.nextInt();
			
		}while(a <= 0); 
				
		System.out.println("а= " + a);
		
		do {
			System.out.println("Введите положительное цельчисленое значение катета b: ");
			
			while(!sc.hasNextDouble()) {
				System.out.println("Вы ввели неверное значение b");
				System.out.println("Введите положительное целочисленное значение катета b: ");
				sc.next();
			}
			
			b = sc.nextInt();
			
		}while(b <= 0);
		
		System.out.println("b= " + b);
		
		c = Math.sqrt(a * a + b * b);
		
		System.out.println("Гипотенуза с =" + c);
		
		s = a * b / 2;
		
		System.out.println("Площадь треугольника s = " + s);
	}
	

}
