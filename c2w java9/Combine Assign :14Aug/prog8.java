
class Prog8{

	public static void main(String[]args){

		int num=141;
		int count=0;
		int var=num;

		while(num !=0){

			int rem=num%10;
			for(int i=2;i<=rem/2;i++){
				count=0;

				if(rem %i==0){
					count=1;
					break;
				}
			}
			if(count==0){

				System.out.println("the prime digit from the number "+ var +" is "+rem);

			}
			num=num/10;
		}
	}
}
