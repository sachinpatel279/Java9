
class IfElseDemo3{

	public static void main(String[]args){

		int x=10;
		int y=11;

		if(++x <= --y){

			System.out.println("In if statement");
			System.out.println("X="+x);
			System.out.println("y="+y);

		}
		else{

			System.out.println("In else statement");
			System.out.println("x="+x);
			System.out.println("y="+y);

		}

		System.out.println("out of if else");

	}

}
