package basics_2;

class ClassD {
	class ClassE {
		// this class exists within another class
		final String name = "Class E";
		final static String stname= "static Class E";
	}

}

public class ClassF {
	ClassD obj = new ClassD();
	static String var = ClassD.ClassE.stname;
	// the only way to access a property within an inner class of another class is
	// to streamline the class references.
	// if car is another class and engine is its inner class having property temp,
	// then we do car.engine.temp to refer to that property
	// if its not static then we streamline objects...
	

	// initializing an object to an innerclass
	public static void main(String[] args) {
		ClassD.ClassE var2 = new ClassD().new ClassE();
		System.out.println(var2.name);
		System.out.println(var);
	}
}
