package by.htp.accauntant.service;

import by.htp.accauntant.bin.User;

public interface UserService {
	
	public User addUser(User user);
	public User login(User user);
	public User editUser(User user, User newUser);
	public boolean removeUser(User user);

}
