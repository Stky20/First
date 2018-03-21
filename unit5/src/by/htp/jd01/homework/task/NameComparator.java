package by.htp.jd01.homework.task;

import java.util.Comparator;

public class NameComparator implements Comparator<Stationary> {
	
	// Будет сравнивать по названию, а если равны то по цене

	@Override
	public int compare(Stationary stat1, Stationary stat2) {
		String name1 = stat1.name;
		String name2 = stat2.name;
		
		if(name1.compareTo(name2) == 0){
			return stat1.price - stat2.price;
		}else {
			return (name1.compareTo(name2));
		}
		
	}

}
