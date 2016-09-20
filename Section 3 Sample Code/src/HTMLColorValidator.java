/*
 * Using regular expressions and string.matches() create a program to validate
 * html color codes.
 * 
 * Valid Color Codes:
 * #fffaaa
 * #ffa
 * #9900bb
 */

public class HTMLColorValidator{
	public static void main(String[] args) {

		String pattern = "^#([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$";
		String code = "#fffaaa";
		
		if (code.matches(pattern)){
			System.out.println("Valid hexadecimal color code");
		}
		
	}
}
