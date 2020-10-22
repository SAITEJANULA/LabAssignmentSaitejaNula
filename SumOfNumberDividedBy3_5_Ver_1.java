import java.util.Scanner;

public class SumOfNumberDividedBy3_5_Ver_1.1 {
	
	  static int givenNumber,sum=0;
	
		static void sum(int givenNumber)  
		
		{ 
			for(int i=1;i<=givenNumber;i++)
			if(i%3==0||i%5==0)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		  
		   
		}  
		  
		
		 public static void main (String[] args) { 
		    System.out.println("enter the number"); 
		    Scanner sc=new Scanner(System.in);
		    givenNumber =sc.nextInt();
		  
		    sum(givenNumber);
		} 
		  
		}  

