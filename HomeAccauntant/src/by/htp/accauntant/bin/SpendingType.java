package by.htp.accauntant.bin;

public enum SpendingType {

	TYPE1, TYPE2, TYPE3, TYPE4;
	
	private String title;
	
	
	private SpendingType() {
		this.title = "";		
	}
	
	private SpendingType(String title) {
		this.title = title;		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	
	
	
}
