package Lab3;

import java.util.Scanner;/*
*/
import java.util.StringTokenizer;

public class IntegerSumTokenizer {
	//converts the string into an integer and add the sum

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//creating Scanner class object 
		int sum = 0; String integerLine;//Initialization
		System.out.println("Enter a line of integers with each integer seperated by a comma and no spaces (,) : ");
		integerLine = sc.nextLine();//reading value from user
	String []split=integerLine.split(",");
		for(String st1:split) {
			int a=Integer.parseInt(st1); //converts the string into an integer 
			sum = sum +a; //adds the sum
		}
		System.out.println("The sum of the integers is : "+sum); //prints the sum
		
		

	}

}
