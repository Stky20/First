package by.htp.nb.controller.impl;

import java.io.IOException;

import by.htp.nb.controller.Comand;
import by.htp.nb.entity.User;
import by.htp.nb.service.ServiceFactory;
import by.htp.nb.service.UserService;

public class RemoveUser implements Comand  {

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public String execute(String[] params) {
		
		String nickName = params[3];
		String password = params[5];
		String name = params[7];
		String surname = params[9];
		int id = Integer.parseInt(params[1]);
		
		User user = new User(id, nickName, password, name, surname);
		
		if(params[10].equals(false)){
			user.setLogedIn(false);
			System.out.println("You are not logged in. (From controller - remove user)");
			
			return user.toString() + "/" + user.isLogedIn();
		}
		
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		UserService userService = serviceFactory.getUserService();
		
		try {
			userService.removeUser(user);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		user.setLogedIn(false);
		System.out.println("you've deleted user.sms from controller");
		
		return user.toString() + "/" + user.isLogedIn();
				
	}

}
