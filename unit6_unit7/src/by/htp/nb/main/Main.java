package by.htp.nb.main;

import by.htp.nb.controller.Controller;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
//                                              READ ME!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!	
/*		Все команды, которые реализует приложение:
		1 REGISTRATION 
		2  LOGIN 
		3 LOGOUT 
		4 REMOVE_USER 
		5 CREATE_NOTE 
		6 FIND_NOTE 
		7 EDIT_NOTE 
		8 REMOVE_NOTE
		
		При этом в командах контроллера я зыбыл реализовать команду EDIT_USER, но до контроллера она есть (в перспективе, пусть будет командой для админа))))
		
	!!!!!!!!	ИСКЛЮЧЕНИЯ я обработал только в команде логинация и забытой команде EDIT_USER, чтобы сэкономить немного времени и нервов ))) а может из-за лени )))
		
		вот с такими строками работают мои команды, из-за них та мне и хотелось сэкономить время и нервы (в другом проекте уже придумал бы попроще, как мне кажется):
		
		команда 1: 			"REGISTRATION|nickName=aaa|password=pas|name=null|surname=null|id=111"
		ответ команды 1 	"id| nickName=|nickName| password=|password| name=|name| surname=|surname|true" либо false

		команда 2: 			"LOGIN|nickName=aaa|password=pas"
		ответ команды 2: 	"id| nickName=|nickName| password=|password| name=|name| surname=|surname|true"    либо  false 

		команда 3: 			"LOGOUT|id| nickName=|nickName| password=|password| name=|name| surname=|surname|true"
		ответ команды 3: 	"id| nickName=|nickName| password=|password| name=|name| surname=|surname|false"

		команда 4: 			"REMOVE_USER|id| nickName=|nickName| password=|password| name=|name| surname=|surname|true" 
		ответ команды 4: 	"id| nickName=|nickName| password=|password| name=|name| surname=|surname|false"
               					  0       1      2         3       4            5     6      7      8        9      10      11      12
		команда 5: 			"CREATE_NOTE|id| nickName=|nickName| password=|password| name=|name| surname=|surname|true| noteText=|text"
		ответ команды 5:	"id| nickName=|nickName| password=|password| name=|name| surname=|surname|true"
                                                                                                                      				  13  14   15   16  17    18
		команда 6:   		"FIND_NOTE|id| nickName=|nickName| password=|password| name=|name| surname=|surname|true| noteText=|text|day=|00|month=|00|year=|0000" 
		ответ команды 5: 	"id| nickName=|nickName| password=|password| name=|name| surname=|surname|true"
                                                                                                                                                                   19  20   21  22  23    24  25    26
		команда 7:   		"EDIT_NOTE|id| nickName=|nickName| password=|password| name=|name| surname=|surname|true| noteText=|text|day=|00|month=|00|year=|0000| new Text=|text|day=|00|month=|00|year=|0000|" 
		ответ команды 7: 	"id| nickName=|nickName| password=|password| name=|name| surname=|surname|true"

		команда 8: 			"REMOVE_NOTE|id| nickName=|nickName| password=|password| name=|name| surname=|surname|true| noteText=|text|day=|00|month=|00|year=|0000"
		ответ команды 8: 	"id| nickName=|nickName| password=|password| name=|name| surname=|surname|true"
		


так много переменных для нагладности использоваия строк, сделал так для себя
*/
		
		String requestRegistration = "REGISTRATION/nickName=stan/password=1234/name=null/surname=null/id=1";
		
		Controller controller = new Controller();
		
		String requestLogin = "LOGIN/nickName=stan/password=1234";
		
		String responseLogin = controller.doAction(requestLogin);
		
		String requestCreateNote = "CREATE_NOTE/" + responseLogin + "/ noteText=/Main testing";
						
		String responseCreateNote = controller.doAction(requestCreateNote);
		
		String requestFindNote = "FIND_NOTE/" + responseCreateNote + "/ noteText=/My first Note/day=/0/month=/0/year=/0";
		
		String responseFindNote = controller.doAction(requestFindNote);
		
		String requestEditNote = "EDIT_NOTE/" + responseFindNote + "/ noteText=/My first Note- it was edited/day=/19/month=/4/year=/2018/new Text=/ - it was edited second time./day=/19/month=/4/year=/2018";
		
		String responseEditNote = controller.doAction(requestEditNote);
		
		String requestRemoveNote = "REMOVE_NOTE/" + responseLogin + "/ noteText=/it`s third, and posibly last note/day=/26/month=/4/year=/2018";
		
		String responseRemoveNote =  controller.doAction(requestRemoveNote);
		
		String requestLogout = "LOGOUT/" + responseRemoveNote;
		
				

	}

}