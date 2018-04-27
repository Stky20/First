package by.htp.nb.service.impl;

import java.io.IOException;

import by.htp.nb.dao.DAOFactory;
import by.htp.nb.dao.exception.DAOException;
import by.htp.nb.entity.User;
import by.htp.nb.service.UserService;
import by.htp.nb.service.exception.ServiceException;

public class UserServiceImpl implements UserService{

	@Override
	public User createUser(User user) throws IOException {
		DAOFactory daoFactory = DAOFactory.getInstance();
		return daoFactory.getUserDAO().createUser(user);
	}

	@Override
	public User logination(String nickName, String password) throws ServiceException {
		DAOFactory daoFactory = DAOFactory.getInstance();
		try {
			return daoFactory.getUserDAO().logination(nickName, password);
		} catch (DAOException e) {
			throw new ServiceException(e);			
		}
	}

	@Override
	public User unlogination(User user) {
		DAOFactory daoFactory = DAOFactory.getInstance();
		return daoFactory.getUserDAO().unlogination(user);
	}

	@Override
	public void editUser(User user, String nickName, String password, String name, String surname) throws ServiceException {
		DAOFactory daoFactory = DAOFactory.getInstance();
		try {
			daoFactory.getUserDAO().editUser(user, nickName, password, name, surname);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public void editUser(User user, String name, String surname) {
		DAOFactory daoFactory = DAOFactory.getInstance();
		daoFactory.getUserDAO().editUser(user, name, surname);
	}

	@Override
	public void removeUser(User user) throws IOException {
		DAOFactory daoFactory = DAOFactory.getInstance();
		daoFactory.getUserDAO().removeUser(user);
		
	}

}
