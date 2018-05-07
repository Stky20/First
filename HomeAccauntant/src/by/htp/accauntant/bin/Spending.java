package by.htp.accauntant.bin;

import java.util.GregorianCalendar;

public class Spending {
	
	private int id;
	private int userID;
	private String title;
	private SpendingType spendingType;
	private double spending;	
	private String remark;
	private GregorianCalendar spendingDate = new GregorianCalendar();
	
	public Spending(int userID, String title, SpendingType spendingType, double spending) {
		
		this.userID = userID;
		this.title = title;
		this.spendingType = spendingType;
		this.spending = spending;
		
	}

	public Spending(int userID, String title, SpendingType spendingType, double spending, String remark) {
		
		this.userID = userID;
		this.title = title;
		this.spendingType = spendingType;
		this.spending = spending;
		this.remark = remark;
		
	}
	
	public Spending(int id, int userID, String title, SpendingType spendingType, double spending, String remark, GregorianCalendar spendingDate) {
		
		this.id = id;
		this.userID = userID;
		this.title = title;
		this.spendingType = spendingType;
		this.spending = spending;
		this.remark = remark;
		this.spendingDate = spendingDate;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public SpendingType getSpendingType() {
		return spendingType;
	}

	public void setSpendingType(SpendingType spendingType) {
		this.spendingType = spendingType;
	}

	public double getSpending() {
		return spending;
	}

	public void setSpending(double spending) {
		this.spending = spending;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public GregorianCalendar getSpendingDate() {
		return spendingDate;
	}

	public void setSpendingDate(GregorianCalendar spendingDate) {
		this.spendingDate = spendingDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		long temp;
		temp = Double.doubleToLongBits(spending);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((spendingDate == null) ? 0 : spendingDate.hashCode());
		result = prime * result + ((spendingType == null) ? 0 : spendingType.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + userID;
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
		Spending other = (Spending) obj;
		if (id != other.id)
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		if (Double.doubleToLongBits(spending) != Double.doubleToLongBits(other.spending))
			return false;
		if (spendingDate == null) {
			if (other.spendingDate != null)
				return false;
		} else if (!spendingDate.equals(other.spendingDate))
			return false;
		if (spendingType != other.spendingType)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (userID != other.userID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Spending [id=" + id + ", userID=" + userID + ", title=" + title + ", spendingType=" + spendingType
				+ ", spending=" + spending + ", remark=" + remark + ", spendingDate=" + spendingDate + "]";
	}
	
	
	
}
