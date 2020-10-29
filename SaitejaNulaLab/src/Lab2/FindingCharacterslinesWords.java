package Lab2;

import java.util.Scanner;

public class FindingCharacterslinesWords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);//creating Scanner class object
		String string= sc.nextLine();//reading value from user
		int result = calculateWords(string);//method calling

	}

	public static int calculateWords(String string) {

		int words = 0, character = 0, line = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == ' ')// condition for empty space in a String
			{
				words++;
			}
			if (string.charAt(i) == '\n')// condition for next line
			{
				line++;
			}
			character++;
		}

		System.out.println("characters =" + character + " words " + words + " Lines " + line);
		return line;
	}
}
