public class PositiveNegative {

	/*
	 * define a program that finds if a number is positive or negative.
	 * 
	 * The program should print positive if the number is positive, negative if it is negative
	 */
	/**
	 * Prints if number positive, negative or is equal zero
	 * @param x
	 */
	public static void positive_negative ( int x ) {
		
		if (x>0) {
			System.out.println("the number is positive");
		} else if ( x<0 ){
			System.out.println("the number is negative");
		} else {
			System.out.println("the number is zero");
		}
	}
	public static void main(String args[]){

		positive_negative ( -2 );
		
		positive_negative ( 6 );
		
		positive_negative ( 0 );
	}
}
