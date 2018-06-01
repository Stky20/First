package by.htp.accauntant.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import by.htp.accauntant.bin.HashPassword;
import by.htp.accauntant.bin.User;
import by.htp.accauntant.dao.UserDAO;
import by.htp.accauntant.dao.connectionpool.DBParameter;
import by.htp.accauntant.dao.connectionpool.DBResourceManager;

public class SQLUserDAO2 implements UserDAO{
	private Connection con = null;
	private Statement statement = null;
	private PreparedStatement prStatement = null;
	private ResultSet rSet = null;
	
	private String driverName;
	private String dbUrl;
	private String user;
	private String password;
	@SuppressWarnings("unused")
	private int poolSize;
	
	public SQLUserDAO2() {
		DBResourceManager dbMan = DBResourceManager.getInstance();
		driverName = dbMan.getValue(DBParameter.DB_DRIVER);
		dbUrl = dbMan.getValue(DBParameter.DB_URL);
		user = dbMan.getValue(DBParameter.DB_USER);
		password = dbMan.getValue(DBParameter.DB_PASSWORD);
		poolSize = Integer.parseInt(dbMan.getValue(DBParameter.DB_POLL_SIZE));
		
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(dbUrl, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			//log
			e.printStackTrace();
		}
	}
	
	
	@Override
	public boolean addUser(User user) {
		int addedRowInBase = 0;
		
		try {
			prStatement = con.prepareStatement("INSERT INTO users (nickName, hashPassword, name, surname, e_mail) VALUES (?, ?, ?, ?, ?);");  //запись юзера в базу
			prStatement.setString(2, user.getNickName());
			prStatement.setString(3, user.getHashPassword().toString());
			prStatement.setString(4, user.getNickName());
			prStatement.setString(5, user.getNickName());
			prStatement.setString(6, user.getNickName());
			addedRowInBase = prStatement.executeUpdate();
				
		} catch (SQLException e) {
			// log(e)
			e.printStackTrace();
		}finally {
								
			try {
				if(prStatement != null) {
					prStatement.close();
				}
			}catch(SQLException e) {/*log(e)*/}
												
		}
		
		if(addedRowInBase == 1) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean checkIfUserInBase(User user) {
				
		String query = "SELECT * FROM users  WHERE (nickName='" + user.getNickName() + "');";
		
		try {
			statement = con.createStatement();
			rSet = statement.executeQuery(query);         //проверка на уникальность логина
			int countRows = 0;
			
			while(rSet.next()) {
				countRows++;
				
			}
			
			if(countRows == 1) {
				return true;
			}
			
		}catch(SQLException e) {
			// log(e)
			e.printStackTrace();
		}finally {
			
			try {                                         
				if(rSet != null) {
					rSet.close();				
				}
			}catch(SQLException e) {/*log(e)*/}
			
			try {
				if(statement != null) {
					statement.close();
				}
			}catch(SQLException e) {/*log(e)*/}
		}
		
		return false;
	}

	@Override
	public User login(User user) {
		String query = "SELECT * FROM users  WHERE (nickName='" + user.getNickName() + "');";
		User loggedUser = new User();
		HashPassword hP = new HashPassword();
		
		try {
					
			statement = con.createStatement();
			rSet = statement.executeQuery(query);              
		
			while(rSet.next()) {                                              // создание юзера из бд уже с id
				loggedUser.setId(rSet.getInt(1));
				loggedUser.setNickName(rSet.getString(2));
				hP.setHashPassword(rSet.getString(3));
				loggedUser.setHashPassword(hP);
				loggedUser.setName(rSet.getString(4));
				loggedUser.setSurname(rSet.getString(5));
				loggedUser.setE_mail(rSet.getString(6));
			}
			
		} catch (SQLException e) {
			//log(e)
			e.printStackTrace();
		}finally {
			
			try {                                         
				if(rSet != null) {
					rSet.close();				}
			}catch(SQLException e) {/*log(e)*/}
			
			try {
				if(statement != null) {
					statement.close();
				}
			}catch(SQLException e) {/*log(e)*/}
		}
				
		return loggedUser;
	}

	@Override
	public User editUser(User user, User newUser) {
		String query = "UPDATE users SET nickName=?, hashPassword=?, name=?, surname=?, e_mail=? WHERE nickName='" + user.getNickName() + "';";
		int chengedRowInBase = 0;
				
		try {
								
			prStatement = con.prepareStatement(query);               //запись юзера в базу
			prStatement.setString(2, newUser.getNickName());
			prStatement.setString(3, newUser.getHashPassword().toString());
			prStatement.setString(4, newUser.getNickName());
			prStatement.setString(5, newUser.getNickName());
			prStatement.setString(6, newUser.getNickName());
			chengedRowInBase = prStatement.executeUpdate();
				
		} catch (SQLException e) {
			// log(e)
			e.printStackTrace();
		}finally {
								
			try {
				if(prStatement != null) {
					prStatement.close();
				}
			}catch(SQLException e) {/*log(e)*/}
												
		}
				
		if(chengedRowInBase == 1) {
			newUser.setId(user.getId());
			return newUser;
		}
		
		return user;
	}

	@Override
	public boolean removeUser(User user) {
		int deletedRows = 0;
		String query ="DELETE FROM users WHERE id=" + user.getId() + ";";
		
		try {
			statement = con.createStatement();
			deletedRows = statement.executeUpdate(query);         
									
			if(deletedRows == 1) {
				return true;
			}
			
		}catch(SQLException e) {
			// log(e)
			e.printStackTrace();
		}finally {
								
			try {
				if(statement != null) {
					statement.close();
				}
			}catch(SQLException e) {/*log(e)*/}
			try {
				if(con != null) {
					con.close();
				}
			}catch(SQLException e) {/*log(e)*/}
		}
		
		return false;
		
	}


	@Override
	public boolean checkLoginInDB(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
