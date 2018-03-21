package by.htp.jd01.homework.task;

public class Pencil extends Stationary{ //implements Comparable<Stationary> {
			
	public Pencil(String name, int price) {
		super(name, price);
		}
	
	public void write() {
		System.out.println("Pencil writs");
		
	}	
	
	public void print() {
		System.out.println("name: " + name + "; " + "price: " + price + "$");
		System.out.println("---------------------------------------------");
	}

//	@Override
//	public int compareTo(Stationary other) {		
//		return this.price - other.price;
//	}
//
//	
	

}
