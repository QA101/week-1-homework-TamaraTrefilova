
public class BetweenProgram {

	/*
	 * Write a program that determine if a number x is between 2 numbers y and z
	 * if x is between y and z, print TRUE otherwise print FALSE
	 * 
	 * example:
	 * x = 150
	 * y = 100
	 * z = 200
	 * should print TRUE
	 * 
	 */
	/**
	 * Prints true if value of x less than z and more than y;
	 * @param x - integer
	 * @param y - integer
	 * @param z - integer
	 */
	public static void betweenNumber(int x, int y, int z) {
		
		if(x<z && x>y) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
	public static void main(String[] args) {
		
		int x = 150;
		int y = 100;
		int z = 200;
		
		betweenNumber( x, y, z);
	}

}
