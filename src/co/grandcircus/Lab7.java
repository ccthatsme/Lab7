package co.grandcircus;

import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(nameValidation(scan));
		System.out.println(emailValidation(scan));
		System.out.println(phoneValidation(scan));
		System.out.println(dateValidation(scan));
	}

	public static String nameValidation(Scanner scan) {
		boolean check = false;
		String correctName = null;
		while (!check) {
			System.out.println("Please enter a valid Name: ");
			correctName = scan.nextLine();
			if (correctName.matches("^[a-z A-Z ,.'-]{1,31}+$")) {
				System.out.println("Valid Name!");
				check = true;
			} else {
				System.out.println("Sorry, name is not valid!");
			}
		}
		return correctName;
	}

	public static String emailValidation(Scanner scan) {
		boolean check = false;
		String correctEmail = null;
		while (!check) {
			System.out.println("Please enter a valid email: (ex: chrisciric@yahoo.com)");
			correctEmail = scan.nextLine();
			if (correctEmail.matches("[a-z A-Z 0-9]{5,30}\\@[a-z A-Z 0-9]{5,10}\\.[a-z A-Z 0-9]{2,3}")) {
				System.out.println("Valid Email!");
				check = true;
			} else {
				System.out.println("Sorry, name is not valid!");
			}
		}
		return correctEmail;
	}

	public static String phoneValidation(Scanner scan) {
		boolean check = false;
		String correctPhone = null;
		while (!check) {
			System.out.println("Please enter a valid phone number: (ex. 123-123-1234) ");
			correctPhone = scan.nextLine();
			if (correctPhone.matches("[0-9]{3}\\-[0-9]{3}\\-[0-9]{4}")) {
				System.out.println("Valid phone!");
				check = true;
			} else {
				System.out.println("Sorry, phone is not valid!");
			}
		}
		return correctPhone;

	}

	public static String dateValidation(Scanner scan) {
		boolean check = false;
		String correctDate = null;
		while (!check) {
			System.out.println("Please enter date: mm/dd/yyyy ");
			correctDate = scan.nextLine();
			if (correctDate.matches("[0-9]{2}\\/[0-9]{2}\\/[0-9]{4}")) {
				System.out.println("Valid Date!");
				check = true;
			} else {
				System.out.println("Sorry, Date is not valid!");
			}
		}
		return correctDate;
	}
}
