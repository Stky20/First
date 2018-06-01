package by.htp.accauntant.dao;

import by.htp.accauntant.dao.impl.SQLSpendingDAO;
import by.htp.accauntant.dao.impl.SQLUserDAO;
import by.htp.accauntant.dao.impl.SQLUserDAO2;

@SuppressWarnings("unused")
public class DAOFactory {
	
	private static final DAOFactory instance = new DAOFactory();
	
	private final UserDAO userDAO = new SQLUserDAO();
	private final SpendingDAO spendingDAO = new SQLSpendingDAO();
	
	private DAOFactory() {}

	public static DAOFactory getInstance() {
		return instance;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public SpendingDAO getNoteDAO() {
		return spendingDAO;
	}	

}
