
public class Variables {

	public static void main(String[] args) {
		/*
		 * Primitive Data Types ------------------------------------ byte,
		 * short, int, long - whole number data types float, double - floating
		 * point data types ( real numbers ) char - represents 1 character
		 * boolean - true/false
		 */

		/*
		 * Declaring a variable in Java ------------------------------------
		 * {data type} {identifier/variable name} = {value};
		 */

		int age = 37;
		float num = 0f; // a float has to be declared with a 'f' following the
						// value
		double num2 = 0;
		char initial = 'E'; // value enclosed in single quotes 'E'
		boolean isValid = false;
		String name = ""; // value enclosed in double quotes ""

		/*
		 * All primitive types have a type wrapper class
		 * -------------------------------------- Byte, Short, Integer, Long
		 * Float, Double Character Boolean
		 * 
		 * These type wrappers are used to convert between types and also parse
		 * strings into their corresponding primitive data type
		 */

		age = Integer.parseInt("35");
		isValid = Boolean.parseBoolean("true");

	}

}
