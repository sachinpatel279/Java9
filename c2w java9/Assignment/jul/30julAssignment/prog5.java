
import java.util.Scanner;

class Prog5{

	public static void main(String[]args){

		Scanner scan=new Scanner(System.in);
		int num;
		System.out.println("Enter a number: ");
		num=scan.nextInt();

		if(num>0){

			System.out.println("Entered Number is Greater Than Zero");
		
		}
		else if(num<0){

			System.out.println("Entered Number is Less Than Zero");
	
		}
		else{

			System.out.println("Entered Number is Equal to Zero");
		
		}
	}
}
