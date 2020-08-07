class Prog3{

	public static void main(String[] args){
	
		int num = 1;
		
		while(1<=1000){
			if(num%7==0 && num%32==0){
			
				System.out.print(num+",");
				
				if(num%6==0){
				
					System.out.println("\nBreaking Loop ");
					System.out.println(num+" Is Divisible by 6");
					break;
				}
			}
			num++;
		}
	}
}			
