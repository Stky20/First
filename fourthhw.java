package homework.hw1;

import java.util.*;

public class fourthhw {

	public static void main(String[] arqs){
		
		Scanner sc = new Scanner(System.in);
		
		double a = 0, b = 0, c = 0;

		System.out.println("������� a= ");
		
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}
		
		System.out.println("������� b= ");
		
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		}
		
		if (a == b) {
			System.out.println("����� ����� ���!");
		} else {
			System.out.println("������� �: ");
			if (sc.hasNextDouble()) {
				c = sc.nextDouble();
			}
			System.out.println("a + b + c= " + (a + b + c));
			System.out.println("a * a + b * b = " + (a * a + b * b));
			System.out.println("Chelsea FC");
			
		}
			
		}

}
