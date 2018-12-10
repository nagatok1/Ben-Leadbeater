package deadPresidents;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Calendar cal = Calendar.getInstance();
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd yyyy");
	public static List<President> listOfPresidents = new ArrayList<President>();
	static int yearcount = 0;

	public static void main(String[] args) {
		try {
			File file = new File("presidents.txt");
			Scanner scanner = new Scanner(file);
			scanner.nextLine();
			while (scanner.hasNextLine()) {
				String temp = (scanner.nextLine());
				String[] parts = temp.split(",");
				String name = parts[0];
				String yearborntemp = parts[1].trim();
				String birthplace = parts[2];
				String yeardeadtemp = parts[3].trim();
				LocalDate yearborn = LocalDate.parse(yearborntemp,formatter);
				if (parts[3].length() < 2) {
					President president = new President(name, yearborn, birthplace);
					listOfPresidents.add(president);
					System.out.println(president);
					continue;
				} else {
					LocalDate yeardead = LocalDate.parse(yeardeadtemp,formatter);
					String deathlocation = parts[4];
					President president = new DeadPresident(name, yearborn, birthplace, yeardead,
							deathlocation);
					listOfPresidents.add(president);
					System.out.println(president);

				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		finally {
			for (int i = 1732; i <= 2018; i++) {
				for (President president : listOfPresidents) {
					if ((president.GetYearBorn() >= i)) {
						System.out.println("if statement1");
						if (president instanceof DeadPresident) {
							if (((DeadPresident) president).getYearDead() <= i) {

								yearcount++;
								System.out.println("Presidents Alive in " + i + " = " + yearcount);
							}
							else continue;

						}
						else continue;
					}
					else continue;
				}
			}
		}
	}
}