package doselectLab5;

import java.util.Scanner;

/**
 * 
 * @author Nula Sai Teja
 *  this class is created for Validate the age of a person
 *         and display proper message
 */

public class  ValidateAgeEx1 {
	/**
	 * logic for checking age
	 */
	static void age(int age) throws Age {
		if (age< 15) {
			throw new Age("invalid age");
		} else {
			System.out.println("valid age");
		}
	}

	public static void main(String[] args) throws Age {
		Scanner sc = new Scanner(System.in);//creating a scanner obj
		int age = sc.nextInt();//user input

		try {
		//  Block of code to try
			age(age);
			//calling the method for age validation
		} catch (Age e) {
		//  Block of code to handle errors
			System.out.println(e.getMessage());
		}
	}

}
/**
 * 
 * @author Nula Sai Teja
 *this is default class  for user defined exception
 */
class Age extends Exception {
	public Age() {
		// Call constructor of parent Exception
		super();
	}

	public Age(String e) {
		// Call parameter constructor of parent Exception
		super(e);
	}
}
