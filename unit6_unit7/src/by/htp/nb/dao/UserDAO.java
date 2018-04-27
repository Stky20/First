package by.htp.nb.dao;


import java.io.IOException;
import by.htp.nb.dao.exception.DAOException;
import by.htp.nb.entity.User;

public interface UserDAO {

	User createUser(User user) throws IOException;
	User logination (String nickName, String passwor) throws DAOException;
	User unlogination (User user);	
	void editUser (User user, String nickName, String password, String name, String surname) throws DAOException;
	void editUser(User user, String name, String surname);
	void removeUser (User user) throws IOException;
	
	

}
