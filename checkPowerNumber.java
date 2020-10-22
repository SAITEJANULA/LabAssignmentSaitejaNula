import java.util.Scanner;

public class checkPowerNumber {
		public static boolean checkNumber(int n)
		{
			if(n==0)
				return false;
			while(n!=1) {
				if(n%2!=0) 
					return false;
					n=n/2;
				
			}return true;
		
			}
		public static void main(String args[] ) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			boolean s=checkNumber(n);
			System.out.println(s);
		}
	}


