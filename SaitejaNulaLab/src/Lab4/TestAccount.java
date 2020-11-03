package Lab4;
import java.util.Random;
/**
 * 
 * @author Nula Sai Teja
 *
 */
public class TestAccount {

	public static void main(String args[])
	 {
		 Random rand = new Random(); // instantiation
		 long accountnumber=rand.nextLong();// Initializing 
		 Person p=new Person("SMITH",30);
		 Account obj=new Account(accountnumber,2000,p);
		 obj.deposit(2000);//calling the deposit method
		 System.out.println("Balance in smith account is "+obj.getBalance());
		 Person p1=new Person("KATHY",35);
		 long accountnumber1=rand.nextLong();// Initializing 
		 Account obj1=new Account(accountnumber1,3000,p1);
		 obj1.withdraw(2000);//calling the withdraw method
		 System.out.println("Balance in kathy account is "+obj1.getBalance());
		 Account s=new SavingsAccount(accountnumber,obj.getBalance(),p);
		 CurrentAccount c=new CurrentAccount(accountnumber,obj.getBalance(),p);
		 s.withdraw(3500);
		 System.out.println("Balance in smith account is "+s.getBalance());
		 System.out.println("Is overdraft limit reached??"+c.withdraw());
		 s.withdraw(500);
		 System.out.println("Balance in smith account is "+s.getBalance());
		
	 }
}
