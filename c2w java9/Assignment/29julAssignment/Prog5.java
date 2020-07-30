
class Prog5{


	static int isEven(int x){

		if((x & 1)==0){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
		return 0;
	}

	public static void main(String[]args){

		int x=100;
		Prog5 evenOdd=new Prog5();
		evenOdd.isEven(x);

	}

}



