
import java.util.Scanner;

class Prog1{

	public static void main(String[] args){

		int MonthNo;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number= ");
		MonthNo=scan.nextInt();
		
		switch (MonthNo){

			case 1:
				System.out.println("January has 31 days");
				break;
			case 2:
				System.out.println("Feruary has 28 days in a common year");
				break;
			case 3:
				System.out.println("March has 31 days");
				break;
			case 4:
				System.out.println("April has 30 days");
				break;
			case 5:
				System.out.println("May has 31 days");
				break;
			case 6:
				System.out.println("June has 30 days");
				break;
			case 7:
				System.out.println("July has 31 days");
				break;
			case 8:
				System.out.println("August has 31 days");
				break;
			case 9:
				System.out.println("September has 30 days");
				break;
			case 10:
				System.out.println("October has 31 days");
				break;
			case 11:
				System.out.println("November has 30 days");
				break;
			case 12:
				System.out.println("December has 31 days");
				break;
			}
	}
}
