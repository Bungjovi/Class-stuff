/*
	The body mass index (BMI) is commonly used by health and nutrition professionals to estimate 
	human body fat in populations.  You will need to prompt the user for their weight and height. 
	It is computed by taking the individual's weight (mass) in kilograms and dividing it by the 
	square of their height in meters.
	
	Use the 4 categories below to to determine the output.
	
	BMI				Category
	-----------------------------------
	< 18.5			Under Weight
	18.5 - 24.9		Normal
	25.0 - 29.9		Overweight
	30.0 or more	Obese
	-----------------------------------
 */
import java.util.Scanner;

public class BMICalculator {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
	
	//TODO Prompt for person's height in meters
		
	System.out.println("Enter your height in meters: ");
	float height = Float.parseFloat(scanner.nextLine());
	
	//TODO Prompt for person's weight in kilograms
	
	System.out.println("Enter your weight in Kilograms: ");
	float weight = Float.parseFloat(scanner.nextLine());
	
	//TODO Calculate the person's BMI
	
	float bmi = weight / (float)Math.pow(height, 2);
	System.out.println("Your BMI is: " + bmi);
	
	//TODO Determine which category the person belongs to
	
	if (bmi < 18.5) {
		System.out.println("Eat more before you blow away, you are Under Weight");
	}
	
	else if (bmi >= 18.5 && bmi <= 24.9){
		System.out.println("You are a normal average Joe");
	}
	
	else if (bmi >= 25.0 && bmi <= 29.9){
		System.out.println("Sit in the steam room for 2 hours, You are Overweight");
	}
	
	else {
		System.out.println("Find a treadmill fatty, you are Obese");
	}
	//TODO Print out BMI and Category
}
}
