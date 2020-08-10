
import java.util.Scanner;

class Prog3{

	public static void main(String[]args){

		int count=0;
		int num;

		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number :");
		num=scan.nextInt();


		for(int i=1;i<=num;i++){
			count=0;

			for(int j=2;j<=i/2;j++){

				if(i%j==0){
					count++;
					break;
				}
			}
			if(count==0 && i !=1){
				System.out.println(i+" ");
			}
		}
	}
}
