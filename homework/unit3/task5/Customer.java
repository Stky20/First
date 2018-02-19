package by.htp.jd1_2018.homework.unit3.task5;

import java.util.Date;
import java.util.Random;

public class Customer {
	
	protected int i = 0;
	protected String id;
	protected String surname;
	protected String name;
	protected String patronymic;
	protected String adress;
	protected String creditCard;
	protected Date birthDate;
	protected long foneNumber;
	protected long bankAccountNumber;
	
	public Customer(String _id, String _surname, String _name, 
					String _patronymic, String _adress, Date _birthDate, 
					String _creditCard, long _foneNumber, long _bankAccountNumber) {
		
		Random ran = new Random();
		i = ran.nextInt(100);
		this.id = _id + i;
		this.surname = _surname;
		this.name = _name;
		this.patronymic = _patronymic;
		this.adress = _adress;
		this.creditCard = _creditCard;
		this.birthDate = _birthDate;
		this.foneNumber = _foneNumber;
		this.bankAccountNumber = _bankAccountNumber;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public long getFoneNumber() {
		return foneNumber;
	}

	public void setFoneNumber(long foneNumber) {
		this.foneNumber = foneNumber;
	}

	public long getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(long bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	
	public void show() {
		
		System.out.println("********************************************************************************");
		System.out.println("ФИО и id: " + this.surname + " " + this.name + " " + this.patronymic + " " + id + " ");
		System.out.println("Дата Рождения: " + birthDate);
		System.out.println("Адрес: " + adress);
		System.out.println("Номер кредитной карты " + creditCard);
		System.out.println("Банковский счёт № : " + bankAccountNumber);
		System.out.println("Телефон" + foneNumber);
		System.out.println("********************************************************************************");
		
	}

}
