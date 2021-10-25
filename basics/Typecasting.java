package basics;

public class Typecasting {

	public static void main(String[] args) {
		byte b1 = 123;
		
		int i = b1; 
		//In the data type heirarchy, int is of bigger relative to the byte data type, 
		//Thus, it has the storage capacity to contain byte type and is compatible.
		//auto type promotion happens....
		
		System.out.println("byte value stored in int variable: "+i);
		
		byte b2 = -20;
		
	    //byte b3= b1+b2; is incompatible because every arithmetic operation return an int value and since 
		//int is bigger than a byte, it cannot be stored inside  a variable of type byte.
		
		//arithmetic operations using +,-,/,*,% operators...
		
		int b3 = b1+b2;
		System.out.println("addition :" +b3); //auto type promotion happens
		
		int b4=b1-b2;
		System.out.println("subtraction: "+b4);
		
		int b5=b1*b2;
		System.out.println("multiplication: "+b5);
		
		int b6=b1/b2;
		System.out.println("Division: "+b6);
		
		int b7=b1%b2;
		System.out.println("modulo: "+b7);
		
		short s=b1; // short is bigger than a byte and is compatible with the byte type.
		
		System.out.println("A byte value 'b1' assigned to short variable 's' : " +s);
		
		int n =s; //compatible //notypecasting needed
		
		System.out.println("An int variable 'n' could contain the short value 's':" +n);
		
		long l=n; //notypecasting needed.
		
		System.out.println("An int value could be held inside a long variable: "+l);
		
		//An int variable could hold a char variable. int is superior to char.
		//int is superior to byte.
		
		//byte b9=b3; invalid as a byte variable dosent have the capacity to hold an int value.
		
		//char c=b3; invalid as  a char variable dosent have the capacity to hold an int value.
		
		char c1=(char)b3; //type casting - essentially converts the given value to the mentioned data type within paranthesis.
		
		System.out.println("from int to char through typecasting: "+c1);
		
		byte b9=(byte)b3; //typecasting from a higher value - The value will lose its precision.
		
		System.out.println("from int to byte through typecasting: " +b9);
		
		//double is superior to float : double - 64 bit, float - 32 bit.
		
		//giving 'f' as suffix is necessary in order to declare a float variable.
		
		double d=1500.7895;
		
		double d1=149.567f; //compatible - no type casting needed.
		
		System.out.println("from float to double: "+d1);
		
		float f=(float)d;//typecasting
		
		System.out.println("From double to float through typecasting: "+f);
		
		int t=(int)f;//typecasting - float is not compatible with int.
		
		System.out.println("from float to int through typecasting: "+t);
		
		//boolean b=(boolean)null; Boolean only accepts either true or false..
		
		
		
	}

}
