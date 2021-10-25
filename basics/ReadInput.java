package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadInput {

	public static void main(String[] args) throws Exception {
		int c = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your input A:");

		String name = br.readLine();
		System.out.println("Enter your input B:");
		String nm = br.readLine();

		System.out.println("The length of the strings are:"+name.length());
		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) == nm.charAt(i)) {
				c += 1;
			}

		}
		System.out.println("The total occurrence of similar digits at the same positions by both A and B: "+c);
	}

}
