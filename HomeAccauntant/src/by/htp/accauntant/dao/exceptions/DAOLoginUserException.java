package by.htp.accauntant.dao.exceptions;

@SuppressWarnings("serial")
public class DAOLoginUserException extends Exception {
	
	public DAOLoginUserException(){
		super();
	}
	
	public DAOLoginUserException(String msg){
		super(msg);
	}
	
	public DAOLoginUserException(Exception e){
		super(e);
	}
	
	public DAOLoginUserException(String msg, Exception e){
		super(msg, e);
	}

}
