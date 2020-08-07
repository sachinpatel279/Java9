
class Prog4{

	public static void main(String[] args){

		int num=12357798;
		int rem=0;
		int var1=0;
		int Greater=0;
		
		while (num!=0){
			var1=rem;
			rem=num % 10;
			if(var1<rem){
				Greater=rem;
			}
			num=num/10;
		}
		System.out.println("The Maximum Digits From Number= "+Greater);
	}
}
