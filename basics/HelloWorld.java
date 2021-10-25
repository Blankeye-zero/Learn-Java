package basics;

public class HelloWorld {
	public int i = 50;

	public static void main(String[] args) {

		// System.out.println("Hello World");

		OuterClass object = new OuterClass();
		HelloWorld2 hello2 = new HelloWorld2();

		// An "object" is used to access the properties and methods of Outer classes...
		System.out.println(object.k);
		System.out.println(hello2.i);

		System.out.println(object.method());
		object.method();
		// putting a method inside sysout makes the return value visible in output whereas it is not visible in output by default.

		// new OuterClass();
		// An anonymous object of type OuterClass is created...

		// return 5;

	}

}

class OuterClass {
	int k = 100;
	int c=10+20;

	int method() {
		System.out.println("hello"+c);
		//return k;
		return c;
		// return 0;
		}
	
	//method of type int return variable c of type int...

}