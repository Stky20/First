package by.htp.nb.controller;

public class Controller {

	private final ComandProvider comandProvider = new ComandProvider();

	public String doAction(String request) {

		String response = null;
		String[] requestMas = request.split("/");
		Comand comand = comandProvider.getComand(requestMas[0]);
		
		
		response = comand.execute(requestMas);

		return response;

	}

}
