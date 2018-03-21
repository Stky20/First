package by.htp.jd01.homework.task;

abstract class Stationary implements Comparable<Stationary> {
	String name;
		int price;
	
	public  Stationary (String name, int price)	{
		this.name = name;
		this.price = price;
		
	}			
	
	public int compareTo(Stationary other) {		
		if (this.price == other.price) 
			return (other.name.compareTo(name));
		else 
			return this.price - other.price;
		
	};
	
	public abstract void write();
	
	public abstract void print();
	
}
	
	
	
//	public Stationary(String name, String producerName, int price) {
//		this.name = name;
//		this.producerName = producerName;
//		this.price = price;
//				
//	}
	
	
	


