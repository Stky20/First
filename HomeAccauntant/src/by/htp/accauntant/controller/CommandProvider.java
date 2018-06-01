package by.htp.accauntant.controller;

import java.util.HashMap;
import java.util.Map;

import by.htp.accauntant.controller.impl.Login;
import by.htp.accauntant.controller.impl.LoginPage;
import by.htp.accauntant.controller.impl.MainPage;
import by.htp.accauntant.controller.impl.Registration;
import by.htp.accauntant.controller.impl.RegistrationPage;

class CommandProvider {
	
private Map<CommandName, Command> comands = new HashMap<CommandName, Command>();
	
	public CommandProvider() {
		comands.put(CommandName.MAIN_PAGE, new MainPage());
		comands.put(CommandName.LOGIN_PAGE, new LoginPage());
		comands.put(CommandName.REGISTRATION_PAGE, new RegistrationPage());
		comands.put(CommandName.LOG_IN, new Login());
		comands.put(CommandName.REGISTRATION, new Registration());
//		comands.put(ComandName.);
//		comands.put(ComandName.);
//		comands.put(ComandName.);
	}

	public Command getComand(String comandName) {
		Command comand = comands.get(CommandName.valueOf(comandName.toUpperCase()));
		return comand;
	}


}
