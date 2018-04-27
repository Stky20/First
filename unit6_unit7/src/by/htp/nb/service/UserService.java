package by.htp.nb.service;

import java.io.IOException;

import by.htp.nb.entity.User;
import by.htp.nb.service.exception.ServiceException;

public interface UserService {
	
	User createUser(User user) throws IOException;
	User logination (String nickName, String password) throws ServiceException;
	User unlogination (User user);	
	void editUser (User user, String nickName, String password, String name, String surname) throws ServiceException;
	void editUser(User user, String name, String surname);
	void removeUser (User user) throws IOException;

}
