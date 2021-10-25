package basics;

public class Arrays {
	static byte b1DArray[] = new byte[5];
	static byte b2DArray[][] = new byte[4][6];
	// Syntax for initializing an array
		// first [value] refers to the total number of rows and the second [value]
		// refers to the total number of columns to be initialized
	
	static byte cArray[][] = new byte[3][];
	// uneven arrays - assgining varying number of columns to specific rows...
	
	static byte dArray[][];
//arrays always work using pass by reference
	static void assign1DVal(byte a[]) {
		byte i;
		for (i = 0; i < a.length; i++) {
			a[i] = i;
			// I am assigning specific values to each individual index of the array
			System.out.println("[" + i + "]: " + a[i]);
		}

	}

	static void assign2DVal(byte b[][],String name) {
		// this method works strikingly well on both even and uneven arrays
		byte i, j, c = 0;
		System.out.println("Output of " +name+":");
		for (i = 0; i < b.length; i++) {
			// b.length returns the number of rows
			for (j = 0; j < b[i].length; j++) {
				// b[i].length returns the number of columns in that particular row.
				b[i][j] = c;
				c++;
				System.out.println("[" + i + "," + j + "]: " + b[i][j]);
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("One Dimensional Array Values:");
		assign1DVal(b1DArray);
		System.out.println("Two Dimensional Array Values:");
		assign2DVal(b2DArray,"b2DArray");

		// uneven arrays - assgining varying number of columns to specific rows...
		// rows and columns are not the same...
		// Has useful applications in matrices
		cArray[0] = new byte[4];
		cArray[1] = new byte[2];
		cArray[2] = new byte[3];

		// hard-coding array values using their index:
		cArray[0][0] = 20;
		cArray[0][1] = 25;
		cArray[0][2] = 30;
		cArray[0][3] = 35;

		System.out.println("cArray [0,2] = "+cArray[0][2]);

		assign2DVal(cArray,"cArray");
		
		System.out.println("Assigning array values in bulk:");
		//Hardcoding array values in bulk...
		byte dArray[][] = {
				{10,20,30,40},
				{20,40,90,100},
				{50},
			};
		assign2DVal(dArray,"dArray");
	}

}
