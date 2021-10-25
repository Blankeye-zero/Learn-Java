package basics;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=90;
		int b=30;
		
		System.out.println("addition: "+ (a+b));
		System.out.println("subtraction: "+ (a-b));
		System.out.println("multiplication: "+ (a*b));
		System.out.println("Division: " + (a/b));
		System.out.println("Modulo: " + (a%b));
		
		System.out.println("The value of a: " +a);
		System.out.println(" (a++) => The value of a pre-increment: " + (a++));
		System.out.println(" (a++) => The value of a post-increment: "+ (a));
		System.out.println("The output of ++a: " +(++a) + " Increments first and then prints the value");
		System.out.println("The output of --b: " +(--b) + " Decrements first and then prints the value");
		System.out.println("The output of b--: " +(b--) + " Prints first and then decrements the value");
		System.out.println("The output of b post decrement: " +b);
		
		int x=10;
		int y=15;
		
		x+=y;
		System.out.println("x+=y: "+x);
		x-=y;
		System.out.println("x-=y: "+x);
		x/=y;
		System.out.println("x/=y: "+x);
		x%=y;
		System.out.println("x%=y: "+x);
		x*=y;
		System.out.println("x*=y: "+x);
		
		System.out.println("Logical Operators : \n && - And \n || - OR \n ! - NOT");
		
		System.out.println((a==b && a<b));
		System.out.println(!(a==b));
		//Logical Operators returns boolean
		
		//ternary operators replace if-else statements if logic is simple	
		
	
		System.out.println(a==b?"yes":"No");
	
	}
}
