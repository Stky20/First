package by.htp.nb.controller;

import java.util.HashMap;
import java.util.Map;

import by.htp.nb.controller.impl.CreateNote;
import by.htp.nb.controller.impl.EditNote;
import by.htp.nb.controller.impl.FindNote;
import by.htp.nb.controller.impl.Login;
import by.htp.nb.controller.impl.Logout;
import by.htp.nb.controller.impl.Registration;
import by.htp.nb.controller.impl.RemoveNote;
import by.htp.nb.controller.impl.RemoveUser;

public class ComandProvider {

	private Map<String, Comand> comands = new HashMap<String, Comand>();
	
	public ComandProvider() {
		comands.put("REGISTRATION", new Registration());
		comands.put("LOGIN", new Login());
		comands.put("LOGOUT", new Logout());
		comands.put("REMOVE_USER", new RemoveUser());
		comands.put("CREATE_NOTE", new CreateNote());
		comands.put("EDIT_NOTE", new EditNote());
		comands.put("REMOVE_NOTE", new RemoveNote());
		comands.put("FIND_NOTE", new FindNote());
	}

	public Comand getComand(String comandName) {
		Comand comand = comands.get(comandName);
		return comand;
	}



}







// команда 1: "REGISTRATION|nickName=aaa|password=pas|name=null|surname=null|id=111"
// ответ команды 1 "id| nickName=|nickName| password=|password| name=|name| surname=|surname|true" либо false

//команда 2: "LOGIN|nickName=aaa|password=pas"
//ответ команды 2: "id| nickName=|nickName| password=|password| name=|name| surname=|surname|true"    либо  false 


//команда 3: "LOGOUT|id| nickName=|nickName| password=|password| name=|name| surname=|surname|true"
//ответ команды 3: "id| nickName=|nickName| password=|password| name=|name| surname=|surname|false"

//команда 4: "REMOVE_USER|id| nickName=|nickName| password=|password| name=|name| surname=|surname|true" ответ команды 1,2,5,6,7,8
// ответ команды 4: id| nickName=|nickName| password=|password| name=|name| surname=|surname|false
//                0       1      2         3       4            5     6      7      8        9      10      11      12
//команда 5: "CREATE_NOTE|id| nickName=|nickName| password=|password| name=|name| surname=|surname|true| noteText=|text"
//ответ команды 5: id| nickName=|nickName| password=|password| name=|name| surname=|surname|true 
//                                                                                                                       13  14  15    16  17    18
//команда 6:   "FIND_NOTE|id| nickName=|nickName| password=|password| name=|name| surname=|surname|true| noteText=|text|day=|00|month=|00|year=|0000" + ответ команды 1 либо 2 либо 5 либо 6 либо 7 либо 8
//ответ команды 5: id| nickName=|nickName| password=|password| name=|name| surname=|surname|true

//                                                                                                                                                       19      20   21  22  23    24  25    26
//команда 7:   "EDIT_NOTE|id| nickName=|nickName| password=|password| name=|name| surname=|surname|true| noteText=|text|day=|00|month=|00|year=|0000| new Text=|text|day=|00|month=|00|year=|0000|" + ответ команды 6
//ответ команды 7: id| nickName=|nickName| password=|password| name=|name| surname=|surname|true

//команда 8: "REMOVE_NOTE|id| nickName=|nickName| password=|password| name=|name| surname=|surname|true| noteText=|text|day=|00|month=|00|year=|0000" + ответ команды 5,6,7
//ответ команды 8: id| nickName=|nickName| password=|password| name=|name| surname=|surname|true








