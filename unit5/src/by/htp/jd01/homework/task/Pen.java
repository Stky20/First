package by.htp.jd01.homework.task;

public class Pen extends Stationary{// implements Comparable<Stationary> {
		
	public Pen(String name, int price) {
		super(name, price);
	}
	
	public void write() {
		System.out.println("Pen writs");
		
	}	

	public void print() {
		System.out.println("name: " + name + "; " + "price: " + price + "$");
		System.out.println("---------------------------------------------");
	}
	
	
	//
//	@Override
//	public int compareTo(Stationary other) {		
//		return this.price - other.price;
//	}

	
}
