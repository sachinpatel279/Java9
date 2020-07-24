
class Prog1{

		int evenOdd(int x){
	
		if(x%2==0){

			System.out.println("a is even number");
		}
		
		else{

			System.out.println("b is odd number");
		}
	return 0;
	}
}

class EvenOdd{

	public static void main(String[]args){

		Prog1 Result=new Prog1();
		Result.evenOdd(10);
		Result.evenOdd(15);
	}
}
