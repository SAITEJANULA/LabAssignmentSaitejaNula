import java.util.Scanner;
public class checkNumber{
	public static void main(String args[] ) {
		
		Scanner sc=new Scanner(System.in);
		
		int num = sc.nextInt();
		checkNumber src=new checkNumber();
		System.out.println(src.check(num));
		}
		public boolean check(int input)
		{
			int lastSeen=10;
			int current;
			while(input>0)
			{
				current=input%10;
				if(lastSeen<current)
				return false;
				lastSeen=current;
				input/=10;
			}
			return true;
		}
}