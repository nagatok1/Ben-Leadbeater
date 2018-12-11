package garage;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Garage> Garage1 = new ArrayList<Garage>();

	public static void main(String[] args) {
		Car F458 = new Car("458", "Ferrari", 1);
		Bus Enviro300 = new Bus("Alexander Dennis", "Enviro300", 10);
		Motorcycle Katana = new Motorcycle("Katana", "Suzuki", 100);
		Garage1.add(F458);
		Garage1.add(Enviro300);
		Garage1.add(Katana);
		EnterMenu();

		for (Garage a : Garage1) {
			System.out.println(a);

		}

	}

	public static void EnterMenu() {
		while (true) {
			System.out.println("What kind of Vehicle would you like to Input?");
			System.out.println("1 - Car");
			System.out.println("2 - Bus");
			System.out.println("3 - Motorcycle");
			System.out.println("4 - Print Garage");
			System.out.println("5 - Exit");
			Scanner scan2 = new Scanner(System.in);
			int choice = scan.nextInt();
			if (choice == 1) {
				System.out.println("Enter Car Name");
				String ScanName = scan2.nextLine();
				System.out.println("Enter Car Make");
				String ScanMake = scan2.nextLine();
				System.out.println("Enter Car Top Speed");
				int ScanSpeed = scan2.nextInt();
				Car Car = new Car(ScanName, ScanMake, ScanSpeed);
				Garage1.add(Car);
			}
			if (choice == 2) {
				System.out.println("Enter Bus Name");
				String ScanName = scan2.nextLine();
				System.out.println("Enter Bus Make");
				String ScanMake = scan2.nextLine();
				System.out.println("Enter Bus Top Speed");
				int ScanSpeed = scan2.nextInt();
				Bus Bus = new Bus(ScanName, ScanMake, ScanSpeed);
				Garage1.add(Bus);
			}
			if (choice == 3) {
				System.out.println("Enter Motorcycle Name");
				String ScanName = scan2.nextLine();
				System.out.println("Enter Motorcycle Make");
				String ScanMake = scan2.nextLine();
				System.out.println("Enter Motorcycle Top Speed");
				int ScanSpeed = scan2.nextInt();
				Motorcycle Motorcycle = new Motorcycle(ScanName, ScanMake, ScanSpeed);
				Garage1.add(Motorcycle);
			}
			if (choice == 4) {
				System.out.println(Garage1);
				break;
			}
			if (choice == 5) {
				scan2.close();
				System.exit(0);
			}
		}
	}
}