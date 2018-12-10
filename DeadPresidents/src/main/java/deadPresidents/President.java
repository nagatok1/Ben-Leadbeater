package deadPresidents;

import java.util.Date;
import java.time.LocalDate;
import java.util.Calendar;

public class President {

	private String name;
	private LocalDate yearborn;
	private String birthplace;
	
	public President(String vname, LocalDate vyearborn, String vbirthplace) {
		this.name = vname;
		this.yearborn = vyearborn;
		this.birthplace = vbirthplace;

	}
	public String GetName() {
		return this.name;
	}
	public LocalDate GetBirthDate() {
		return this.yearborn;
	}
	public int GetYearBorn() {
		return yearborn.getYear();
	}
	
	public String GetBirthPlace() {
		return this.birthplace;
	}
	
	

	@Override
	public String toString() {
		return name + yearborn + birthplace;
	}
	
}
