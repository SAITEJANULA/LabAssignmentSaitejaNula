package Lab4.library;
/**
 * @author Nula Sai Teja
 *  abstract superclass Item that define all common operations common information that the library must have for every item 
 */
public abstract class Item {
	/**
	 * @author Nula Sai Teja
	 *    unique id of the item
	 */
	
	private long id;
	/**
	 * @author Nula Sai Teja
	 *    title of the item
	 */
	
	private String title;
	/**
	 * @author Nula Sai Teja
	 *   number of copies taken from the user
	 */
	
	private int number_of_copies;
	/**
	 * @author Nula Sai Teja
	 *    total number of copies available
	 */
	
	private int total_copies;

	public int getTotal_copies() {
		return total_copies;
	}

	public void setTotal_copies(int total_copies) {
		this.total_copies = total_copies;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumber_of_copies() {
		return number_of_copies;
	}
	public void setNumber_of_copies(int number_of_copies) {
		this.number_of_copies = number_of_copies;
	}
	/**
	 * @author Nula Sai Teja
	 *This method gets the input from the user
	 */
	public abstract void getDetails();
	/**
	 * @author Nula Sai Teja
	 *This method display the available details
	 */
	public abstract void displayDetails();
	/**
	 * @author Nula Sai Teja
	 *This method will calculate the available copies of media item and update 
	 */

	public abstract void AvailableCopies();
	
}
