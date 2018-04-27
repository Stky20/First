package by.htp.nb.entity;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Note {
	
	private GregorianCalendar date;
	private String text;
	
	public Note(String text) {
		date = new GregorianCalendar();
		this.text = text;
	}

	public GregorianCalendar getDate() {
		return date;
	}

	public void setDate(int day, int month, int year) {
		GregorianCalendar date = new GregorianCalendar();
		date.set(Calendar.DAY_OF_MONTH, day);
		date.set(Calendar.MONTH, (month - 1));
		date.set(Calendar.YEAR, year);
		this.date = date;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
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
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return date.get(Calendar.DAY_OF_MONTH) +"/" + (date.get(Calendar.MONTH) + 1) + "/" + date.get(Calendar.YEAR) + "/" + text;
	}
	
	
	
}
