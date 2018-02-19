package by.htp.jd1_2018.homework.unit3.fraction;

// Класс дробь, по сути то же, что и на занятии, и добавить нечего

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction () {
		numerator = 0;
		denominator = 1;
	}
	
	public Fraction (int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		
		
	}
	
	
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public Fraction sumFraction(Fraction obj) {
		
		int newNumerator;
		int newDenominator;
		
		newDenominator = this.denominator * obj.denominator;
		newNumerator = this.numerator * obj.denominator + obj.numerator * this.denominator;
		
		Fraction newFraction = new Fraction(newNumerator, newDenominator);
		
		newFraction.sokrFraction();
				
		return newFraction;
		
	}
	
	public Fraction sumFraction(int number) {
		
		int newNumerator;
		int newDenominator;
		
		newDenominator = this.denominator ;
		newNumerator = this.numerator * 1 + number * this.denominator;
		
		Fraction newFraction = new Fraction(newNumerator, newDenominator);
				
		return newFraction;
		
	}
	
	public void sokrFraction() {
		
		int nod;
		
		if(numerator < denominator) 
			nod = numerator;
		else 
			nod = denominator;
			
		while (!((numerator % nod == 0)&&(denominator % nod == 0))){
			nod--;
		}
		
		numerator = numerator / nod;
		denominator = denominator / nod;
					
	}
	

}
