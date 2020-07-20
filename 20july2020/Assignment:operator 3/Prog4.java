class BitwiseComp{

	public static void main(String[] args){

		System.out.println("Bitwise Complement For INT");
		int num=42;
		int ans=0;
		ans=~num;

		System.out.println("~num="+ans);
		
		
		System.out.println("\nBitwise Complement For Long");
		long l=8282L;
		long ans1=0;
		ans1=~l;
	
		System.out.println("~l="+ans1);
		
		
		System.out.println("\nBitwise Complement For char");
		char s='S';
		int ans2;
		ans2 =~s;		
		System.out.println("~s="+ans2);


		System.out.println("\nBitwise Complement For float");
		float f=23234F;
		int ans3;
		//ans3 =~f;		
		//System.out.println("~f="+ans3);
		System.out.println("Float Not Work In BitWise Complement");
		

		System.out.println("\nBitwise Complement For double");
		double d=53267D;
		double ans4;
		//ans4=~d;
		//System.out.println("~d="+ans4);
		System.out.println("\nDouble  Not Work In BitWise Complement");
	
	}


}
