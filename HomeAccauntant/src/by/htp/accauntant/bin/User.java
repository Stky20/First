package by.htp.accauntant.bin;

public class User {
	private int id;
	private String nickName;
	private HashPassword hashPassword;
	private String name;
	private String surname;
	private String e_mail;
	
	public User() {
		
		this.nickName = null;
		this.hashPassword = new HashPassword();
		this.name = null;
		this.surname = null;
		this.e_mail = null;
	}
	
	
	public User(String nickName, String password) {
		this.nickName = nickName;
		this.hashPassword = new HashPassword (password);
		this.name = null;
		this.surname = null;
		this.e_mail = null;
	}


	public User(int id, String nickName, String hashPassword, String name, String surname, String e_mail) {
		this.id = id;
		this.nickName = nickName;
		(this.hashPassword = new HashPassword()).setHashPassword(hashPassword);
		this.name = name;
		this.surname = surname;
		this.e_mail = e_mail;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNickName() {
		return nickName;
	}


	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	
	public void setHashPassword(String password) {
		this.hashPassword = new HashPassword(password);
	}
	
	
	public void setHashPassword(HashPassword hashPassword) {
		this.hashPassword = hashPassword;
	}
	
	
	public HashPassword getHashPassword() {
		return hashPassword;
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
	
	public String getE_mail() {
		return e_mail;
	}


	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((e_mail == null) ? 0 : e_mail.hashCode());
		result = prime * result + ((hashPassword == null) ? 0 : hashPassword.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nickName == null) ? 0 : nickName.hashCode());
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
		if (e_mail == null) {
			if (other.e_mail != null)
				return false;
		} else if (!e_mail.equals(other.e_mail))
			return false;
		if (hashPassword == null) {
			if (other.hashPassword != null)
				return false;
		} else if (!hashPassword.equals(other.hashPassword))
			return false;
		if (id != other.id)
			return false;
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
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", nickName=" + nickName + ", name=" + name + ", surname=" + surname + ", e_mail="
				+ e_mail + "]";
	}
	
	
}