package basics_2;
import basics.HelloWorld2;
import basics.HelloWorld;
//import 
//it is good practice to not use the asterisk but use the class name. not basics.* but basics.HelloWorld2.
public class HelloWorld3 {

	public static void main(String[] args) {
	HelloWorld2 h=null;
	//For now the HelloWorld2 type variable "h" accepts null value...
	//h is a variable of type HelloWorld2
	System.out.println(h);
	
	HelloWorld2 object3=new HelloWorld2();
	
	HelloWorld object1=new HelloWorld();
	
	System.out.println(object3.i);
	System.out.println(object1.i);
	
	}

}
