package Lab4;
/**
 * 
 * @author Nula Sai Teja
 *person class have personal details
 */
public class Person {
	/**
	 * @author Nula Sai Teja
	 *    name of the account holder
	 */
   private String name;
   /**
	 * @author Nula Sai Teja
	 *    age of the account holder
	 */
	
   private float age;
   public Person(String name, float age) {
		this.name = name;
		this.age = age;
	}
    public String getName() {
	return name;
    }
   public float getAge() {
	return age;
}
}
