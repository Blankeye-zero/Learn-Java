package basics_2;

public class AbstractFinal {
	// A class summarizing on the abstraction concept
	
	public static void main(String[] args) {
		AbstractParent sb = new SubClass();
		AbstractParent sb2 = new SubClass2();
		//here the SubClass and SubClass2 classes have no direct link
		sb.method();
		sb.method2();
		//protected methods can be dynamically accessed by creating an object to a subclass method
		//final methods cannot be overriden by subclasses.
		sb.method3();
		sb2.method3();
		
	}

}


abstract class AbstractParent {
	
	final public void method() {
		System.out.println("This method cannot be overriden");
	}
	
	protected void method2() {
		System.out.println("Parent class method");
	}
	
	protected abstract void method3();
	
}

class SubClass extends AbstractParent{
	@Override
	/*
	 * public void method(){
	 * throws error because that method is declared as final
	 * }
	 */
	// Child classes must define abstract methods declared in parent classes. Helpful in modularization of functionality.
	public void method2() {
		super.method2();
		System.out.println("Overriden method");
		//super keyword creats a link to parent class properties from child class...
		//the child class method ust override the parent class method for super to work.i.e., they must have the same name.
	}
	@Override
	public void method3() {
		System.out.println("This is a module of the abstract method method3");
	}
}

class SubClass2 extends AbstractParent{
	@Override
	//the override annotation is to indicate that we are overriding parent class method...
	public void method3() {
		System.out.println("This is another module of the abstract method method3");
	}
}
