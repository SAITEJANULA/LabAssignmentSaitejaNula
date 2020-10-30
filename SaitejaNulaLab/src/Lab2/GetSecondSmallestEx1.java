package Lab2;
/*
 * finding the second smallest element in sequence*/
import java.util.Arrays;
import java.util.Scanner;

public class GetSecondSmallestEx1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter the array size: ");
        Scanner sc=new Scanner(System.in);//creating Scanner class object
        int size=sc.nextInt();//reading value from user
        int array[]=new int[size];//declaration and instantiation
		System.out.println("Enter array values: ");
		 for(int i=0;i<array.length;i++) {
	        	array[i]=sc.nextInt();
	        }
        int secondSmallestValue=getSecondSmallest(array);//creating method which returns an array 
        System.out.print("SecondSmallest Element is:"+secondSmallestValue);
        sc.close();
	}
	//Logic
	private static int getSecondSmallest(int[] array) {
		// TODO Auto-generated method stub
        Arrays.sort(array);
        return array[1];		
	}

}

