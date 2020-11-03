package doselectLab5;

import java.util.Scanner;

/**
 * 
 * @author Nula Sai Teja this class is created for Validate the full Name of a
 *         person and display proper message
 */
public class ValidateFullNameEx2 {

	void validateFullName(String firstName, String lastName, String fullName) throws FirstName, LastName {
		/**
		 * logic for checking name contain any blank
		 */
		if (fullName.trim().equalsIgnoreCase(firstName)) {
			throw new FirstName("last name is blank");
		} else if (fullName.trim().equalsIgnoreCase(lastName)) {
			throw new LastName("first name is blank");

		} else {
			System.out.println(" employee fullName: " + fullName);
		}
	}

	public static void main(String[] args) throws FirstName, LastName {
		ValidateFullNameEx2 employee = new ValidateFullNameEx2();
		Scanner sc = new Scanner(System.in);// creating a scanner obj
		System.out.println("enter the fistname");
		String firstName = sc.nextLine();// user input
		System.out.println("enter the Last name");
		String lastName = sc.nextLine();// user input
		String fullName = firstName + lastName;
		try {// Block of code to try
			employee.validateFullName(firstName, lastName, fullName);// calling the method for validation of fullName
		} catch (FirstName e) {
			// Block of code to handle errors
			System.out.println(e.getMessage());
		} catch (LastName e) {
			// Block of code to handle errors
			System.out.println(e.getMessage());
		}
	}

	/**
	 * 
	 * @author Nula Sai Teja this is default class for user defined exception
	 */
	class FirstName extends Exception {

		FirstName(String e) {
			/**
			 * Call parameter constructor of parent Exception
			 * 
			 * @param e
			 */
			super(e);
		}
	}

	class LastName extends Exception {

		LastName(String e) {
			/**
			 * Call parameter constructor of parent Exception
			 * 
			 * @param e
			 */
			super(e);
		}
	}
}