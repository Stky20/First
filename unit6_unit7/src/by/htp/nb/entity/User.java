package by.htp.nb.entity;

public class User {
	int id;
	private String nickName;
	private String password;
	boolean isLogedIn;
	
	private String name;
	private String surname;
	
	public User (int id, String nickName, String password) {
		this.id = id;
		this.isLogedIn = true;
		this.nickName = nickName;
		this.password = password;
		this.name = null;
		this.surname = null;		
	}
	
	public User (int id, String nickName, String password, String name, String surname) {
		this.id = id;
		this.isLogedIn = true;
		this.nickName = nickName;
		this.password = password;
		this.name = name;
		this.surname = surname;
	}
	
	public int getId() {
		return id;
	}
	
	public boolean isLogedIn() {
		return isLogedIn;
	}

	public void setLogedIn(boolean isLogedIn) {
		this.isLogedIn = isLogedIn;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nickName == null) ? 0 : nickName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nickName == null) {
			if (other.nickName != null)
				return false;
		} else if (!nickName.equals(other.nickName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return id + "/ nickName=/" + nickName + "/ password=/" + password + "/ name=/" + name + "/ surname=/"
				+ surname;
	}
	
	

}
