
class Prog7{

	public static void main(String[]args){

		int a=50;
	       	int b=7;
		int c=56;

		if(a<b && a<c){

			System.out.println("minimum  number from " +a+ " "+b+" and " +c+ "is "+a);

		}
		
		if(b<a && b<c){

			System.out.println("minimum  number from " +a+ " "+b+" and " +c+ " is "+b);

		}

		if(c<a && c<b){

			System.out.println("minimum  number from " +a+ " "+b+" and " +c+ " is "+c);

		}
	}
}

