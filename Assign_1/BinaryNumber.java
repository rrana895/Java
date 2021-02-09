package lesson1;


public class BinaryNumber {
	
	private int data[]; 
	private boolean overflow;
	
	public BinaryNumber(int length) { // Creating a binary number length length and consisting only of zeros
		data = new int[length];
		for (int x = 0; x < length; x++){
		data[x] = 0;
		}
	}
	
	public BinaryNumber(String Str) { // Creating a binary number given a string
		
		
	}
	
	public int getLength() { //Determine the length of a binary number
		return 0;
	}
	
	public int getDigit(int index) { // To obtain a digit of a binary number given an index
		return 0;
	}
	
	public int toDecimal() { // transforming a binary number to its decimal notation
		return 0;
		
	}
	
	public void shiftR(int amount) { // shifting all digits in a binary number any number of places to the right
		
	}
	
	public void add(BinaryNumber aBinaryNumber) { // Adding two binary numbers
		
	}
	
	public String toString() { // transforming a binary number to a String
		return ("a");
	
	}
	
	public void clearOverflow() {
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
