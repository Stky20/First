package by.htp.accauntant.dao;

import java.util.GregorianCalendar;
import java.util.List;

import by.htp.accauntant.bin.Spending;
import by.htp.accauntant.bin.SpendingType;

public interface SpendingDAO {
	
	public boolean addSpend(Spending spend);
	public List<Spending> getSpend(SpendingType spendType, GregorianCalendar firstDate, GregorianCalendar lastDate);
	public List<Spending> getSpend(SpendingType spendType, GregorianCalendar date);
	public List<Spending> getAllSpend(GregorianCalendar firstDate, GregorianCalendar lastDate);
	public List<Spending> getAllSpend(GregorianCalendar date);
	public List<Spending> getAllSpend();
	public Spending editSpend (Spending spend);
	public boolean removeSpend (Spending spend);
}
