package homework.hw1;

public class Firsthw {

	public static void main(String[] arqs) {
		
		double a; //катет 1
		double b; //катет 2
		double c; //гипотенуза
		a = 3;
		b = 8;
		c = Math.sqrt(a * a + b * b);
		double S; //площадь треугльника по двум катетам
		S = 0.5 * a * b;
		System.out.println("c = " + c);
		System.out.println("S = " + S);
	
	}
}
