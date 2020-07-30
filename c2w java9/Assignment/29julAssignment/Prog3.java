
class Prog3{

	public static void main(String[]args){

		int x=40;
		int y=70;
		int z=30;

		if(x > y && x > z){
			System.out.println("Largest number is"+x);
		}

		else if(y > x && y > z){
			System.out.println("Largest number is"+y);
		}

		else if(z > x && z > y){
			System.out.println("Largest number is"+z);
		}
	}
}
