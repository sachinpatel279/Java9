
class Prog2{

    public static void main(String[] args){

        int num1=20; 
	int num2=28;

        while(num1 !=num2){
		
		if(num1 > num2){
			
			num1=num1 - num2;
		}
            else{
		    num2=num2 - num1;
	    }
	}
	System.out.println("GCD of given numbers is="+num2);

    	System.out.println(" ");
    }

}
