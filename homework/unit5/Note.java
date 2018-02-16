package by.htp.jd1_2018.homework.unit5;


	public class Note implements Cloneable, Comparable<Note> {
		private String text;
		private Data date;
		private Boolean isActual;
		
		public Note(){}
		
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		
		public Boolean getIsActual() {
			return isActual;
		}
		public void setIsActual(Boolean isActual) {
			this.isActual = isActual;
		}
		
		public Data getDate() {
			return date;
		}
		
		public void setDate(Data date) {
			this.date = date;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((date == null) ? 0 : date.hashCode());
			result = prime * result
					+ ((isActual == null) ? 0 : isActual.hashCode());
			result = prime * result + ((text == null) ? 0 : text.hashCode());
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
			Note other = (Note) obj;
			if (date == null) {
				if (other.date != null)
					return false;
			} else if (!date.equals(other.date))
				return false;
			if (isActual == null) {
				if (other.isActual != null)
					return false;
			} else if (!isActual.equals(other.isActual))
				return false;
			if (text == null) {
				if (other.text != null)
					return false;
			} else if (!text.equals(other.text))
				return false;
			return true;
		}
		
		@Override
		public Object clone() throws CloneNotSupportedException{
			Note obj=(Note)super.clone();
			
			Data newDate = (Data)date.clone();
			obj.setDate(newDate);
			return obj;
		}
		
		public Note(String text, Data date, Boolean isActual){
			this.text=text;
			this.date=date;
			this.isActual=isActual;
		}
		
		@Override
		public int compareTo(Note arg0) {
			int year1;
			int year2;
			
			year1=date.getYear();
			year2=arg0.getDate().getYear();
			
			if(year1>year2){
				return 1;
			}
			
			if(year1<year2){
				return -1;
			}
			return 0;
		}
		
}
	