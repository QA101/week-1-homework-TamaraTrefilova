
public class ExtraPrograms {
/*
 *  Write a program that will find sum, subtraction, multiplication and division
and if one number bigger than other true or false for:
1) x = 175 / y =255
2) x = 25.75 / y = 17.34
 */
	
	public static void checkNumber(int x, int y) {
		System.out.println("sum of: "+ x+"+"+y+" = "+x+y);
		System.out.println("subtraction of: "+ x+"-"+y+" = "+(x-y));
		System.out.println("multiplication of: "+ x+"*"+y+" = "+(x*y));
		System.out.println("division of: "+ x+"/"+y+" = "+(x/y));
		if(x>y) {
			System.out.println("x>y is " + true);
		} else {
			System.out.println("x>y is " + false);
		}	
	}
	
	/*
	 * Write a program that will change values of variables:
x=10 and y=5 => swap to make x=5 and y=10
x=2.5 and y=7.5 => swap to make x=7.5 and y=2.5
x=10 / y=5 / z=12 => swap to make x=12 / y=10 /z=5
	 * 
	 */
	public static void swapTwoIntegers(int x, int y) {
		System.out.println(" x = "+x+" and y = "+y);
		int swap = x;
		x = y;
		y = swap;
		System.out.println(" x = "+x+" and y = "+y);
	}
	
	public static void swapThreeIntegers(int x, int y, int z) {
		System.out.println(" x = "+x+" and y = "+y+" and z = "+z);
		int swap = x;
		x = y;
		y = z;	
		z = swap;
		
		System.out.println(" x = "+x+" and y = "+y+" and z = "+z);
	}
	
	public static void swapTwoDoubles(double x, double y) {
		System.out.println(" x = "+x+" and y = "+y);
		double swap = x;
		x = y;
		y = swap;
		System.out.println(" x = "+x+" and y = "+y);
	}
	
	public static void main(String[] args) {
		checkNumber(175, 255);
		swapTwoIntegers( 10, 5);
		swapTwoDoubles( 2.5, 7.5);
		swapThreeIntegers(10,5,12); 
	}

}
