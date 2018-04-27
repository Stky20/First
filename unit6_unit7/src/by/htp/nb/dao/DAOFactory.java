package by.htp.nb.dao;

import by.htp.nb.dao.impl.FileNoteDAO;
import by.htp.nb.dao.impl.FileUserDAO;

public class DAOFactory {
	
	private static final DAOFactory instance = new DAOFactory();
	
	private final UserDAO userDAO = new FileUserDAO();
	private final NoteDAO noteDAO = new FileNoteDAO();
	
	private DAOFactory() {}

	public static DAOFactory getInstance() {
		return instance;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public NoteDAO getNoteDAO() {
		return noteDAO;
	}	

}
