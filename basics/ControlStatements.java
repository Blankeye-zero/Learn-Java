package basics;

import java.util.Scanner;
// User input, control statements, usage of methods and passing of parameters to methods....

public class ControlStatements {
	static int mark;
	static int choice;

	static void markAssessment(int m) {
		System.out.println("You have selected the normal mark assessment!");
		// if control statement...
		if (m == 100) {
			System.out.println("Your mark is: " + m + ". Great work!");

		} else {
			System.out.println("Your mark is " + m + ". Work Harder!");

		}
	}

	// using if else-if control statements
	static void advancedMarkAssessment(int m) {
		if (m < 50)
			System.out.println("Failure is the first step to success! Try harder!");
		else if (m == 50)
			System.out.println("You have narrowly Passed! Congratz!");
		else if (m > 80 && m < 100)
			System.out.println("You have passed with Distinction! Well Done!");
		else if (m == 100)
			System.out.println("Wicked cool! You are the Top of your class!");
	}

	//passage of two arguments to the options method!
	static void options(int i, int m) {
		// usage of switch case statements...

		switch (i) {
		case 1:
			// static methods can be called without any reference since it exists within the
			// class...
			// dynamic methods - methods that are not declared as static must be called
			// through an instantiated object.
			markAssessment(m);
			break;
		case 2:
			advancedMarkAssessment(m);
			break;
		default:
			System.out.println("Enter a valid mark");
			break;
		}
	}

	void dynamicMethod() {
		System.out.println("This is a dynamic method: and can be called via an object");
		
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// instantiating the Scanner class from the java.util package for receiving user
		// input i.e System.in

		System.out.println("Enter your math mark: ");
		mark = sc.nextInt();
		// The next integer entered by the user is to be stored inside mark.
		// Okay... Got the user input down..
		System.out.println("\n1.Mark Assessment\n2.Advanced Mark Assessment\nSelect the type of assessment:");
		choice = sc.nextInt();
		// The next integer entered by the user is to be stored in the variable choice
		sc.close();
		// closing the scanner
		options(choice, mark);

		// ControlStatements.dynamicMethod(); //will throw an error since making static
		// reference to non-static methods is not accepted.
		// dynamicMethod(); //throws the same error for the above reason...
		ControlStatements dynamo = new ControlStatements();
		
		dynamo.dynamicMethod();
		// this dosent throw an error...
		// we are using an object instantiated within the main method of this class to
		// access the dynamic properties outside of the main method.
		// same for other classes within the package and classes outside this package.
		// classes outside of this package can be accessed through import keyword -> refer basics_2.HelloWorld3 class...
		//dynamic methods are used when methods are required to update on runtime. the new method overrides the existing method as the Program runs..
		//https://www.geeksforgeeks.org/dynamic-method-dispatch-runtime-polymorphism-java/

	}
	/*
	 * Static methods cannot access non static variables or methods Static methods
	 * can only access static variables or methods Static methods and variables are
	 * automatically loaded by JVM Without creating an object instance, u can refer
	 * static methods and static variables. Static methods and variables are also
	 * called as class variables and class methods
	 */

}	
