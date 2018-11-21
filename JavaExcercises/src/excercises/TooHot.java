package excercises;

public class TooHot {

public static void main(String[] args) {
	TooHot1(100 , true);
	}
public static boolean TooHot1(int temp, boolean isSummer) {
	boolean tempOK = true;
	if (isSummer == true) {
		if ((temp >= 60) && (temp <= 100)) {
			System.out.println("Temperature OK");
			tempOK = true;
		}
		else if (temp > 100) {
			System.out.println("TOO HOT");
			tempOK = false;
		}
		else if (temp < 60) {
			System.out.println("TOO COLD");
			tempOK = false;
		}
	}
	else if (isSummer == false) {
		if ((temp >= 60) && (temp <= 90)) {
			System.out.println("Temperature OK");
			tempOK = true;
		}
		else if (temp > 90) {
			System.out.println("TOO HOT");
			tempOK = false;
		}
		else if (temp < 60) {
			System.out.println("TOO COLD");
			tempOK = false;
		}
	}
	return tempOK;
}
}
