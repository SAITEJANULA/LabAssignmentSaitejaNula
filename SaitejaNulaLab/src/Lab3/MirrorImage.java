package Lab3;
/*
 * for mirror image */
import java.util.Scanner;
import java.util.*;

public class MirrorImage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//creating Scanner class object
		String str = sc.nextLine();//reading value from user
		String result = getImage(str);//Method calling

	}

	public static String getImage(String string)

	{
		int k = string.length();// Storing the length of the string

		for (int i = 0; i < k; i++) {
			System.out.print(string.charAt(i));// Storing the charecter refernce with index number
		}
		System.out.print("||");

		for (int i = (k - 1); i >= 0; i--)// condition for reverse of the String
		{
			System.out.print(string.charAt(i));
		}

		return string;//return the string
	}

}