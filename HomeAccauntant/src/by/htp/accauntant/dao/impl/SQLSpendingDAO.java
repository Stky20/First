package by.htp.accauntant.dao.impl;

import java.util.GregorianCalendar;
import java.util.List;

import by.htp.accauntant.bin.Spending;
import by.htp.accauntant.bin.SpendingType;
import by.htp.accauntant.dao.SpendingDAO;

public class SQLSpendingDAO implements SpendingDAO {

	@Override
	public boolean addSpend(Spending spend) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Spending> getSpend(SpendingType spendType, GregorianCalendar firstDate, GregorianCalendar lastDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Spending> getSpend(SpendingType spendType, GregorianCalendar date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Spending> getAllSpend(GregorianCalendar firstDate, GregorianCalendar lastDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Spending> getAllSpend(GregorianCalendar date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Spending> getAllSpend() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Spending editSpend(Spending spend) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeSpend(Spending spend) {
		// TODO Auto-generated method stub
		return false;
	}

}
