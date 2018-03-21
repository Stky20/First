package by.htp.jd1_2018.homework.task1;


public abstract class Group {
	
	public Group() {
	}
	
	public static double middleroupMark(Student...students) {
		
		double averageMarksSum = 0;
		for(Student st: students) {
			averageMarksSum = averageMarksSum + st.averageRating();
		}
		double averageAllStudents = averageMarksSum/students.length;
		return averageAllStudents;
		
		
	}
	
	public static int kolichestvoOtlichnikov(Student... students) {
		
		int kolOtl = 0;
		
		for(int i = 0; i < students.length; i++) {
			if(students[i].otlichnik() == true)
				kolOtl++;
		}
		
		return kolOtl;		
	}
	
	public static int kolichestvoDvoeshnikov(Student...students) {
		int kolDvo = 0;
		
		for(int i = 0; i < students.length; i++) {
			if(students[i].studentImeetDva() == true)
				kolDvo++;
		}
		
		return kolDvo;
	}
	
	
	
}	
