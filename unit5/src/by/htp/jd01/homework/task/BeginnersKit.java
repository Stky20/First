package by.htp.jd01.homework.task;


import java.util.TreeSet;

public class BeginnersKit {
	
	TreeSet<Stationary> beginersKit;
	public BeginnersKit() {	
	}
	
	public BeginnersKit(Stationary stationaryOne) {
		beginersKit = new TreeSet<Stationary>();
		this.beginersKit.add(stationaryOne);
	}
	
	public BeginnersKit(NameComparator comparator) {
		beginersKit = new TreeSet<Stationary>(comparator);
		
	}
	public BeginnersKit(PriceandNameComparator comparator) {
		beginersKit = new TreeSet<Stationary>(comparator);
		
	}	
	
	public BeginnersKit(Stationary stationaryOne, NameComparator comparator) {
		beginersKit = new TreeSet<Stationary>(comparator);
		this.beginersKit.add(stationaryOne);
	}
	
	public BeginnersKit(Stationary stationaryOne, PriceandNameComparator comparator) {
		beginersKit = new TreeSet<Stationary>(comparator);
		this.beginersKit.add(stationaryOne);
	}
	
	public void add(Stationary stat) {
		this.beginersKit.add(stat);
	}
	public void add(Stationary stat, Stationary stat1) {
		this.beginersKit.add(stat);
		this.beginersKit.add(stat1);
	}
	public void add(Stationary... stat) {
		for(Stationary st: stat) {
			this.beginersKit.add(st);
		}
	}

	public void remove(Stationary stat) {
		this.beginersKit.remove(stat);
	}

	public void print() {
		
		int i = 1;
		for(Stationary st: beginersKit) {
			System.out.print(i + ". ");
			st.print();
			i++;
		}
	}

}



