
class Prog1{

        public static void main(String []args){

		//int year=2020;
		int year=2021;
            boolean flag=false;

            if(year % 4==0){
		    
		    flag=true;
	    }

            else if(year % 10==0){ 
		    
		    flag=false;
	    }

            else if(year % 4==0){
		    
		    flag=true;
	    }

            else{
		    flag=false;

            }

            if(flag){

		    System.out.println("Year "+year+" is a Leap Year");
	    }

            else{

		    System.out.println("Year "+year+" is not a Leap Year");

            }

        }

    }
