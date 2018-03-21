package by.htp.jd01.homework.task;

public class Main {

	public static void main(String[] args) {
		Stationary st1 = new Pencil ("Amster", 8);
		Pencil pencil1 = new Pencil ("Sam", 11);
		Stationary st2 = new Pen ("Amster", 13);
		Stationary st3 = new Pen ("Sam", 16);
		Stationary st4 = new Pen ("Bomster", 13);
		Stationary st5 = new FountainPen ("Amster", 19);
		Stationary st6 = new FountainPen ("Cramp", 7);
		Stationary st7 = new FountainPen ("Sam", 23);
		Stationary st8 = new Pencil ("Cramp", 5);
		Pen st9 = new Pen ("Cramp", 9);
		FountainPen st10 = new FountainPen ("Cramp", 23);
		
		pencil1.write();                                     //Проверяю как они у меня пишут :)
		st2.write();
		st5.write();
		//System.out.println(st5.turnedOnOrOf);             //через базовую ссылку не видит поле подкласса
		FountainPen st11 = (FountainPen)st5;
		System.out.println(st11.isTurnedOnOrOff());         //проверяю включена ли авторучка
		st11.setTurnedOnOrOff(true);                        //включаю ручку
		System.out.println("After turning on fountain pen: ===>");
		st11.write();
		st5.write();                                        // две ссылки на один объект
		
		System.out.println("-------------------------------------------------------------------------------");
		
		
		BeginnersKit kit1 = new BeginnersKit(st1);                                    // сортировка естественное сравнение по comparable
		kit1.add(pencil1);
		kit1.add(st2, st3, st4, st5, st6, st7, st8, st9, st10);
		kit1.print();
		
		System.out.println("********************************************************************************");
		
		NameComparator comparator1 = new NameComparator();                          //сортировка компаратором по имени
		BeginnersKit kit2 = new BeginnersKit(comparator1);
		kit2.add(st2, st3, st4, st5, st6, st7, st8, st9, st10, st1, pencil1);
		kit2.print();
		
		System.out.println("********************************************************************************");
		
		PriceandNameComparator comparator2 = new PriceandNameComparator();             // сортировка компаратором по цене и имени вобратном порядке
		BeginnersKit kit3 = new BeginnersKit(comparator2);
		kit3.add(st2, st3, st4, st5, st6, st7, st8, st9, st10, st1, pencil1);
		kit3.print();
		

	}

}
