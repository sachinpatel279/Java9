
class Prog16{

	public static void main(String[]args){

		int num=1;
	
		while(num<=100){

			int temp=num;

			System.out.print(" number "+num+ " is divided by ");

			while(temp !=0){

				int div=temp % 10;

				if(div !=0 && num%div==0)
					System.out.print(div+" ");

				temp=temp/10;
			}
			System.out.println();

			num++;
		}
	}
}
