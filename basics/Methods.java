package basics;

public class Methods {
	byte b = 15;

	static byte a = 0;

	void method1(byte i) {
		System.out.println("method1:");
		// this is pass by value
		// we are passing the value of an entity
		// The value dosent reflect changes on the variable that is passed.
		// it infers a copy of the variable and returns a value after internal
		// processing
		i -= 10;

	}

	void method3(int... x) {
		// we are taking an single dimensional array of type int with the name x with
		// variable size.
		System.out.println("method3:");
		for (byte i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

	int add(byte a, byte b) {
		return a + b;

		// methods that have declared types must return a value of the declared type.
	}

	public static void main(String[] args) {
		byte a1 = 10;
		byte a2 = 20;
		Methods c = null;
		// pass by value and pass by reference
		Methods object = new Methods();
		NewClass link = new NewClass();
		object.method1(a);
		System.out.println(a);
		System.out.println(object.b);
		link.method2(c);
		System.out.println(object.b);
		object.method3(21, 22, 23, 24, 25, 26, 27, 28, 29);
		// we can store how many values that we want and the number of values
		// stored here will be taken as the size of the array..
		System.out.println(object.add(a1, a2));
		

	}

}

class NewClass {
	void method2(Methods m) {
		System.out.println("method2:");
		// this is pass by reference
		// we are passing a variable of type Methods-class...
		// And we use the variable to access properties of the class
		// reflects changes
		// this method works on the actual variable not a copy of it.
		m.b += 5;

	}
}
