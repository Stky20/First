package by.htp.accauntant.controller.impl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.accauntant.bin.User;
import by.htp.accauntant.controller.Command;
import by.htp.accauntant.service.ServiceFactory;
import by.htp.accauntant.service.UserService;

public class Registration implements Command {
	
	private static final String LOGIN_PARAM_NAME = "login";
	private static final String PASSWORD_PARAM_NAME = "password";
	private static final String NAME_PARAM_NAME = "name";
	private static final String SURNAME_PARAM_NAME = "surname";
	private static final String EMAIL_PARAM_NAME = "email";

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String login;
		String password;
		String name;
		String surname;
		String email;
				
		login = request.getParameter(LOGIN_PARAM_NAME).trim();
		password = request.getParameter(PASSWORD_PARAM_NAME).trim();
		name = request.getParameter(NAME_PARAM_NAME).trim();
		surname = request.getParameter(SURNAME_PARAM_NAME).trim();
		email = request.getParameter(EMAIL_PARAM_NAME).trim();
		
		if((login.isEmpty()) || (password.isEmpty())) {
			
			request.setAttribute("errorMsg","You forgot to enter login or password");
			RequestDispatcher dispatcher = request.getRequestDispatcher(JSPPathes.REGISTRATION_PAGE);
			try {
				dispatcher.forward(request, response);
			} catch (ServletException e) {
				//log
				e.printStackTrace();
			} catch (IOException e) {
				// log
				e.printStackTrace();
			}
		}
		
		User user = new User(login, password);
		
		if (!name.isEmpty()) user.setName(name);
		if (!surname.isEmpty()) user.setSurname(surname);
		if (!email.isEmpty()) user.setE_mail(email);
		
		ServiceFactory factory = ServiceFactory.getInstance();
		
		UserService uService = factory.getUserService();
		
		user = uService.addUser(user);
		
		if (user == null) {
			request.setAttribute("errorMsg","Registration is failed");
			RequestDispatcher dispatcher = request.getRequestDispatcher(JSPPathes.REGISTRATION_PAGE);
			try {
				dispatcher.forward(request, response);
			} catch (ServletException e) {
				//log
				e.printStackTrace();
			} catch (IOException e) {
				// log
				e.printStackTrace();
			}			
		}
		
		request.getSession().setAttribute("user", user);		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(JSPPathes.USER_MAIN);
		
		try {
			dispatcher.forward(request, response);
		} catch (ServletException | IOException e) {
			// log
			e.printStackTrace();
		}
		
	}

}
