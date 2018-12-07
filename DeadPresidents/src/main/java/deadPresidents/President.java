package deadPresidents;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class President {

	static private String name;
	static private Date yearborn;
	static private String yearborntemp;
	static private String birthplace;
	static private Date yeardead;
	static private String yeardeadtemp;
	static private String deathlocation;
	static private String temp;
	static Calendar cal = Calendar.getInstance();
	static SimpleDateFormat formatter = new SimpleDateFormat("MMM dd yyyy");
	public static List<President> listOfPresidents = new ArrayList<President>();

	public President(String vname, Date vyearborn, String vbirthplace, Date vyeardead, String vdeathlocation) {
		this.name = vname;
		this.yearborn = vyearborn;
		this.yeardead = vyeardead;
		this.birthplace = vbirthplace;

	}

	public static void PresidentScan() {
		try {
			File file = new File("presidents.txt");
			Scanner scanner = new Scanner(file);
			scanner.nextLine();
			while (scanner.hasNextLine()) {
				temp = scanner.nextLine();
				String[] parts = temp.split(",");
				name = parts[0];
				yearborntemp = parts[1].trim();
				try {
					yearborn = formatter.parse(yearborntemp);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				birthplace = parts[2];
				yeardeadtemp = parts[3].trim();
				if (parts[3].length() < 2) {
					continue;
				} else {
					try {
						yeardead = formatter.parse(yeardeadtemp);
					} catch (ParseException e) {
						e.printStackTrace();
					}
					deathlocation = parts[4];
				}
				President president = new President(name, yearborn, birthplace, yeardead, deathlocation);
				listOfPresidents.add(president);
				System.out.println(president);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return name + yearborn + birthplace + yeardead + deathlocation;
	}
}
