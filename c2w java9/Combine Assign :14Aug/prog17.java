
class Prog17{

	public static void main(String[]args){

		int num=13;
		int var1=0;

		for(int i=2;i<=num/2;i++){

			if(num % i==0){

				System.out.println(num+" is not a prime number");

			}

			else{
				var1=1;

			}
		}
		if(var1==1){
			
			System.out.println(num+" is a prime number");
		}
	}
}
	



