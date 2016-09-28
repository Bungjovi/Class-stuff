/*
 * Given the following sample tracks in the code pull out information to populate a 
 * class and print out the information to the screen for all the class properties given
 * 
 * Resources:
 * https://en.wikipedia.org/wiki/Magnetic_stripe_card
 * 
 * Hints:
 * String.split()
 * 
 * Class:
 * Account Number (PAN) - getter/setter
 * Expiration Year - getter/setter
 * Expiration Month - getter/setter
 * Account Holder First Name - getter/setter
 * Account Holder Last Name - getter/setter
 */

import java.util.List;
import java.util.ArrayList;

public class MagneticStripe {
	public static void main(String[] args) {
		List<String> tracks = new ArrayList<String>();
		
		tracks.add("%B6011000000000012^DRAKE/DAMON E             ^18071X100000*000000000XXX000000?");
		tracks.add("%B300012552615478^DUCK/DONALD               ^1806Z3011225*000378000XXX000142?");

		
		for (String s : tracks){
			MagneticStripe stripe = new MagneticStripe(s);
			stripe.print();
		}
	}
	
	/*--- CLASS INSTANCE CODE ---*/
	private String accountNumber;
	public String getAccountNumber(){return accountNumber;}
	public void setAccountNumber(String an){accountNumber = an;}
	
	private String expYear;
	public String getExpYear(){return expYear;}
	public void setExpYear(String ey){expYear = ey;}
	
	private String expMonth;
	public String getExpMonth(){return expMonth;}
	public void setExpMonth(String em){expMonth = em;}

	
	private String firstName;
	public String getFirstName(){return firstName;}
	public void setFirstName(String fn){firstName = fn;}
	
	private String lastName;
	public String getLastName(){return lastName;}
	public void setLastName(String ln){lastName = ln;}
	
	public MagneticStripe(String track) {
		
		 String[] trk = track.split("\\^");
		  //%B300012552615478 - 0 - 
		   
		 accountNumber = trk[0].substring(2); 
		   
		  
		  //DUCK/DONALD - 1   
		 String[] x = trk[1].split("/");
		 firstName = x[1].trim(); 
		 lastName = x[0];  
		             
		  //1806Z3011225*000378000XXX000142? - 2
		  expYear = trk[2].substring(0,2); 
		  expMonth = trk[2].substring(2,4);
		  
		 
	}
	
	public void print(){
		System.out.println("Your Account number is " + getAccountNumber());
		System.out.println("Your Expiration date is " + getExpMonth() + " " + getExpYear());
		System.out.println("The name on the account is " + getFirstName() + " " + getLastName());
	}
	
		
	}
