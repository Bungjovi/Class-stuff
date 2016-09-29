
public class Program {

	public static void main(String[] args) {
		// Character functions
		
		/*
		 	Boolean checks on a Character
		 ------------------------------------ 
			Character.isDigit('') | 0-9
			Character.isLetter('') | a-z, A-Z
			Character.isUpperCase('') | works only on letters
			Character.isLowerCase('') | works only on letters
			Character.isWhitespace('') | \r \n 'blank space' \t
		
			char Character.toUpperCase('') | uppercase a letter and returns it
			char Character.toLowerCase('') | lowercase a letter and returns it
			String Character.toString('') | Converts a character to a string
		 */
		
		
		// String Functions
		String name = "Troy Vannocker";
		
		// String name.substring(startIndex, endIndex) (0,3)-- troy | returns part of a string
		// String name.toUpperCase() | returns an uppercased string
		// String name.toLowerCase() | returns a lowercased string
		// int name.length() | human readable length of the string (<)
		// String[] name.split(" ") | delimiter
		// Common delimiters are... , \t |
		// , \t - usually called CSV, | called pipe delimiter
		// char[] name.toCharArray() -- turns string into a character array
		
		/* Regular Expression (String pattern matching)
		 * --------------------------------------------
		 * \d- looking for a digit
		 * \D- looking for non-digit
		 * \w- looking for word character a-z or A-Z
		 * \W- looking for non-word character
		 * \s- looking for a space character
		 * \S- looking for a non-space character
		 * 
		 * ^- means start with
		 * $- means ends with
		 *  . - matches almost everything (except line/carriage returns)
		 * 
		 * Quantifiers
		 * * - 0 or more
		 * + - means 1 or more
		 * {x} - must match x number of times
		 * {x, y} - must match x - y number of times only (Range match)
		 * {x, } - must match minimum of x number of times to unlimited
		 * 
		 * Sets- targets one specific character
		 * [abcdef0123456789] - anything in brackets means its a set match
		 * [^ghik] - cant be in this set
		 * () - used for grouping
		 * | - or statement
		 */
		
		// You are writing a web browser
		// Needs to match hexadecimal color codes
		// <p style="color:#ffffff"></p>
		// ^#(0-9a-fA-F]{3}|[0-9a-fA-F]{6}$
		
		// validating a uri
		// ^http[s]{0,1}://.\.(com|net|gov|biz)$
		
		// Donald Duck, Damon Drake, Fred Flintstone
		// check for proper names assuming 1 first name and 1 last name
		// ^[A-Z]{1}\w+\s{1}[A-Z]\w+$
		
		// Course Code
		// CPD 222 A -- 6 * char(5) = char (30)
		// 'CPD  222  A     '
		// ^[A-Z ]{5}[0-9 ]{5}[0-9A-Z ]{5}\s{15}$
		
		
	}

}
