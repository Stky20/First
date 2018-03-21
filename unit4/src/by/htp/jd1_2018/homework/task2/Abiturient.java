package by.htp.jd1_2018.homework.task2;

public class Abiturient {
	
	public String name;
	public String surname;
	public double[] marks = new double[4];



	public Abiturient(String name, String surname, int exam1, int exam2, int exam3, double averageCertificateMark) {
		
		this.name = name;
		this.surname = surname;
		marks[1] = exam2;
		marks[2] = exam3;
		marks[3] = averageCertificateMark;
		marks[0] =  exam1; 
		
	}
	
	public double middleMark() {
		
		double marksSum = 0;
		for(double i: this.marks) {
			marksSum = marksSum + i;
		}
		double middleMark = marksSum / this.marks.length;
		
		return middleMark;
	}
	
	public static Abiturient[] sortedAbiturients(Abiturient... abiturients) {
					
		Abiturient betweenAb;
		
		for(int j =0; j < abiturients.length - 1; j++){
					
			for(int i = j+1; i < abiturients.length; i++) {
				if(abiturients[j].middleMark() < abiturients[i].middleMark()) {
					betweenAb = abiturients[j];
					abiturients[j] = abiturients[i];
					abiturients[i] = betweenAb;
				}else if (abiturients[j].middleMark() == abiturients[i].middleMark()) {
					if (abiturients[j].marks[0] < abiturients[i].marks[0]) {
						betweenAb = abiturients[j];
						abiturients[j] = abiturients[i];
						abiturients[i] = betweenAb;
					}else if(abiturients[j].marks[0] == abiturients[i].marks[0]) {
						if (abiturients[j].marks[1] < abiturients[i].marks[1]) {
							betweenAb = abiturients[j];
							abiturients[j] = abiturients[i];
							abiturients[i] = betweenAb;
						}else if(abiturients[j].marks[1] == abiturients[i].marks[1]) {
							if (abiturients[j].marks[2] < abiturients[i].marks[2]) {
								betweenAb = abiturients[j];
								abiturients[j] = abiturients[i];
								abiturients[i] = betweenAb;
							}else if(abiturients[j].marks[2] == abiturients[i].marks[2]) {
								if (abiturients[j].marks[3] < abiturients[i].marks[3]) {
									betweenAb = abiturients[j];
									abiturients[j] = abiturients[i];
									abiturients[i] = betweenAb;
								}
							}
						}
					}
				}
			
			}
		
		}
		return abiturients;
	}
	
	public static void showAbiturient(Abiturient abiturient){
		System.out.println("Abiturient: " + abiturient.name + " " + abiturient.surname + " " + "Ocenki za ekzamenu: " + 
							abiturient.marks[0] + ", " +  abiturient.marks[1] + ", " +  abiturient.marks[2] + 
							"; Srednij bal attestata: " + 	abiturient.marks[3]	+ "Srednij bal Abiturienta: " + 
							abiturient.middleMark());
		System.out.println();
	}
	
	public static void showAllAbiturients(Abiturient... abiturient){
		
		for(Abiturient ab: abiturient) {
			showAbiturient(ab);
		}
	}
	
	public static Abiturient[] passedAbiturientsRegister(int vacancies, Abiturient[] ab) {
		
		Abiturient[] passedAbitur = new Abiturient[vacancies];
		for(int i = 0; i <= vacancies-1; i++) {
			passedAbitur[i] = ab[i];
		}
		
		
			
		return passedAbitur;
				
	}
	
	
}
