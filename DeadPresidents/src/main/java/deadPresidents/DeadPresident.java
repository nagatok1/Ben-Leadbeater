package deadPresidents;

import java.time.LocalDate;
import java.util.Date;

public class DeadPresident extends President{
	
	private LocalDate yeardead;
	private String deathlocation;
	
	public DeadPresident(String vname, LocalDate vyearborn, String vbirthplace, LocalDate vyeardead, String vdeathlocation) {
		super(vname, vyearborn, vbirthplace);
		this.yeardead = vyeardead;
		this.deathlocation = vdeathlocation;
	}
	
	public LocalDate getDeathDate() {
		return yeardead;
	}
	public int getYearDead() {
		return yeardead.getYear();
	}
	public String getDeathLocation() {
		return deathlocation;
	}
	
	
	

}
