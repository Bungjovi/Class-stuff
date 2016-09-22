import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Print out numbers from 1 up to and including 100. For numbers that are multiples of 3 write the word "Fizz".
 * For numbers that are multiples of 5 write the word "Buzz". For numbers that are both multiples 3 and 5
 * write the word "FizzBuzz"
 * 
 * Sample Print Out:
 * 
 * 1
 * 2
 * 3 Fizz
 * 4
 * 5 Buzz
 * 6 Fizz
 * 7
 * 8
 * 9 Fizz
 * 10 Buzz
 * 11
 * 12 Fizz
 * 13
 * 14
 * 15 FizzBuzz
 * 
 */

public class FizzBuzz {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		int [] array = new int[100];
		for (int a = 0; a < array.length; a++)
			array[a] = a + 1;
		
		int i = 0;
		
		if(i % 3 && i % 5){
			
		}
	}
}