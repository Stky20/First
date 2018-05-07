package by.htp.accauntant.bin;

import java.util.GregorianCalendar;

public class Income {

	private int id;
	private int userID;
	private String title;
	private IncomeType incomeType;
	private double income;	
	private String remark;
	private GregorianCalendar incomeDate;
	
		public Income(int userID, String title, IncomeType incomeType, double income) {
		
			this.userID = userID;
			this.title = title;
			this.incomeType = incomeType;
			this.income = income;
		
		}
	
		public Income(int id, int userID, String title, IncomeType incomeType, double income, String remark, GregorianCalendar incomeDate) {
		
			this.id = id;
			this.userID = userID;
			this.title = title;
			this.incomeType = incomeType;
			this.income = income;
			this.remark = remark;
			this.incomeDate = incomeDate;
		
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

		public IncomeType getIncomeType() {
			return incomeType;
		}

		public void setIncomeType(IncomeType incomeType) {
			this.incomeType = incomeType;
		}

		public double getIncome() {
			return income;
		}

		public void setIncome(double income) {
			this.income = income;
		}

		public String getRemark() {
			return remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public GregorianCalendar getIncomeDate() {
			return incomeDate;
		}

		public void setIncomeDate(GregorianCalendar incomeDate) {
			this.incomeDate = incomeDate;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			long temp;
			temp = Double.doubleToLongBits(income);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + ((incomeDate == null) ? 0 : incomeDate.hashCode());
			result = prime * result + ((incomeType == null) ? 0 : incomeType.hashCode());
			result = prime * result + ((remark == null) ? 0 : remark.hashCode());
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
			Income other = (Income) obj;
			if (id != other.id)
				return false;
			if (Double.doubleToLongBits(income) != Double.doubleToLongBits(other.income))
				return false;
			if (incomeDate == null) {
				if (other.incomeDate != null)
					return false;
			} else if (!incomeDate.equals(other.incomeDate))
				return false;
			if (incomeType != other.incomeType)
				return false;
			if (remark == null) {
				if (other.remark != null)
					return false;
			} else if (!remark.equals(other.remark))
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
			return "Income [id=" + id + ", userID=" + userID + ", title=" + title + ", incomeType=" + incomeType
					+ ", income=" + income + ", remark=" + remark + ", incomeDate=" + incomeDate + "]";
		}
		
		
		

}
