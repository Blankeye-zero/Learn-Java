package basics_2;

public class ClassG {
	// The usage of the concept of abstraction inorder to execute polymorphic
	// queries...
	//inheritance gives: code reusability, Encapsulation and polymorphism, Composition, 
	//and an alternate substitute of conditional statements through polymorphic queries
	public static void main(String[] args) {
		
		Bike start = new Bike();
		for (byte i = 0; i < 10; i++) {
			start.change();
		}
		// the for loop iterates the change method of the Bike class for 10 times

	}

}

//overriding the parent class properties by the subclasses is what takes place here...

abstract class Gear {
	public abstract void change(Bike b);
	// the abstract method of an abstract class is declared
	// it cannot have a method body
}

class Bike {
	// the first iteration of the for loop will have a newly allocated memory for
	// the GearN class referenced by a variable of type abstract Gear class.
	Gear gear = new GearN();
	// Gear gear=new Gear(); you cant instantiate an abstract class with its own
	// object.
	// you have to instantiate the abstract class with its subclass object..
	//the subclass can access the properties of its parent class
	//and a subclass can override the properties of its parent class if it wishes

	public void change() {
		// we are declaring a method of type void and within it we are invoking the
		// change method of the GearN class for the first iteration.
		gear.change(this);
		// the change method of the bike class overrides the change method of
		// Gear class which is accessed through the object of GearN class
		// The this keyword has the value reference of Bike "b" passed to it.

	}

}

class GearN extends Gear {
	public void change(Bike b) {
		System.out.println("The gear is in neutral");
		b.gear = new Gear1();
		// the object in Bike named "gear" is overriden with a value of a different
		// object.

	}
}

class Gear1 extends Gear {
	public void change(Bike b) {
		System.out.println("1st gear selected");
		b.gear = new Gear2();
	}
}

class Gear2 extends Gear {
	@Override
	// testing the override annotation
	// is the @Override annotation even needed? the output looks the same to me.
	public void change(Bike b) {
		System.out.println("2nd gear selected");
		b.gear = new Gear3();
	}
}

class Gear3 extends Gear {
	public void change(Bike b) {
		System.out.println("3rd gear selected");
		b.gear = new GearN();
	}
}

//How does this eliminate structured programming?
//Good code should be closed for modification and open for extension
//The above code could be easily done using conditional statements of if-else-if
//but that would be bad code by design...
/*
 * Strategy to remove if-else-if using inheritance 
 * 1. Delete the conditional block 
 * 2. Convert seperate conditions into seperate classes
 * 3. Group them under a alpha class in a heirarchial manner - in this case class Gear
 * encompasses GearN, Gear1,..Gear3  
 * 4. Declare the alpha class as abstract. 
 * 5.Create an object between the alpha class and the class within which you
 * define the polymorphic method. 
 * Note: You declare the method in the alpha class but define the method in the class 
 * that instantiates the object to the alpha class. because abstract methods cannot have 
 * bodies therefore we are referencing it in another class using an object to override it.
 */
