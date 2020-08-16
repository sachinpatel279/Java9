
class Prog20{

	public static void main(String[]args){

		char ch='A';
		char ch1='a';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){

				if(i%2==0){
					System.out.print(ch1 +" ");
					ch1++;
				}
				else{
					System.out.print(ch +" ");
					ch++;
				}
		
			}
			System.out.println();
		}
	}
}
