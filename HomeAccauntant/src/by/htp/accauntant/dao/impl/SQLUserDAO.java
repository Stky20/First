package by.htp.accauntant.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import by.htp.accauntant.bin.HashPassword;
import by.htp.accauntant.bin.User;
import by.htp.accauntant.dao.UserDAO;
import by.htp.accauntant.dao.connectionpool.ConnectionPool;



public class SQLUserDAO implements UserDAO{
	
	private ConnectionPool conPool;
		
	public SQLUserDAO() {
		conPool = ConnectionPool.getInstance();
	}


	@Override
	public boolean addUser(User user) {
		Connection con = null;
		PreparedStatement pStatement = null;
		int addedRowInBase = 0;
				
		try {
			con = conPool.takeConnection();
						
			pStatement = con.prepareStatement("INSERT INTO users (nickName, hashPassword, name, surname, e_mail) VALUES (?, ?, ?, ?, ?);");  //запись юзера в базу
			pStatement.setString(2, user.getNickName());
			pStatement.setString(3, user.getHashPassword().toString());
			pStatement.setString(4, user.getNickName());
			pStatement.setString(5, user.getNickName());
			pStatement.setString(6, user.getNickName());
			addedRowInBase = pStatement.executeUpdate();
				
		} catch (InterruptedException | SQLException e) {
			// log(e)
			e.printStackTrace();
		}finally {
								
			try {
				if(pStatement != null) {
					pStatement.close();
				}
			}catch(SQLException e) {/*log(e)*/}
			
			try {
				if(con != null) {
					con.close();
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
	public User login(User user) {
		Connection con = null;
		Statement st = null; 
		ResultSet rSet = null;
		String query = "SELECT * FROM users  WHERE (nickName='" + user.getNickName() + "');";
		User createdUser = new User();
		HashPassword hP = new HashPassword();
		
		try {
			con = conPool.takeConnection();
		
			st = con.createStatement();
			rSet = st.executeQuery(query);             // создание юзера из бд уже с id 
		
			while(rSet.next()) {
				createdUser.setId(rSet.getInt(1));
				createdUser.setNickName(rSet.getString(2));
				hP.setHashPassword(rSet.getString(3));
				createdUser.setHashPassword(hP);
				createdUser.setName(rSet.getString(4));
				createdUser.setSurname(rSet.getString(5));
				createdUser.setE_mail(rSet.getString(6));
			}
			
		} catch (InterruptedException | SQLException e) {
			//log(e)
			e.printStackTrace();
		}finally {
			
			try {                                         
				if(rSet != null) {
					rSet.close();				}
			}catch(SQLException e) {/*log(e)*/}
			
			try {
				if(st != null) {
					st.close();
				}
			}catch(SQLException e) {/*log(e)*/}
			try {
				if(con != null) {
					con.close();
				}
			}catch(SQLException e) {/*log(e)*/}
		}
		
		
		return createdUser;
	}

	@Override
	public User editUser(User user, User newUser) {
		Connection con = null;
		PreparedStatement pStatement = null;
		String query = "UPDATE users SET nickName=?, hashPassword=?, name=?, surname=?, e_mail=? WHERE nickName='" + user.getNickName() + "';";
		int chengedRowInBase = 0;
				
		try {
			con = conPool.takeConnection();
						
			pStatement = con.prepareStatement(query);  //запись юзера в базу
			pStatement.setString(2, newUser.getNickName());
			pStatement.setString(3, newUser.getHashPassword().toString());
			pStatement.setString(4, newUser.getNickName());
			pStatement.setString(5, newUser.getNickName());
			pStatement.setString(6, newUser.getNickName());
			chengedRowInBase = pStatement.executeUpdate();
				
		} catch (InterruptedException | SQLException e) {
			// log(e)
			e.printStackTrace();
		}finally {
								
			try {
				if(pStatement != null) {
					pStatement.close();
				}
			}catch(SQLException e) {/*log(e)*/}
			
			try {
				if(con != null) {
					con.close();
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
		Connection con = null;
		Statement statement = null;
		int deletedRows = 0;
		String query ="DELETE FROM users WHERE id=" + user.getId() + ";";
		
		try {
			con = conPool.takeConnection();
			statement = con.createStatement();
			deletedRows = statement.executeUpdate(query);         
									
			if(deletedRows == 1) {
				return true;
			}
			
		}catch(InterruptedException | SQLException e) {
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
	public boolean checkIfUserInBase(User user) {
		
		Connection con = null;
		Statement statement = null;
		ResultSet rSet = null;
		String query = "SELECT * FROM users  WHERE (nickName='" + user.getNickName() + "');";
		
		try {
			con = conPool.takeConnection();
			statement = con.createStatement();
			rSet = statement.executeQuery(query);         //проверка на уникальность логина
			int countRows = 0;
			
			while(rSet.next()) {
				countRows++;
				
			}
			
			if(countRows == 1) {
				return true;
			}
			
		}catch(InterruptedException | SQLException e) {
			// log(e)
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
			try {
				if(con != null) {
					con.close();
				}
			}catch(SQLException e) {/*log(e)*/}
		}
		
		return false;
		
	}
	
}
