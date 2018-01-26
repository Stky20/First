package homework.hw1;

import java.util.Scanner;

public class Secondhw {

	public static void main(String[] arqs) {
		
		double a = 0, b = 0, c = 0, d;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("¬ведите a: ");
		if (scan.hasNextDouble()) {
			a = scan.nextDouble();
		} 		 
		
		System.out.println("¬ведите b: ");
		if (scan.hasNextDouble()) {
			b = scan.nextDouble();
		}
		
		System.out.println("¬ведите c: ");
		if (scan.hasNextDouble()) {
			c = scan.nextDouble();
		}
		
		d = a * a - (b - c)*(b - c) + Math.log(b * b +1);
		
		System.out.println("d= " + d);
	}
}
