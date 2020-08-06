
import java.util.Scanner;

class Prog1{

	public static void main(String[]args){

		int num1 = 0;
		int num2 = 0;
		char operator;
		
		Scanner in =new Scanner(System.in);
		System.out.println("Enter 1st Number = ");

		num1=in.nextInt();
		System.out.println("Enter 2nd Number = ");

		num2=in.nextInt();
		System.out.println("Enter Operator = ");
		operator=in.next().charAt(0);
		
		switch(operator){
			case '+':
				System.out.println("Addition Of "+num1+" & "+num2+" = "+(num1+num2));
				break;
			case '-':
				System.out.println("Subtraction Of "+num1+" & "+num2+" = "+(num1-num2));
				break;
			case '*':
				System.out.println("Multiplication Of "+num1+" & "+num2+" = "+(num1*num2));
				break;
			case '/':
				System.out.println("Division Of "+num1+" & "+num2+" = "+(num1/num2));
				break;
			case '%':
				System.out.println("Modulus Of "+num1+" & "+num2+" = "+(num1%num2));
				break;
		}

	}

}
