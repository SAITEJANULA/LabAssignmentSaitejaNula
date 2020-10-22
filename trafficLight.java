import java.util.Scanner;

public class trafficLight {
	static String light;
public static void display(String light2) {
	
	if(light.equalsIgnoreCase("Red"))
	{
		System.out.println("Stop");
	}
	else if (light.equalsIgnoreCase("Yellow")) {
		System.out.println("Ready");
	}
	else if(light.equalsIgnoreCase("Green")) {
		System.out.println("Go");
		}
}
	public static void main(String[] args) 
{
		
   System.out.print("Select light: \nRed-stop\nYellow-ready\nGreen-stop\n");
   System.out.println("Enter your choise:");
   Scanner sc=new Scanner(System.in);
   light=sc.nextLine();
   display(light);

}
	}
