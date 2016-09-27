
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
		
		for (int a = 0; a < 100; a++){
			int number = a + 1;
		
		if((number % 3) == 0 && number % 5 == 0){
			System.out.println(number + "Fizz/Buzz");
		}
		else if((number % 3) == 0){
			System.out.println(number + " Fizz");
		}
		else if((number % 5 == 0)){
			System.out.println(number + " Buzz");
		}
		else{
			System.out.println(number);
		}
		}
		in.close();
	}
}