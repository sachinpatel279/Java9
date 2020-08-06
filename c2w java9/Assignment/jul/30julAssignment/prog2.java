
import java.util.Scanner;

class Prog2{

	public static void main(String[] args){

		char J;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter A CamelCase Character= ");
		J=scan.next().charAt(0);
		
		switch (J){

			case 'C':
				System.out.println("C");
				break;
			case 'J':
				System.out.println("Java");
				break;
			case 'P':
				System.out.println("Python");
				break;
			case 'A':
				System.out.println("Android");
				break;
			case 'B':
				System.out.println("BASH");
				break;
			}
	}
}
