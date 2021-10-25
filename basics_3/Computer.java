package basics_3;

public interface Computer {
	/*
	 * An interface is a special class
	 * 
	 * An interface dosent allow you to declare variables
	 * 
	 * An interface contains Prototype functions.
	 * 
	 * An interface is like an abstract class in which all the classes that implement the interface must define the functions within their code blocks
	 * 
	 * An interface must be declared within a file that shares the same name
	 * 
	 * An interface is especially useful when a programmer wants to work with a large amount of classes who shares the same function but implements them in their own way.
	 * 
	 * It is easier for the programmer to work with them because all of them are referred to using the the same generic type since they implement the interface.
	 * 
	 * Interfaces fulfill two goals... They allow the programmer to be more abstract when referencing the objects.
	 * 
	 * The object can only access the abstract properties of the object classes and nothing else because the object is of abstract type.
	 * 
	 * This allows for more narrowing down of scope and is useful for more personalizing.
	 * 
	 * They require the programmer to create specific functions that are expected to be implemented in a function of a generic type.	
	 * 
	 * We can achive multiple inheritance through interfaces as a class can implement multiple interfaces also an interface can extend multiple interfaces.
	 */
 void boot();
 void shutdown();
 void charge();
 void enterBIOS();
}
