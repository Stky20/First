package homework.hw1;

import java.util.*;

public class Thirdhw {
	
	public static void main(String[] arqs){
		
		Scanner sc = new Scanner(System.in);
		double a = 0, b = 0, c = 0, d, e;
		
		System.out.println("������� a= ");
		
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}
		
		System.out.println("������� b= ");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		}
		
		if (a > b) {
			
			System.out.println("������� c= ");
					
				if (sc.hasNextDouble()) {
				c = sc.nextDouble();
				}
			
				System.out.println("b + c= "+ (b + c));
		
		}else if (a == b) {
			
			System.out.println("�����");
		
		} else if (a < b){
			System.out.println("������� c= ");
			
			if (sc.hasNextDouble()) {
			c = sc.nextDouble();
			}
			
			System.out.println(a + b + c +"����� ���!");
			
		}
		
		
	}

}
