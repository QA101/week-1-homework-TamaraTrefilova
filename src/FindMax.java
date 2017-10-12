
public class FindMax {
	/*
	 * Define a program that finds the maximum number when 2 numbers are given.
	 */
	
	/**
	 * Returns max number
	 * @param a - integer
	 * @param b - integer
	 */
	public static void findMax(int a, int b) {
		
		if(a>b) {
			System.out.println("Max number is: "+ a);
		} else {
			System.out.println("Max number is: "+ b);
		}
	}
	
	public static void main(String[] args) {
		
		findMax(10, -6);
	}

}
