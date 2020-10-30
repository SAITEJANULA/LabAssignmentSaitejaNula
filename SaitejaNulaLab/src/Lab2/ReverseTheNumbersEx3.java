package Lab2;
/*
 * reverse the numbers in the array and returns the resulting array in sorted order*/
import java.util.Scanner;

public class ReverseTheNumbersEx3{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//creating Scanner class object    
		int length;//declaration
		
		//Initializing the length variable for the length of the array
		System.out.println("Enter the number of elements in the array : ");
		length = sc.nextInt();//reading value from user
		
		//Declaring and Instantiating the Integer array
		int[] arr = new int[length];
		
		//Initializing the array with values
		System.out.println("Enter "+length+" numbers : ");
		for(int i =0;i<length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		//Calling getSorted() method
		int[] result = getSorted(arr);
		
		//Prints the result
		for(int i =0;i<length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		
	}

	
	//Definition for the getSorted method - reverses the digits of the numbers and sorts it
	private static int[] getSorted(int[] arr) {
		int n = arr.length;
		
		for(int i=0;i<n;i++)
		{
			arr[i] = reverse(arr[i]); //calls the reverse() method to reverse the element
		}
		
		for(int i=0;i<arr.length;i++)  //Sorting the array in ascending order
		{
			for(int j=0;j<i;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp;
				}
			}
		}
		return arr;
	}


	//Definition for the reverse() method which reverses the digits of individual elements
	private static int reverse(int number) {
		int temporaryNumber = number;
		int count = 0;
		String sum = null;
		
		while(temporaryNumber!=0) //Counts the number of digits in the number
		{
			temporaryNumber = temporaryNumber/10;
			count++;
		}
		
		for(int i =1;i<=count;i++) //Reverses the digits by individually adding each digit in a loop
		{
			int s = number%10;
			number = number/10;
			String d = Integer.toString(s); //converts the digit to string
			if(sum == null)    //checks if the sum string is null
				sum = d;
			else		
				sum = sum + d; 		//concatenates the digits one by one
		}
		
		int result = Integer.parseInt(sum); //converts the string back to an integer
		
		return result; //returns the reversed digit
	}

}
