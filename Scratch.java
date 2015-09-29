// double forward slash will treat everything following until the end of the line as a comment

/*
	forward slash asterisk will treat everything as a comment (multiple lines)
    until it finds a matching asterisk forward slash
*/

public class Scratch {
	public static void main(String[] args) {
		String greeting = "Hello World!";
		System.out.println(greeting);
		
		/*
	         Rules for variable names:
			 * Can contain any unicode letters, numbers, currency symbols, or underscore
			 * Can be of any length
			 * may NOT start with a number
	
			 Java naming conventions
			 * use meaningful names (e.g. "cadillac" is only a valid variable name if your program is dealing with cars)
			 * do NOT use currency symbols, these are reserved for generated code
			 * use "camel case", starts with a lowercase letter and every word starts with uppercase:
					bankAccountNumber
					myVariable
					kilometersToTheMoon
		*/
		int x = 5;
		System.out.println(x);
		
		int y;
		y = 3;
		x = 7;
		System.out.println("x = "+x);  // the plus sign acts as a concatentation operator with type String
		System.out.println("y = "+y);
		
		int z = x + y;  // the plus sign acts as an addition operator for numbers
		System.out.println("z = "+z);
		
		
		z = 10 % 4; // modulus operator gives the remainder of an integer division
		System.out.println("10 % 4 == "+z);
		
		char c = 'A';
		x = c;
		System.out.println("c == "+c);
		System.out.println("x == "+x);
		
		// Octal literals start with zero
		x = 020;
		System.out.println("x == "+x);
		
		// Hex literals start with 0x
		x = 0xFF;
		System.out.println("x == "+x);
		
		// floating point data types are not to be trusted!!!
		float f = .1f + .1f + .1f;
		System.out.println(".1 + .1 + .1 == "+f);
		
		x = 1;
		System.out.println("x == "+x);
		x++;
		System.out.println("x++ == "+x);
		
		// for loops make repetitive tasks easier
		for(byte ix = 0; ix != 10; ix++) {
			System.out.println("ix == "+ix);
			System.out.println("yay!");
			ix = ix + 3;
		}
		
		// when the ++ is used postfix operator the increment is performed after evalutation
		x = 1;
		y = x++;
		System.out.println("y == "+y);
		System.out.println("x == "+x);
		
		// when the ++ is used prefix operator the increment is performed before evalutation
		x = 1;
		y = ++x;
		System.out.println("y == "+y);
		System.out.println("x == "+x);
		
		//
		
	}
}