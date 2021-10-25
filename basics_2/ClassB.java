package basics_2;

public class ClassB {
	String var;
	byte b2;
	
	public ClassB(String val, byte b) {
		this.var = val; //var is initialized
		this.b2 = b;
		int c = b2+b2;
	    System.out.println(var+":"+c);
	//	System.out.println(val + ":" + b);
		// this is a constructor that takes in the value when referenced using the "this"
		// keyword
	}
	public ClassB() {
		System.out.println("Constructors can also be overloaded");
	}
	
	public void function() {
		System.out.println(var+" : displayed by a function of class B");
		
	}
	public void function(String s) {
		System.out.println(var + ":" +s);
		
	}
}

