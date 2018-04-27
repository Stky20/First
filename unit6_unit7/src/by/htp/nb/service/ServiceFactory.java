package by.htp.nb.service;

import by.htp.nb.service.impl.NoteServiceImpl;
import by.htp.nb.service.impl.UserServiceImpl;

public class ServiceFactory {
	private final static ServiceFactory instance = new ServiceFactory();
	
	private final NoteService noteService = new NoteServiceImpl();
	private final UserService userService = new UserServiceImpl();
	
	private ServiceFactory() {}

	public static ServiceFactory getInstance() {
		return instance;
	}

	public NoteService getNoteService() {
		return noteService;
	}

	public UserService getUserService() {
		return userService;
	}

}
