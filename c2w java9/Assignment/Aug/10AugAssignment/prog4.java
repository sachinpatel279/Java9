
import java.util.Scanner;
class Prog4{

	public static void main(String[]args){

		Scanner scan=new Scanner(System.in);
		int num;
		System.out.println("Enter A Number");
		num=scan.nextInt();
			
			int fact=1;
		for(int i=1;i<=num;i++){
			fact=fact*i;
			System.out.println("factorial of"+ " "+i+  "="+fact);
		}
	}
}
