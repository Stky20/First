package by.htp.accauntant.service.impl;

import by.htp.accauntant.bin.User;
import by.htp.accauntant.dao.DAOFactory;
import by.htp.accauntant.dao.UserDAO;
import by.htp.accauntant.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public User addUser(User user) {
		DAOFactory factoryDAO = DAOFactory.getInstance();
		UserDAO userDAO = factoryDAO.getUserDAO();
		if(!userDAO.checkLoginInDB(user)) {
			if(userDAO.addUser(user)) {
				User createdUser = userDAO.login(user);
				return createdUser;
			}                                                 //эксепшн придумать, если логин уже в базе???
		}
		return null;
	}

	@Override
	public User login(User user) {
		DAOFactory factoryDAO = DAOFactory.getInstance();
		UserDAO userDAO = factoryDAO.getUserDAO();
		if(userDAO.checkIfUserInBase(user)) {
			User loggedUser = userDAO.login(user);
			return loggedUser;
		}                                                    //еще одно исключение придумать для логинации??? 
		return null;
	}

	@Override
	public User editUser(User user, User newUser) {
		DAOFactory factoryDAO = DAOFactory.getInstance();
		UserDAO userDAO = factoryDAO.getUserDAO();
		User editedUser = userDAO.editUser(user, newUser);
		if(user.equals(editedUser)) {
			return null;
		}
		return editedUser;
	}

	@Override
	public boolean removeUser(User user) {
		DAOFactory factoryDAO = DAOFactory.getInstance();
		UserDAO userDAO = factoryDAO.getUserDAO();
		
		return userDAO.removeUser(user);
	}

}
