package by.htp.nb.controller.impl;

import java.io.IOException;

import by.htp.nb.controller.Comand;
import by.htp.nb.entity.User;
import by.htp.nb.service.ServiceFactory;
import by.htp.nb.service.UserService;

public class Registration implements Comand {

	@Override
	public String execute(String[] params) {
		String nickName = null;
		String password = null;
		String name = null;
		String surname = null;
		int id = 0;
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
				case "name":
					name = paramsElements[1];
					break;
				case "surname":
					surname = paramsElements[1];
					break;
				case "id":
					id = Integer.parseInt(paramsElements[1]);
					break;
			}
		}
		
		User user = new User (id, nickName, password, name, surname);
		
		if ((nickName.isEmpty()) || (password.isEmpty()) || id == 0 ) {
			System.out.println("Enter login, password and id (sms from controller).");
			return null;
		}
		
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		UserService userService = serviceFactory.getUserService();
		
		try {
			user = userService.createUser(user);
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		 
			if ((name.equals(null)) && (surname.equals(null))){
				System.out.println("User " + user.getName() + " " + user.getSurname() + " is created(sms from controller)");			
			}else {
				System.out.println("User " + user.getNickName() + " is created.(sms from controller)");
			}
			return user.toString() + "/" + user.isLogedIn();
				
						
	}

}
