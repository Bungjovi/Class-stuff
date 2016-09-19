import java.util.Scanner;

public class RegularExpression {
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		// String .matches{(regex}) - returns boolean
		
		// Match a hexadecimal color code
		// ^#([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$
		
		String pattern = "^#([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$";
		String code = "#ffaadd";
		
		if (code.matches(pattern)){
			System.out.println("Valid hexadecimal color code");
		}
		
		// Create a username
		// No Spaces, first letter of first name, entire last name, all lowercase
		// less than or equal to 20 characters 
		// create email address {username}@example.org
		
		System.out.print("Enter your First Name: ");
		String fn = in.nextLine();
		System.out.print("Enter your Last Name: ");
		String ln = in.nextLine();
		ln = ln.replaceAll(" ",  "");
		
		
		String fnLetter = Character.toString(fn.toCharArray()[0]);
		String fnLett = fn.substring(0,1);
		
		String username = (fnLett + ln).toLowerCase().trim();
		String email = username + "@example.org";
		
		String patterns = "^[a-z]{1,20}$";
		
		if(username.matches(patterns)) { // matches the patterns string
			System.out.print(username + " is valid.");
		}
		else{ // cuts off the username at 20 characters
			username = username.substring(0,19);
			
		}
		
		System.out.print(username + "@example.org");
		
		in.close();
	}

}
