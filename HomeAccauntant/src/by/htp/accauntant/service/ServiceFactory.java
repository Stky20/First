package by.htp.accauntant.service;

import by.htp.accauntant.service.impl.SpendingServiceImpl;
import by.htp.accauntant.service.impl.UserServiceImpl;

public class ServiceFactory {
	
	private final static ServiceFactory instance = new ServiceFactory();
	
	private final UserService userService = new UserServiceImpl();
	private final SpendingService spendingService = new SpendingServiceImpl();
	
	private ServiceFactory() {}
	
	public static ServiceFactory getInstance() {
		return instance;
	}
	
	public UserService getUserService() {
		return userService;
	}

	public SpendingService getSpendingService() {
		return spendingService;
	}
}
