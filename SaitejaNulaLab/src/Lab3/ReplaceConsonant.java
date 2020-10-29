package Lab3;
import java.lang.*;
/*replacing next immediate alphabets except vowels*/
import java.util.Scanner;
public class ReplaceConsonant {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);;//creating Scanner class object
		System.out.println("Enter a string");
		String str=new String();//Instantiation
		str=sc.nextLine();//reading value from user 
		String result=alterImage(str.toCharArray());
		System.out.println("After replace consonant\n"+result); 
	}

	private static String alterImage(char[] str) {
		// TODO Auto-generated method stub
		for(int i=0;i<str.length;i++) {
			if(str[i]=='a' || str[i]=='e'|| str[i]=='i' || str[i]=='o' || str[i]=='u') { //check vowels
				str[i]=(char)str[i]; //if vowels found in the string then the vowels are same
			}
			else {
				if(str[i]=='z') {  // string contain z then we replace z to b
					str[i]='b';
				}
				else {
					str[i]= (char)(str[i]+1); //next immediate alphabets
				}
				
			}
		}
		return String.valueOf(str); //return replace all he consonant
	}
}