import java.util.Scanner;

public class Exercise {
	public static String season(int month, int day) {
		String seasonStr = "";
		if((month==12 && (day>=16 && day<=31)) || ((month>0 && month<3)&&(day>=1 && day<=31)) || (month==3 && day<16)) {
			seasonStr = "Winter";
		} else if((month==3 && (day>=16 && day<=31)) || ((month>3 && month<6)&&(day>=1 && day<=31))|| (month==6 && day<16)){
			seasonStr = "Spring";
		} else if((month==6 && (day>=16 && day<=31)) || ((month>6 && month<9)&&(day>=1 && day<=31))||(month==9 && day<16)) {
			seasonStr = "Summer";
		} else if((month==9 && (day>=16 && day<=31)) || ((month>9 && month<12)&&(day>=1 && day<=31))||(month==12 && day<16)){
			seasonStr = "Fall";
		}
		return seasonStr;
	}
	
	public static int  daysInMonth(int month) {
		int days = 0;
		switch(month) {
		case 1: days = 31;
			break;
		case 2: days = 28;
			break;
		case 3: days = 31;
			break;
		case 4: days = 30;
			break;
		case 5: days = 31;
			break;
		case 6: days = 30;
			break;
		case 7: days = 31;
			break;
		case 8: days = 31;
			break;
		case 9: days = 30;
			break;
		case 10: days = 31;
			break;
		case 11: days = 30;
			break;
		case 12: days = 31;
			break;
		default: days = 0;
		   break;
		}
		return days;
	}
	public static void printGPA() {
		System.out.print("Enter a student record: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		int numOfSCore = scanner.nextInt();
		double score = 0;
		for(int i = 0; i<numOfSCore;i++) {
			score +=scanner.nextInt(); 
		}
		score = score/numOfSCore;
		System.out.println(name+"'s grade is "+score);
		scanner.close();
	}
	
	public static void StarFigure() {
		for(int i=0;i<16; i++) {
			System.out.print("/");
		}
		for(int i=0;i<16; i++) {
			System.out.print("\\");
		}
		System.out.println();
		for(int i=0;i<12; i++) {
			System.out.print("/");
		}
		for(int i=0;i<8; i++) {
			System.out.print("*");
		}
		for(int i=0;i<12; i++) {
			System.out.print("\\");
		}
		System.out.println();
		for(int i=0;i<8; i++) {
			System.out.print("/");
		}
		for(int i=0;i<16; i++) {
			System.out.print("*");
		}
		for(int i=0;i<8; i++) {
			System.out.print("\\");
		}
		System.out.println();
		for(int i=0;i<4; i++) {
			System.out.print("/");
		}
		for(int i=0;i<24; i++) {
			System.out.print("*");
		}
		for(int i=0;i<4; i++) {
			System.out.print("\\");
		}
		System.out.println();
		for(int i=0;i<32; i++) {
			System.out.print("*");
		}
	}
	
	
	public static void main(String[] args) {
//		System.out.println(season(2, 21));
//		System.out.println(1);
//		printGPA();

		
		StarFigure();
		
	}

}
