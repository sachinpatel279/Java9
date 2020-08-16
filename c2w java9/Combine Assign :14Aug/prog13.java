
class Prog13{

	public static void main(String[]args){

		int num=9;
		int square=0;
		int sum=0;
		int temp=num;

		square=num * num;

		while(square !=0){

			int rem=square%10;
			sum=sum+rem;
			square=square/10;

		}
		if(temp==sum){

			System.out.println(temp+" is neon number ");

		}
		else{

			System.out.println(temp+ "is not neon number");

		}
	}
}
