package by.htp.jd1_2018.homework.unit3.fraction;

public class Main {
	
	public static void main (String[] arqs) {
		
		Fraction fr1 = new Fraction();
		Fraction fr2 = new Fraction(2,8);
		
		fr1.setNumerator(1);
		fr1.setDenominator(2);
		
		Fraction fr3 = fr1.sumFraction(fr2);
		
		System.out.println(fr1.getNumerator() + "/" + fr1.getDenominator());
		System.out.println(fr2.getNumerator() + "/" + fr2.getDenominator());
		System.out.println(fr3.getNumerator() + "/" + fr3.getDenominator());
		
		fr3 = fr3.sumFraction(3);
		
		System.out.println(fr3.getNumerator() + "/" + fr3.getDenominator());
		
		
		int k = 4;
		
		
		Fraction[] fr6 = new Fraction[k];
		
		fr6[0] = new Fraction (4, 8); 
		fr6[1] = new Fraction (5, 9); 
		fr6[2] = new Fraction (11, 4); 
		fr6[3] = new Fraction (8, 16); 
		
		System.out.println("---------------------------------");
		
		for (int i = 0; i < fr6.length; i++) {
			Fraction fr = fr6[i];
			System.out.print("[" + fr.getNumerator() + "/" + fr.getDenominator() + "] ");
		}
		
		
	}

}
