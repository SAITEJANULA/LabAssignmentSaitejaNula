import java.util.Scanner;

public class cubesOfNumber {
	private static void cudesOfNuber(int giveNumber) {
		// TODO Auto-generated method stub
		int sum = 0; 
        for (int x=1; x<=giveNumber; x++) {
            sum += x*x*x; 
        
	}
        System.out.println("sum of the cube of "+giveNumber+" is :"+sum);}
	
   static int giveNumber;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Enter the nunber");
   Scanner sc=new Scanner(System.in);
   giveNumber=sc.nextInt();
   cudesOfNuber(giveNumber);
  
	}
	

}
