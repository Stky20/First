package homework.hw1;

import java.util.*;

public class Thirdhw {
	
	public static void main(String[] arqs){
		
		Scanner sc = new Scanner(System.in);
		double a = 0, b = 0, c = 0, d, e;
		
		System.out.println("Введите a= ");
		
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}
		
		System.out.println("Введите b= ");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		}
		
		if (a > b) {
			
			System.out.println("Введите c= ");
					
				if (sc.hasNextDouble()) {
				c = sc.nextDouble();
				}
			
				System.out.println("b + c= "+ (b + c));
		
		}else if (a == b) {
			
			System.out.println("Конец");
		
		} else if (a < b){
			System.out.println("Введите c= ");
			
			if (sc.hasNextDouble()) {
			c = sc.nextDouble();
			}
			
			System.out.println(a + b + c +"Новый Год!");
			
		}
		
		
	}

}
