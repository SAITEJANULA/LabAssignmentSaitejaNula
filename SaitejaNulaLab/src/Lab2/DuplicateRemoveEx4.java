package Lab2;
import java.util.*;
/*
 * removes all the duplicates in the array. Return the resulting array in descending order*/
public class DuplicateRemoveEx4{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//creating Scanner class object 
		int size;//Declaration the size
		System.out.println("Enter the size of an array");
		size=sc.nextInt();//Initializing the length variable for the length of the array
		int array[]=new int[size];//declaration and instantiation
		System.out.println("Enter the numbers to the array:");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		//Calling the modifyArray() method with one par
		int resultArray[]=modifyArray(array);
		for(int i=resultArray.length-1;i>=0;i--) {
			System.out.println(resultArray[i]+" ");
		}
		

	}
	private static int[] modifyArray(int[] array) {
		//Initializing the length variable for the length of the array
		int length=array.length;
			int[] newArray = new int[length];
			int j = 0;
			

			Arrays.sort(array); //sort the array
			
			//Logic to remove duplicate elements
			
			for(int i=0;i<length-1;i++)
			{
				if(array[i]!=array[i+1])
				{
					newArray[j] = array[i];  //If the next element is not the same as the previous
					j++						// the element is added to the new temporary array
	;					
				}
			}
			newArray[j++] = array[length-1]; //the final element of the original array is added to the new array to avoid null values
			
			
			int[] resultArray = new int[j];  //A new array is initialized for the resultant array
			
			for(int i=0;i<j;i++)
			{
				resultArray[i] = newArray[i];  /**The values of the temporary array minus the final value
												* of the temporary array is copied to the final resultant array
												*/
			}	
			
			return resultArray;
		}
	}

