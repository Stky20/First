package by.htp.nb.controller.impl;

import by.htp.nb.controller.Comand;
import by.htp.nb.entity.User;
import by.htp.nb.service.ServiceFactory;
import by.htp.nb.service.UserService;
import by.htp.nb.service.exception.ServiceException;

public class Login implements Comand  {

	@Override
	public String execute(String[] params) {
		String nickName = null;
		String password = null;
		String[] paramsElements;
		
		for(int i = 1; i < params.length; i++) {
			paramsElements =params[i].split("=");
		
			switch(paramsElements[0]) {
				case "nickName":
					nickName = paramsElements[1];
					break;
				case "password":
					password = paramsElements[1];
					break;
			}
		}
		
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		UserService userService = serviceFactory.getUserService();
		
		User user = new User(0, null, null);
				
			try {
				user = userService.logination(nickName, password);
			} catch (ServiceException e) {
				user.setLogedIn(false);
				return user.toString() + user.isLogedIn();
			}
			
				

		if (user.isLogedIn()){
			System.out.println("You succesfully logged in (from controller logination).");
			return  user.toString() + "/" + true;
		}else {
			System.out.println("Login or password is wrong (from controller logination).");
			return user.toString() + "/" + false;
		}
	}

}
