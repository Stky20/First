package by.htp.jd1_2018.homework.unit2;

public class Task3_2 {

	public static void main(String[] args) {
		
		int[] mas = {0, 5, 4, 2, 4, 0, 13, 0, 98, 0};
		
		System.out.print("Массив: ");
		
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		
		masIndexov(mas);
	}
	
	public static void masIndexov(int[] a) {
		
		int indexNumber = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) 
				indexNumber = indexNumber + 1;
			
		}
		
		System.out.println("\nПолучили колличество нулей или длинну второго массива: " + indexNumber);
						
		int[] masIndex = new int[indexNumber];
		
//		for (int s = 0; s < masIndex.length; s++) {
//			System.out.print(masIndex[s] + " ");
//		}
		
		int index2 = 0;
		
		for (int z = 0; z < a.length; z++) {
			
			if (a[z] == 0) {
				masIndex[index2] = z;
				index2 = index2 + 1;
			}
			
		}
		
		System.out.println("Массив индексов нудевых значений:");
		
		for (int j = 0; j < masIndex.length; j++) {
			System.out.print(masIndex[j] + " ");
		}
	
	}
	
}
