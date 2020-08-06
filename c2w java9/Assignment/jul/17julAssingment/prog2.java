

class Arithmetic{

	int num1=10;
	int num2=20;

	void Addition(){

		System.out.println("Add="+(num1+num2));
	
	}

	void Substraction(){

		System.out.println("Sub="+(num1-num2));

	}

	void Multiplication(){

		System.out.println("Mul="+(num1*num2));

	}

	void Division(){


		System.out.println("Div="+(num1/num2));

	}

	void Modulus(){


		System.out.println("Mod="+(num1%num2));

	}

}

class Calculate{

	public static void main(String[]args){

		Arithmetic obj=new Arithmetic();
		obj.Addition();
		obj.Substraction();
		obj.Multiplication();
		obj.Division();
		obj.Modulus();

	}

}

