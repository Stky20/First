package by.htp.jd1_2018.homework.task2;

public class Main {

	public static void main(String[] args) {
		
		Abiturient ab1 = new Abiturient("Ivaov", "Ivan", 5, 4, 7, 7.53);
		Abiturient ab2 = new Abiturient("Muhamed", "Abdul", 5, 8, 6, 6.834);
		Abiturient ab3 = new Abiturient("Ngolo", "Ibrahim", 8, 4, 6, 7.224);
		Abiturient ab4 = new Abiturient("Usupov", "Anvar", 9, 8, 7, 8.642);
		Abiturient ab5 = new Abiturient("Ba", "Do", 4, 6, 8, 8.246);
		Abiturient ab6 = new Abiturient("Hfqo", "Fqnfa", 3, 5, 6, 4.256);
		Abiturient ab7 = new Abiturient("Ffa", "Ofan", 7, 7, 6, 8.245);
		Abiturient ab8 = new Abiturient("dfa", "0fja", 7, 7, 8, 7.214);
		Abiturient ab9 = new Abiturient("fad", "fad", 7, 7, 8, 7.314);
		Abiturient ab10 = new Abiturient("fad", "faf", 6, 6, 7, 7.648);
		
		Abiturient.showAbiturient(ab4);
		
		System.out.println("--------------------------------------------------------------------------");
		
		Abiturient.showAllAbiturients(ab1, ab2, ab3, ab4, ab5, ab6, ab7, ab8, ab9, ab10);
		
		System.out.println("--------------------------------------------------------------------------");
		
		Abiturient[] sortedAb = Abiturient.sortedAbiturients(ab1, ab2, ab3, ab4, ab5, ab6, ab7, ab8, ab9, ab10);
		
		Abiturient.showAllAbiturients(sortedAb);
		
		System.out.println("--------------------------------------------------------------------------");
		
		Abiturient.showAllAbiturients(Abiturient.passedAbiturientsRegister(5, sortedAb));

	}

}
