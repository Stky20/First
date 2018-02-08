package by.htp.jd1_2018.homework.unit2;

public class Task3_3 {
	
	public static void main (String[] arqs) {
		
		int[] mas = {9, 15, 94, 95, 102, 200};
		
		int[] mas1 = {9, 78, 10, 10, 5, 999, 7};
		
		ifMasRais(mas);
		
		ifMasRais(mas1);
	}
	
	public static void ifMasRais (int[] a) {
		
		int index = 0;
		
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] < a[i+1]) {
				index = index + 1;
			}
		}
		
		if (index == (a.length - 1)) {
			System.out.println("Массив возрастающий.");
		} else {
			System.out.println("Массив не возрастающий.");
		}
	}

}
