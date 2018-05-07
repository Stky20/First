package by.htp.accauntant.bin;

public enum IncomeType {

	TYPE1, TYPE2;
	
	private String title;
	
	
	private IncomeType() {
		this.title = "";		
	}
	
	private IncomeType(String title) {
		this.title = title;		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
