import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExamplesListandArrays {
	
	public static Scanner scanner = new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Count sentence spaces
		String sentence = "The quick brown fox jumps over the lazy dog.";
		char[] characters = sentence.toCharArray();
		
		int spaceCount = 0;
		int vowelCount = 0;
		// for a single char we are calling c in the array/collection characters
		List<String> vowels = new ArrayList<String>(Arrays.asList(new String[] {"a", "e", "i", "o", "u"}));
		for(char c : characters){
			if (c == ' ') { spaceCount++; }
			if (c == 'a' || c == 'A'){vowelCount++;}
			if (c == 'e' || c == 'E'){vowelCount++;}
			if (c == 'i' || c == 'I'){vowelCount++;}
			if (c == 'o' || c == 'O'){vowelCount++;}
			if (c == 'u' || c == 'U'){vowelCount++;}
		}
		System.out.println("Number of spaces in sentence is: " + spaceCount);
		System.out.println("Number of vowels in sentence is: " + vowelCount);
	}

}
