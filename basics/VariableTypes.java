package basics;

public class VariableTypes {

	public static void main(String[] args) {	
		byte b=120;
		//The range of byte is from -128 to 127 - 8 bit (single unit)
		short s=30000;
		//The range of short is from -32768 to 32767 - 16 bit (single unit)
		int i=2000000;
		//The range of int is from -2147483648 to 2147483647 - 32 bit (single unit)
		int ii=200_000_50_00;
		//inbetween the values we can have underscore for easy readability...
		double d=190.89;
		//64 bit-decimal point data type
		float f=347.5698f;
		//We need to include "f" to indicate that the given value is of float data type - 32 bit
		char c='c';
		//A character could only be stored in single quotes. Double quotes represent a string... 
		char cc=169;
		//A character stores characters according to their ascii value thus it takes in ascii numbers.
		boolean t=true;
		// boolean doesnot take either 0 or 1, it takes "true" or "false". 
		String str="i am a string";
		//This is a string...
		
		System.out.println("This is a byte: "+b );
		System.out.println("This is a short: "+s );
		System.out.println("This is an int: "+i );
		System.out.println("This is also an int: "+ii );
		System.out.println("This is a double: "+d );
		System.out.println("This is a float:"+f );
		System.out.println("This is a char: "+c );
		System.out.println("This is also a char: "+cc );
		System.out.println("This is a boolean: "+t );
		System.out.println("This is a string: "+str );
		
	}

}
