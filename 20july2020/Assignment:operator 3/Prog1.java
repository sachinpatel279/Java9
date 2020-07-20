
class BitwiseOp{

	public static void main(String...args){

		int num1=10;
		int num2=20;
		int ans1=0;
		
		ans1=num1 & num2;
		System.out.println("Ans for int  AND="+ans1);

		ans1=num1 | num2;
		System.out.println("Ans for int  OR="+ans1);

		ans1=num1 ^ num2;
		System.out.println("Ans for int XOR="+ans1);

		long l1=5434L;
		long l2=6453L;
		long ans2=0;

		ans2=l1 & l2;
		System.out.println("Ans for long AND="+ans2);
		
		ans2=l1 | l2;
		System.out.println("Ans for long OR="+ans2);
		
		ans2=l1 ^ l2;
		System.out.println("Ans for long XOR="+ans2);


		char ch1='S';
		char ch2='P';
		int ans3;


		ans3=ch1 & ch2;
		System.out.println("Ans for char AND="+ans3);
		
		ans3=ch1 & ch2;
		System.out.println("Ans for char OR="+ans3);
		
		ans3=ch1 & ch2;
		System.out.println("Ans for char XOR="+ans3);


		float f1=19220F;
		float f2=15344F;
		float ans4;

		//ans4=f1 & f2;
		//System.out.println("Ans for float AND="+ans4);

		//ans4=f1 | f2;
		//System.out.println("Ans for float OR="+ans4);

		//ans4=f1 ^ f2;
		//System.out.println("Ans for float XOR="+ans4);
		System.out.println("float is not working");

		double d1=23242D;
		double d2=21522D;
		double ans5;


		//ans5=d1 & d2;
		//System.out.println("Ans for double AND="+ans5);

		//ans5=d1 & d2;
		//System.out.println("Ans for double OR="+ans5);

		//ans5=d1 & d2;
		//System.out.println("Ans for double XOR="+ans5);
		System.out.println("double is not working");

				

	}
}
