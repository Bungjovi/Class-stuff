import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Person {
	// THIS DOES NOT BELONG TO THE INSTANCE OF THIS CLASS
	//-----------------------------------------------------
public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		
		List<Person> people = new ArrayList<Person>();
		
		Person p1 = new Person();
		p1.setFirstName("Fred");
		p1.setLastName("Flintstone");
		people.add(p1);
		
		Person p2 = new Person();
		p2.setFirstName("Stewie");
		p2.setLastName("Griffin");
		people.add(p2);
		
		Person p3 = new Person();
		p3.setFirstName("Jeffrey");
		p3.setLastName("Dahmer");
		people.add(p3);
		
		Person p4 = new Person();
		p4.setFirstName("Wesley");
		p4.setLastName("Snipes");
		people.add(p4);
		
		
		// Sorting - Order by (SQL)
		// Filtering - Where (returns you a subset of list)
		
		
		// Lamda Expression--- () ->, or () =>
		/*public int sort(Person x, Person y) {
		 *    x.getFirstName().compareTo(y.getFirstName());
		 * Ascending and Descending
		 */
		
		//Collections.sort(people, (x , y) -> x.getFirstName().compareTo(y.getFirstName()));
		
		// Stream | ParallelStream
		// Collections - a stream represents functions to manage a collection
		// Stream- single threaded apartment model - used when order is priority
		// ParallelStream- Parallel processing model - used when order does not matter
		// What is the difference between 
		// Parallel vs Thread
		//------------------------------------------------
		// Race condition - First in wins 
		// Deadlock- where one thread does not release resources, locks other threads out
		
		people.stream()
//		.filter(x -> x.getFirstName().startsWith("W") && x.getLastName().startsWith("S"))
		.sorted((x , y) -> Integer.compare(x.getAge(), y.getAge()))
		.forEach(x -> System.out.println(x.getFirstName() + " " + x.getLastName() + " " + x.getAge()));
		System.out.println("\n ");
		
		
		
		people.parallelStream().forEach(x -> System.out.println(x.getFirstName() + " " + x.getLastName()));
		System.out.println("\n ");
		
		for(Person p : people){
			System.out.println(p.getFirstName() + " " + p.getLastName());
		}
		
		//Indeterminate amount of people unlimited amount Use a For loop to add to array of people
		System.out.print("How many people do you want to enter: ");
		int numPeople = Integer.parseInt(in.nextLine());
		
		User[] peeps = new User[numPeople];
		
		for(int i = 0; i < numPeople; i++){
			User p = new User();
			System.out.print("Enter First Name: ");
			p.setFirstName(in.nextLine());
			System.out.print("Enter Last Name: ");
			p.setLastName(in.nextLine());
			
//			peeps[i] = u;
//			people.add(u);
		}
		// Prints them out
		for(Person t : people){
			char[] fnArray = t.getFirstName().toCharArray();
			
			if(t.getLastName().startsWith("L") || t.getLastName().startsWith("W"))
			System.out.println("Name: " + t.getFirstName() + " " + t.getLastName());
			
			if(fnArray[2] == 'a'){
				System.out.println("Name: " + t.getFirstName() + " " + t.getLastName());
			}
			
			if( fnArray.length >= 4 && fnArray[0] + fnArray[3] < 243){
				System.out.println("Name: " + t.getFirstName() + " " + t.getLastName());
			}
		}
		
		// TODO Only print names where the last name starts with an L or W
		// TODO Only print names where the 3rd letter of the firstName is 'a' lowercase
		// TODO Print names where letter 1 and 4 adds up to be less than 243
		
		Person p = new Person();
		p.setFirstName("Donald");
		p.setLastName("Duck");
//		
//		Person p2 = new Person();
		p2.setFirstName("Peter");
		p2.setLastName("Griffin");
		
		
		System.out.println("Name: " + p.getFirstName() + " " + p.getLastName());
		System.out.println("Name: " + p2.getFirstName() + " " + p2.getLastName());
		
		
		
		in.close();

	}
	//-----------------------------------------------------
	// POJO (Plain Old Java Object)
	// 1.) all fields/properties must be private with a public getter/setter
	// 2.) Only use a default constructor
	// 3.) Constructor must be blank and not build the object
	private String firstName;
	public String getFirstName() {return firstName;}
	public void setFirstName(String fn) {firstName = fn;}
	
	private String lastName;
	public String getLastName() {return lastName;}
	public void setLastName(String ln) {lastName = ln;}
	
	private int age;
	public int getAge() {return age;}
	public void setAge(int a) {age = a; }
}
