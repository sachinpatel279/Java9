
class Prog24{

	public static void main(String[]args){

		int num=234;
		int count=0;

		while(num !=0){

			num=num/10;
			count++;
		}
		System.out.println("Number Of Digits= "+count);
	}
}
