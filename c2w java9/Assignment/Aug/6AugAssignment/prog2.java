

import java.util.Scanner;
class Student{

	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Student Year=");
		int year=scan.nextInt();

		switch(year){

			case 1:
				System.out.println("student is not eligible for eduation scholarship");
				break;

			case 2:
				System.out.println("student is not eligible for education scholarship");
				break;
			
			case 3:
				{
					Scanner sc=new Scanner(System.in);
                                        System.out.println("Enter Student Marks :");
                                        int marks = sc.nextInt();

					switch(marks){

						case 80:
							System.out.println("student is eligible for education scholarship");
				                        break;
						default :
							System.out.println("Enter Correct Marks");
							break;
					}
				 }
				break;

		}
	}
}

                			 


		
	

