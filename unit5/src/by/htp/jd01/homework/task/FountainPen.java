package by.htp.jd01.homework.task;

public class FountainPen extends Pen{// implements Comparable<Stationary>{
	
	boolean turnedOnOrOff = false;

	public FountainPen(String name, int price) {
		super(name, price);
	}

	public boolean isTurnedOnOrOff() {
		return turnedOnOrOff;
	}

	public void setTurnedOnOrOff(boolean turnedOnOrOff) {
		this.turnedOnOrOff = turnedOnOrOff;
	}
	
	public void write() {
		if(turnedOnOrOff == false) {
			System.out.println("Fountain pen don`t write");
		}else {
			System.out.println("Fountain pen writes");
		}
		
	}	
	
	public void print() {
		System.out.println("name: " + name + "; " + "price: " + price + "$");
		System.out.println("---------------------------------------------");
	}
	
//	public int compareTo(Stationary other) {		
//		return this.price - other.price;
//	}
//
//	
	
	

}
