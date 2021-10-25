package basics_2;
//inheritance - code reusability and method overriding
//Same package no need to import ClassB
public class ClassC extends ClassB{
	public void function() {
		//overriden method.. this method with the same name as that of 
		//a method that exists within the super class now overrides to execute its own code block
		//return type of overriden method cannot be changed.
		//methods and variables declared as final cannot be overriden.
		//final classes cannot be inherited.
		//overriden methods cannot have reduced visibility than that of its super method.
		
		short a=1590;
		short b=6789;
		System.out.println(a+b);
	}
	
	String var = super.var;
	//assigning the superclass var value to a variable in the subclass
	
	void superMethod() {
		super.function();
		//super is used to invoke the parent class function method()
		// a dummy method that executes the super of an overriden method. super cannot be invoked in static way.
	}
	
	public static void main(String[] args) {		
		new ClassC().function();
		//The ClassC() constructor alongside with it invokes its parent ClassB() constructor whenever it is called.	
		//because super() is added in each class constructor automatically by compiler if there is no super() or this().
		new ClassC().superMethod();
		
		

	}

}
