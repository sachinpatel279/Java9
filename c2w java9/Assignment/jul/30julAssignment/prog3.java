
import java.util.Scanner;

class Prog3{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter RTO Code");
		String str=scan.nextLine();
		
		switch(str){

			case "RJ":
				System.out.println("State Name : Rajasthan");
				break;
			case "AP":
				System.out.println("State Name : Andra Pradesh");
				break;
			case "MH":
				System.out.println("State Name : Maharashtra");
				break;
			case "GJ":
				System.out.println("State Name : Gujrat");
				break;
			case "DL":
				System.out.println("State Name : Delhi");
				break;
		
		}

	}
}		
