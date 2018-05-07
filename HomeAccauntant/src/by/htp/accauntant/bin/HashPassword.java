package by.htp.accauntant.bin;

public class HashPassword {
	private String hashPassword;
	
	public HashPassword() {
		this.hashPassword = "";
	}
		
	public HashPassword(String password) {
		hashPassword = password.hashCode() + "";
	}
	
	public String getHashPassword() {
		return hashPassword;
	}

	public void setHashPassword(String hashPassword) {
		this.hashPassword = hashPassword;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * (result + ((hashPassword == null) ? 0 : hashPassword.hashCode()));
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
		HashPassword other = (HashPassword) obj;
		if (hashPassword == null) {
			if (other.hashPassword != null)
				return false;
		} else if (!hashPassword.equals(other.hashPassword))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return hashPassword;
	}
	
	

}
