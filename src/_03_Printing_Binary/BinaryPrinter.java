package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public void printByteBinary(byte b) {
		b <<= 1;
	}
	
	public void printShortBinary(short s) {
		
	}
	
	public void printIntBinary(int i) {
	
	}
	
	public void printLongBinary(long l) {
		
	}
	
	public static void main(String[] args) {
		BinaryPrinter bp = new BinaryPrinter();
		bp.printIntBinary(33);
	}
}
