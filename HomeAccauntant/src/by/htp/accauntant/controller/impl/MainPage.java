package by.htp.accauntant.controller.impl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.accauntant.controller.Command;

public class MainPage implements Command {
	
	private final static String MAIN_PAGE_JSP_PATH = "/WEB-INF/jsp/Main.jsp";

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(JSPPathes.MAIN_PAGE);
		
		try {
			dispatcher.forward(request, response);
		} catch (ServletException | IOException e) {
			//log
		}
	}

}
