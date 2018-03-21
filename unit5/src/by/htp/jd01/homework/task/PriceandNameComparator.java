package by.htp.jd01.homework.task;

import java.util.Comparator;

public class PriceandNameComparator implements Comparator<Stationary>{
	// Сравнивает сначала по цене потом по названию, при этом сортировать будет в обратном порядке

	@Override
	public int compare(Stationary o1, Stationary o2) {
		String name1 = o1.name;
		String name2 = o2.name;
		
		if (o1.price < o2.price) {
			return 1;
		}else if (o1.price > o2.price) {
			return -1;
		} else {
			if(name1.compareTo(name2) == 0){
				return 0;
			}else {
				return -(name1.compareTo(name2));
			}
		}
		
	}

}
