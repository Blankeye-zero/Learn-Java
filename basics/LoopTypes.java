package basics;

public class LoopTypes {

	static byte index;

	static void infiniteWhileMethod(byte i) {

		while (i < 10) {
			System.out.println(i);
			// this method infinitely runs since the condition remains true and we arent
			// changing the passed value within the function block
		}
	}

	static void whileMethod(byte i) {
		// entry-check
		while (i < 10) {
			System.out.println("The value printed before incrementation: " + i);
			++i;
		}
		// we are incrementing the value "i" within the function block. therefore the
		// loop must come to a stop once the condition fails.

	}

	static void doWhileMethod(byte i) {
		do {
			System.out.println("The do block executes as the while condition remains true: " + i);
			i++;

		} while (i < 10); // exit-check
	}

	static void forLoop() {
		byte i;
//initialization,condition and incrementation/decrementation.
		for (i = 0; i <= 10; i++) {
			System.out.println("i :" + i);
		}
	}

	static void nestedforLoop() {
		byte i;
		byte j;
		for (i = 0; i < 10; i++) {
			for (j = 0; j < i; j++) {
				System.out.println("* j:" +j);
			}
			System.out.println("\t# i:" +i);
		}
	}

	public static void main(String[] args) {
		// Escape sequence:
		System.out.println("The Escape Sequence \"\\\" allows us to escape the next character.\n "
				+ "Can be used to print \"\" quotation marks or \"\\\" using sysout\n"
				+ "Can be used to invoke newline using the command \"\\n\" or \n\t tab using the command \"\\t\"");

		index = -10;

		// infiniteWhileMethod(index);
		System.out.println("Output of the while method:");
		whileMethod(index);
		System.out.println("Output for The do-while method:");
		doWhileMethod(index);
		System.out.println("Demonstrating the for loop: ");
//		forLoop();
		nestedforLoop();
		System.out.println("j didnt execute because: the for loop for j resides within the for loop for i\n Thus once the i<10 condition becomes false the 2D loop stops.");
	}

}
