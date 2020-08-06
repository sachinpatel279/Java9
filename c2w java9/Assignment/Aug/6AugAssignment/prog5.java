
class Prog5{

	public static void main(String[]args){
		
		System.out.println("Table of 3 is=");
		for(int i=1;i<=30;i++){
			if(i%3==0){
				System.out.print(i+",");
			}
		}

		System.out.println(" ");
		System.out.println("Even number present in table=");

		for(int i=1;i<=30;i++){
			if(i%3==0 && i%2==0){
				System.out.println(i);
			}
		}

	}
}

