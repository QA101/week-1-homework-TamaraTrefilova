
public class Loops {

	public static void printStars() {
		for(int i = 0; i<4;i++) {
			for(int c = 0; c<=5;c++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
		System.out.println("\n");
	}
	
	public static void printTwo() {
		for(int i = 0; i<4;i++) {
			for(int c = 0; c<=i;c++) {
				System.out.print("2 ");
			}
			System.out.println();
		}	
		System.out.println("\n");
	}
	
	public static void print$() {
		int b = 1;
		for(int i = 0; i<4;i++){	
			for(int a = 1; a<=b;a++) {
				System.out.print("$ ");
			}
			b+=2;
			System.out.println();
		}
		System.out.println("\n");
	}
	
	public static void printStarsTriangle() {
		int b = 2;
		for(int i = 0; i<4;i++){	
			for(int a = 1; a<=b;a++) {
				System.out.print("* ");
			}
			b+=2;
			System.out.println();
		}	
		System.out.println("\n");
	}
	
	public static void printIntegers1() {
		for(int i = 0; i<4;i++) {
			int a = 1;
			for(int c = 1; c<=i+1;c++) {
				
				System.out.print(" "+a++);
			}
			System.out.println();
		}
		System.out.println("\n");
	}
	
	public static void printIntegers2() {
		int b = 1;
		int a = 1;
		for(int i = 0; i<4;i++) {	
			for(int c = 1; c<=i+b;c++) {		
				System.out.print(" "+a);
			}
			a++;
			b+=1;
			System.out.println();
		}
		System.out.println("\n");
	}
	
	public static void printIntegers3() {
		int b = 3;
		for(int i = 0; i<3;i++) {
			int a = 1;
			for(int c = 1; c<=i+b;c++) {		
				System.out.print(" "+a++);
			}
			b+=1;
			System.out.println();
		}
		System.out.println("\n");
	}
	
	
	public static void main(String[] args) {
		 printStars();
		 printTwo();
		 print$();
		 printStarsTriangle();
		 printIntegers1();
		 printIntegers3();
		 printIntegers2();
	}

}
