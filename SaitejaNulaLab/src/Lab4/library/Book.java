package Lab4.library;
/**
 * @author Nula Sai Teja
 *The subclass Book display the overridden methods 
 */
public class Book extends WrittenItem{
	public void getBook()
	{
	setTotal_copies(50);
	getDetails();
    displayDetails();
    AvailableCopies();
   
}
}