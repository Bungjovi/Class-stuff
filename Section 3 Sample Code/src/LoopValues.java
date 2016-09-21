import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
 * Create a program that receives integers from the user and keeps a running total of the integers.
 * When the user enters in 0 stop the loop and then display the total. 
 */

public class LoopValues {
	public static Scanner in = new Scanner(System.in);	
	
	public static void main(String[] args) {
	
		List<Integer> numbers = new ArrayList<Integer>();
		
		int num = 0;
		
		do{
			System.out.println("Please enter a number, entering 0 will accumulate the total amount of numbers");
			num = in.nextInt();
			
			numbers.add(num);
		}
		
		while(num > 0);
	
		int total = 0;
			
		for (Integer i : numbers){
			total += i;
			
		}
		System.out.println("The total is: " + total);
		in.close();
		

	}

}
