

class Arithemetic{

	int num1=10;
	int num2=20;

	static void ArithmeticOp(){

		System.out.println( "\nArithemtic Operation");

	}

	void Addition(){

		System.out.println("addition is="+(num1+num2));

	}

	void Substraction(){

		System.out.println("Substraction is="+(num1-num2));

	}

	void Multiplication(){

		System.out.println("Multiplication is="+(num1*num2));

	}

	void Division(){

		System.out.println("Division is="+(num1/num2));

	}

	void Modulus(){

		System.out.println("Modulus is="+(num1%num2));

	}

}

class Logical{

	int num1=10;
	int num2=20;

	boolean ans;

	static void LogicalOp(){

		System.out.println("\nLogical Operation");

	}

	void AND(){
		
		ans=(num1 !=num2) && (num1<num2);
		System.out.println("Ans Of AND is="+ans);

	}

	void OR(){

		ans=(num1 < num2) || (num1 > num2);
		System.out.println("Ans Of OR is="+ans);

	}

}

class Bitwise{

	int num1=8;
	int num2=5;

	int res;

	static void BitwiseOp(){

		System.out.println("\nBitwise Oeration");

	}

	void AND(){

		res=num1 & num2;
		System.out.println("Bitwise AND="+res);

	}

	void OR(){

		res=num1 | num2;
                System.out.println("Bitwise OR="+res);

	}

	void XOR(){

                res=num1 ^ num2;
                System.out.println("Bitwise XOR="+res);

        }

	void Negation(){

                res=(~num1);
                System.out.println("Bitwise Negation Of num1="+res);

		res=(~num2);
		System.out.println("Bitwise Negation of num2="+res);

        }

	void LeftShift(){

		res=(num1<<2);
		System.out.println("num1 Left Shift by 2="+res);
		
		res=(num2<<2);
		System.out.println("num2 Left Shift by 2="+res);

	}

	void RightShift(){

                res=(num1>>3);
                System.out.println("num1 Right Shift by 3="+res);

                res=(num2>>3);
                System.out.println("num2 Right Shift by 3="+res);

        }

	void UnsignedRightShift(){

                res=(num1>>>4);
                System.out.println("num1 Unsigned Right Shift by 4="+res);

                res=(num2>>>4);
                System.out.println("num2 Unsigned Right Shift by 4="+res);

        }


		
}


class Operator{

	public static void main(String[]args){

		Arithemetic obj1=new Arithemetic();
		obj1.ArithmeticOp();
		obj1.Addition();
		obj1.Substraction();
		obj1.Multiplication();
		obj1.Division();
		obj1.Modulus();

		Logical obj2=new Logical();
	       	obj2.LogicalOp();
		obj2.AND();
		obj2.OR();	

		Bitwise obj3=new Bitwise();
		obj3.BitwiseOp();
		obj3.AND();
		obj3.OR();
		obj3.XOR();
		obj3.Negation();
		obj3.LeftShift();
		obj3.RightShift();
		obj3.UnsignedRightShift();


	}

}




