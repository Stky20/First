package by.htp.nb.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.htp.nb.dao.UserDAO;
import by.htp.nb.dao.exception.DAOException;
import by.htp.nb.entity.User;

public class FileUserDAO implements UserDAO {

	@Override
	public User logination(String nickName, String password) throws DAOException {
			BufferedReader reader = null;
			String line;
			List<String> usersList = new ArrayList<String>();
			try {
				reader = new BufferedReader(new FileReader ("Users.txt"));
				
				while((line = reader.readLine()) != null) {
					usersList.add(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
				throw new DAOException("File Users.txt not found", e);
				
			}finally{	
				if(reader != null) {		
					try {
						reader.close();					
					} catch (IOException e) {					
						System.out.println("reader in method loginstion not closed, look into your code!!!");
					}
				}
			}
			
			String userInString = null;
			
			for(String userLine: usersList) {
				if (userLine.split("/")[2].equals(nickName) && userLine.split("/")[4].equals(password)) { // проверка на соответствие логина и пароля
					userInString = userLine;
				}
			}
			
			if (userInString == null) {                                   //Если лог и пас не совпали конец метода
				System.out.println("Wrong login or password!");
				User user1 = new User(0, nickName, password);
				user1.setLogedIn(false);
				return user1;
			}
			
			String[] userInStrings = userInString.split("/");
			
			User user = new User(Integer.parseInt(userInStrings[0]), userInStrings[2], userInStrings[4], userInStrings[6], userInStrings[8]);
			
			if(!(userInStrings[6].equals("null")) && !(userInStrings[8].equals("null"))) {
					System.out.println(userInStrings[6] + " " + userInStrings[8] + ", welcome in NoteBook! You've seccesfully logged in.");
			}else {
				System.out.println("Welcome in NoteBook! You've seccesfully logged in.");
			}
			
		return user;
	}

	@Override
	public User unlogination(User user) {
		user.setLogedIn(false);
		
		if((user.getName().equals(null)) && (user.getSurname().equals(null))) {
			System.out.println(user.getName() + " " + user.getSurname() + ", You've seccesfully logged out.");
		}else {
		System.out.println("You've seccesfully logged out.");
	}
		
		return user;
	}

	@Override
	public void editUser(User user, String nickName, String password, String name, String surname) throws DAOException {
		if (user.isLogedIn()) {
					
			BufferedReader reader = null;
			List<String> usersList = new ArrayList<String>();		
			String line;
			
			try {
				reader = new BufferedReader(new FileReader ("Users.txt"));
				while((line = reader.readLine()) != null) {
				usersList.add(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
				throw new DAOException("while reading file Users.txt, IO was thrown!!!", e);
			}finally {
				if(reader !=null) {
					try {
						reader.close();
					} catch (IOException e) {
						e.printStackTrace();
						throw new DAOException("reader not closed, look into your code", e);
					}
				}
			}
		
			String userInString = user.toString();
			String lineEdit = "";
			int index = -1;
		
			for(String usersInLine: usersList) {
				if (usersInLine.equals(userInString)) {
					lineEdit = usersInLine;
					index = usersList.indexOf(usersInLine);
				}
			}
			
			user.setNickName(nickName);
			user.setPassword(password);
			user.setName(name);
			user.setSurname(surname);
			
			if (!lineEdit.isEmpty()) {
				usersList.remove(index);
				usersList.add(user.toString());
			}
			else
				System.out.println("User wasn`t removed.");
			
			FileWriter writer = null;
				try {
					writer = new FileWriter("Users.txt");
					for(String lineOfUserFromList: usersList) {
						writer.write(lineOfUserFromList + "\n");
					}
				} catch (IOException e) {
					e.printStackTrace();
					throw new DAOException("writer can`t write file", e);
				}finally {	
					if(writer != null) {
						try {
							writer.close();
						} catch (IOException e) {
							//error
							System.out.println("writer don`t closed in edit user");
						}
					}
				}
			
			
		}else {
			System.out.println("You can not do actions, because you are not logged in!!! (from UserDAO)");
		}
		
	}
	
	@Override
	public void editUser(User user, String name, String surname) {  //походу, мне было лень доделать и жалко удалять
		if (user.isLogedIn()) {
			user.setName(name);
			user.setSurname(surname);
		} else {
			System.out.println("You can not do actions, because you are not logged in!!! (from UserDAO)");
		}
	}

	@Override
	public void removeUser(User user) throws IOException {
		
		if(user.isLogedIn()) {	
		
			BufferedReader reader = new BufferedReader(new FileReader ("Users.txt"));
		
			List<String> usersList = new ArrayList<String>();
		
			String line;
			
			while((line = reader.readLine()) != null) {
				usersList.add(line);
			}
		
			reader.close();
		
			String userInString = user.toString();
			String lineRemovable = "";
		
			for(String usersInLine: usersList) {
				if (usersInLine.equals(userInString)) {
					lineRemovable = usersInLine;
				}
			}
			
			if (!lineRemovable.isEmpty())
				usersList.remove(lineRemovable);
			else
				System.out.println("User wasn`t removed.");
			
			FileWriter writer = new FileWriter("Users.txt");
			
			for(String lineOfUserFromList: usersList) {
				writer.write(lineOfUserFromList + "\n");
			}
			writer.close();
			
			File file = new File (user.getId() + "_notes.txt");
			file.delete();
		}
		else {
			System.out.println("You can not do actions, because you are not logged in!!! (from UserDAO)");
		}
			
	}

	@Override
	public User createUser(User user) throws IOException {
		File users = new File("Users.txt");
		if(!users.exists()) {
			users.createNewFile();
		}
		
		BufferedReader reader = new BufferedReader(new FileReader ("Users.txt"));
		
		List<String> usersList = new ArrayList<String>();
		
		String line;
		
		while((line = reader.readLine()) != null) {
			usersList.add(line);
		}
		
		reader.close();
						
		for(String lineOfUserFromList: usersList) {
			if (usersList.isEmpty())break;
			if (lineOfUserFromList.isEmpty())break;
			
			if(user.getNickName().equals(lineOfUserFromList.split("/")[2]) || 
			  (user.getId() == Integer.parseInt(lineOfUserFromList.split("/")[0]))){                     //проврка на то, чтобы логин и id юзера не повторялся
				System.out.println("This Nickname or ID is allready used, try other Nickname or ID!");
				user.setLogedIn(false);
				return user;
			}
		}
		
		usersList.add(user.toString());
		
		FileWriter writer = new FileWriter("Users.txt");
		
		for(String lineOfUser: usersList) {
			writer.write(lineOfUser + "\n");
		}
		writer.close();
		
		File usersNotes = new File (user.getId() +"_notes.txt");
		usersNotes.createNewFile();
		
		return user;
		
	}

}
