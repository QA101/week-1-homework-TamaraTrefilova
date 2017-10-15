
public class DivisibleProgram {

	/*
	 * Define a program that determines whether a number x is divisible by a number y.
	 * 
	 * If x is divisble by y, the program will print TRUE otherwise FALSE
	 * 
	 * Such as:
	 * x -> 10
	 * y -> 5
	 * 10 divided by 5 is 2 with 0 remainder. The program would print true
	 */
	/**
	 * Prints "true" if number X is divisible by number Y, otherwise prints "false"
	 * @param x - integer
	 * @param y - integer
	 */
	public static void divisibleNumber(int x, int y) {
		
		if((x%y)==0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
	
	public static void main(String args[]){
		
		divisibleNumber(31,2);
		
		divisibleNumber(11,5);
		
		divisibleNumber(25,5);

	}
}
