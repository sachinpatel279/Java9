class Prog5{

	public static void main(String[] args){

		int num=12345;
		int rem=0;
		int sum=0;
		int count=0;
		int avg=0;

		while(num!=0){

			rem=num%10;
			sum=sum+rem;
			count=count+1;
			
			num=num / 10;
		}
		avg=sum/count;

		System.out.println("The Average Of Digits From The Number 12345 is= "+avg);
	}
}
