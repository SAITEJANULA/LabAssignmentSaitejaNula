package Lab3;
import java.util.*;
import java.text.*;
/**creating for current date
 * 
 */
public class DurationEx9{//creating for current date
	public static void main(String args[]) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");//predefine class
		Date date = new Date();//predefine class
		String str=formatter.format(date);
		String ch[]=str.split("/");//Splitting date
		System.out.println("Date="+ch[0]);//Accessing day
		System.out.println("Month="+ch[1]);//Accessing month
		System.out.println("Year="+ch[2]);//Accessing year
	}
}