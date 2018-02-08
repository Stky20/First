package by.htp.jd1_2018.homework.unit2;

public class Task3_4 {

	public static void main(String[] args) {
		
	
		int[] mas = {97, 2, 641, 48, 756, 20, 0, 4, 763, 45};
		int[] mas1 = {3, 21, 45, 67, 79, 93, 1};
		
		System.out.print("Массив: ");
		
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.print("Массив2: ");
		
		for (int i = 0; i < mas1.length; i++) {
			System.out.print(mas1[i] + " ");
		}
		
		masChetn(mas);
		
		masChetn(mas1);
		
	}
	
	public static void masChetn(int[] a) {
		
		int chetnNumber = 0;
		
		for (int i = 0; i < a.length; i++) {
			if ((a[i] % 2) == 0) 
				chetnNumber = chetnNumber + 1;
			
		}
		
		System.out.println("\nПолучили колличество четных в массиве или длинну массива четных чисел: " + chetnNumber);
						
		int[] masChetn = new int[chetnNumber];
		
		if (chetnNumber != 0) {
		
//			for (int s = 0; s < masChetn.length; s++) {
//				System.out.print(masChetn[s] + " ");
//			}
		
			int ind = 0;
		
			for (int z = 0; z < a.length; z++) {
			
				if ((a[z] % 2) == 0) {
					masChetn[ind] = a[z];
					ind = ind + 1;
				}
				
			}
		
			System.out.println("Массив четных чисел: ");
		
			for (int j = 0; j < masChetn.length; j++) {
				System.out.print(masChetn[j] + " ");
			}
	
		} else {
			System.out.println("В массиве нет четных чиселю");
		}
	}
	
}

