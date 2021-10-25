package basics;

//objects , jumping statements using break and continue,this keyword
import basics_2.ClassB;

public class Objects {
	static byte a = 10;
	static byte numbers[] = { 10, 20, 30, 40 };
	static String str = "This is a string of Class Objects";

	public static void main(String[] args) {
		ablock: { // assigning keys to code blocks...
			// ClassB obj = new ClassB(str);// passing of a argument to a class using a
			// constructor;
			for (byte x : numbers) {
				if (x == 20)
					break ablock;
				else
					System.out.println("An element of array that is !20" + x);
			}
			System.out.println("hi");
			// dosent get executed because of the condition within for loop. This LOC exists
			// within the ablock.
		}
		//Instantiation is when memory (RAM) is allocated for an object.
		//The reference to the object that was created is returned from the new keyword. 	
		
		//Initialization is when values are put into a memory that was allocated using the new keyword through the constructor.
		//Declaration is when a name is given to an object of type class...

		new ClassB(str, a).function();
		// We pass on arguments to an anonymous object here,
		// whenever an object to ClassB is invoked the constructor and its code block
		// gets executed.
		// we use a constructor to initialize an object and the object to call a method.
		// we can use the properties passed onto the constructor throughout its whole
		// class thus the function() method could access the variable str passed onto the
		// ClassB without having to specifically request an argument to be passed onto
		// it
		new ClassB("hello",(byte)0).function("dude");
		//method overloading.. the above function() and the function(String s) are two different types of methods...
		//overloaded methods can return different data type values...
		new ClassB();
		//Constructors can also be overloaded.

		System.out.println("out of a block");

		for (byte i = 0; i < a; i++) {

			if (i % 2 == 0)
				continue; 
			// the continue statement causes the loop to instantly jump to the next
			// iteration of the loop
			else
				System.out.println("This is an odd number: "+ i);
		}

	}

}
