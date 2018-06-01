package by.htp.accauntant.controller.impl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.accauntant.controller.Command;

public class RegistrationPage implements Command{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		RequestDispatcher dispatcher = request.getRequestDispatcher(JSPPathes.REGISTRATION_PAGE);
		
		try {
			dispatcher.forward(request, response);
		} catch (ServletException | IOException e) {
			//log
		}
		
	}
}
