
class Prog9{

	public static void main(String[]args){

		int num=121;
		int res=0;
		int temp=0;

		temp=num;
		
		while(temp>0){

			res=(res*10)+(temp%10);
			temp=temp/10;

		}

		if(num==res){

			System.out.println(num+ " is a Palindrome Number");

		}
		else{
			System.out.println(num+ " is not a Palindrome Number");

		}

	}
}
