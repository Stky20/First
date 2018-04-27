package by.htp.nb.controller.impl;

import by.htp.nb.controller.Comand;
import by.htp.nb.entity.User;

public class Logout implements Comand  {

	@Override
	public String execute(String[] params) {
		String nickName = params[3];
		String password = params[5];
		String name = params[7];
		String surname = params[9];
		int id = Integer.parseInt(params[1]);
			
		User user = new User (id, nickName, password, name, surname);
		
		user.setLogedIn(false);	
		
		System.out.println("You've succesfully logged out. (From controller - log out)");

		return user.toString() + "/" + user.isLogedIn();
	}

}
