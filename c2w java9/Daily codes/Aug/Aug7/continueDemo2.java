
class ContinueDemo2{

	public static void main(String[]args){

		int i=1;

		while(i<=50){

			if(i %7==0 || i%5==0)
				continue;
			else
				System.out.println(i);
			i++;
		}
	}
}
