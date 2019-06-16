package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public void printBinary(byte b) {
		if(b == 0) {return;}
		printBinary((byte) (b >> 1));
		System.out.print(b%2);
	}
	
	public void printBinary(short s) {
		if(s == 0) {return;}
		printBinary((short) (s >> 1));
		System.out.print(s%2);
	}
	
	public void printBinary(int i) {
		if(i == 0) {return;}
		printBinary(i >> 1);
		if((i ^ (i-1)) == 1) {System.out.print(1);}
		else {System.out.print(0);}
	}
	
	public void printBinary(long l) {
		if(l == 0) {return;}
		printBinary((long) (l >> 1));
		System.out.print(l%2);
	}
	
	public static void main(String[] args) {
		BinaryPrinter bp = new BinaryPrinter();
		bp.printBinary(126);
	}
}