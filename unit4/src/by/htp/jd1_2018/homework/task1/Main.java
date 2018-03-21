package by.htp.jd1_2018.homework.task1;

public class Main {
	
	public static void main(String[] arqs) {
		
		Student st1 = new Student("Sergeev", "Niko", 5, 6, 7, 8, 9, 3);
		Student st2 = new Student("Almatov", "Leha", 2, 5, 6, 4, 7, 5);
		Student st3 = new Student("Shatov", "Vadik", 8, 7, 10, 3, 6, 5);
		Student st4 = new Student("Pivnov", "Oleg", 2, 3, 1, 2, 8, 4);
		Student st5 = new Student("Shnurov", "Jenia", 6, 7, 3, 2, 4, 9);
		Student st6 = new Student("Mihalevich", "Fedos", 9, 9, 9, 10, 10, 9);
		Student st7 = new Student("Korz", "Denis", 10, 10, 10, 9, 9, 9);
		Student st8 = new Student("Sergeev", "Niko", 9, 8, 7, 9, 8, 7);
		
		//Group group = new Group("JD00");
		
		System.out.println("Kolichestvo otlichnikov iz ukazannoj gruppu studentov: " 
							+ Group.kolichestvoOtlichnikov(st1, st2, st3, st4, st5,st6, st7,st8));
		
		System.out.println("Kolichestvo dvoeshnikov iz ukazannoj gruppu studentov: " 
							+ Group.kolichestvoDvoeshnikov(st1, st2, st3, st4, st5,st6, st7,st8));
		
		System.out.println("Sredniaja ocenka vseh studentov: " 
							+ Group.middleroupMark(st1, st2, st3, st4, st5, st6, st7, st8));
		
	}

}
