
class Prog3{

	public static void main(String[]args){

		long num=345669760562L;
		long rem=0;
		int count=0;

		while(num !=0){

			rem=num %10;

			if(rem==6)
				count++;
			num=num/10;
		}
		System.out.println("The Occurrence 6 in number is " +count);
	}
}
