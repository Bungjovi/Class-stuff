import java.util.Scanner;
import java.util.List;// Working with Collections
import java.util.ArrayList;// Working with Collections 



public class ArraySample {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub of elements. 
		// Array
		// A collection of like data types
		// 1.) must initialize / set number (Once set cant change number of elements)
		
		String str1 = "str 1";
		String str2 = "str 2";
		String str3 = "str 3";
		
		// String{s} making it plural with the brackets
		String[] strSet = new String[3]; // setting this array to contain 3 elements and initializing
		String[] strSet3 = new String[] { str1, str2, str3, "Troy"}; // Initialized this array with Values

		System.out.println(strSet.length); // length gets the number of elements in the array
		
		strSet3[3] = ""; // Assigns empty string to where "Troy" was
		System.out.println(strSet3[3]);// gets value from index 3 and prints it out
		
		
		
		
		
		
		
		// List <of Type> names = new ArrayList <of Type>();
		// Advantages of a list
		// 1.) Add and remove objects (Resize backing Array)
		//
		List<String> names = new ArrayList<String>();
		names.add("Troy");// adds an item at the end of the array
		names.add("Dog");
		names.add("Cat");
		names.remove("Troy");// removes an item with the value of "Troy" (first occurrence)
		
		
		names.size();// returns an integer and tells you how many is in the list
		names.get(2);// gets index 2 from the backing array-- returns "Cat"
		names.clear();// Clears out all the values / size
		names.toArray();// returns to backing array
		
		if(names.contains("value")) { // returns boolean value
		}
		
		
		// Do Until / While
		// Do until
		// 1.) Post Test loop
		// 2.) Generic all purpose loop- for any looping scenario. -- runs at least 1 time
		String name = "Dog";
		do {
			System.out.print("Enter a name: ");
			name = in.nextLine();
		}
		while (name.length() < 3); {
			System.out.print("Enter a name: ");
			name = in.nextLine();
		}
		
		// While loop
		// 1.) Pre test loop
		// 2.) Generic all purpose loop
		while (name.length) {
		}
		
		// For Loop
		// 1.) Used in incremental stepping
		// 2.) ({loop variable};{condition};{stepping value})
		// 3) When you want to run a set number of times, accumulation, dealing with an array by index
		char[] letters = name.toCharArray();
		for (int x = 0; x <= letters.length(); x++){
			System.out.println(letters[x]);
		}
		
		// Foreach loop
		// 1.) Arrays and Collections by value
		for(char c : letters){
			System.out.println(c);
		}
	
	
	
	}
		
	}


