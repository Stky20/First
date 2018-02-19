package by.htp.jd1_2018.homework.unit3.task5;


import java.util.Date;
import java.util.Random;

public class Student {
	
	protected int i = 0;
	protected int id;
	public String surname;
	protected String name;
	protected String patronymic;
	protected String adress;
	protected String faculty;
	protected Date dateOfBirth;
	protected long foneNumber;
	protected int course;
	
	
	public Student(int id, String surname, String name, String patronymic, 
				   String adress, String faculty, java.util.Date date, 
				   long foneNumber, int course) {
		
		Random ran = new Random();
		i = ran.nextInt(1000);
		this.id = id + i;
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		this.adress = adress;
		this.faculty = faculty;
		this.dateOfBirth = date;
		this.foneNumber = foneNumber;
		this.course = course;
						
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPatronymic() {
		return patronymic;
	}


	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public String getFaculty() {
		return faculty;
	}


	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public long getFoneNumber() {
		return foneNumber;
	}


	public void setFoneNumber(long foneNumber) {
		this.foneNumber = foneNumber;
	}


	public int getCourse() {
		return course;
	}


	public void setCourse(int course) {
		this.course = course;
	}
	
	public void show() {
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("ФИО: " + this.surname + " " + this.name + " " + this.patronymic + " " + id + " ");
		System.out.println("Дата Рождения: " + dateOfBirth);
		System.out.println("Адрес: " + adress);
		System.out.println("Курс, факультет: " + course + " " + faculty);
		System.out.println("Телефон" + foneNumber);
		System.out.println("--------------------------------------------------------------");
		
	}

}
