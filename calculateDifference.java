


	import java.io.*;
	import java.util.*;

	public class calculateDifference  {
		public static void main(String args[] ) {
					Scanner sc=new Scanner(System.in);
					calculateDifference s1=new calculateDifference();
			int input=sc.nextInt();
			System.out.println(s1.calculate(input));
			sc.close();
		}
		public int calculate (int n)
		{
		    int sum=0,ps=0,res=0;
		    for(int i=0;i<=n;i++)
		    {
		        ps=ps+(i*i);
		        sum=sum+i;
		    }
		    int prod=sum*sum;
		    res=ps-prod;
		    return res;
		}
	}

