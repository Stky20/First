package by.htp.accauntant.dao;

import by.htp.accauntant.bin.User;


public interface UserDAO {
	
	public boolean addUser(User user);
	public boolean checkIfUserInBase(User user);
	public User login(User user);
	public User editUser (User user, User newUser);
	public boolean removeUser (User user);

}
