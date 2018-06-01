package by.htp.accauntant.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String COMAND_PARAM_NAME = "comand";
	
	private final CommandProvider provider = new CommandProvider();
       
    
    public Controller() {
        super();        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String comandName = request.getParameter(COMAND_PARAM_NAME);
		Command comand = provider.getComand(comandName);
		comand.execute(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
