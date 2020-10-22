
public class SumOfNumberDividedBy3_5 {
	
		  
	
		static int sum(int N)  
		{  
		    int firstDivider, secondDivider,commonDivider;  
		  
		    firstDivider = ((N / 3)) * (2 * 3 + (N / 3 - 1) * 3) / 2;  
		    secondDivider = ((N / 5)) * (2 * 5 + (N / 5 - 1) * 5) / 2;  
		    commonDivider = ((N / 12)) * (2 * 15 + (N / 15 - 1) * 15) / 2;  
		  
		    return firstDivider + secondDivider - commonDivider;  
		}  
		  
		
		 public static void main (String[] args) { 
		    int N = 5;  
		  
		    System.out.print(sum(N));  
		} 
		  
		}  

