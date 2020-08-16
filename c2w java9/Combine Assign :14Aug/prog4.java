
class Prog4{

	public static void main(String[]args){

		int a=10;
		int b=20;
		int c=30;

		if(a>b && a>c){
			if(b>c){
				System.out.println("Second Largest Number Is= "+b);
			}
			else{
				System.out.println("Second Largest Number Is= "+c);
			}
		}
	     
		if(b>a && b>c){
                        if(a>c){
                                System.out.println("Second Largest Number Is= "+a);
                        }
                        else{
                                System.out.println("Second Largest Number Is= "+c);
                        }
                }

                if(c>a && c>b){
                        if(b>a){
                                System.out.println("Second Largest Number Is= "+b);
                        }
                        else{
                                System.out.println("Second Largest Number Is= "+a);
                        }
                }


		int a1=23334;
                int b1=1010;
                int c1=10000;

                if(a1>b1 && a1>c1){
		       	if(b1>c1){
                                System.out.println("Second Largest Number Is= "+b1);
                        }
                        else{
                                System.out.println("Second Largest Number Is= "+c1);
                        }
                }

		if(b1>a1 && b1>c1){
                        if(a1>c1){
                                System.out.println("Second Largest Number Is= "+a1);
                        }
                        else{
                                System.out.println("Second Largest Number Is= "+c1);
                        }
                }

		if(c1>a1 && c1>b1){
                        if(b1>a1){
                                System.out.println("Second Largest Number Is= "+b1);
                        }
                        else{
                                System.out.println("Second Largest Number Is= "+a1);
                        }
                }
	       
		int a2=1999;
                int b2=2000;
                int c2=1998;

                if(a2>b2 && a2>c2){
                        if(b2>c2){
                                System.out.println("Second Largest Number Is= "+b2);
                        }
                        else{
                                System.out.println("Second Largest Number Is= "+c2);
                        }
                }

                if(b2>a2 && b2>c2){
                        if(a2>c2){
                                System.out.println("Second Largest Number Is= "+a2);
                        }
                        else{
                                System.out.println("Second Largest Number Is= "+c2);
                        }
                }

                if(c2>a2 && c2>b2){
                        if(b2>a2){
                                System.out.println("Second Largest Number Is= "+b2);
                        }
                        else{
                                System.out.println("Second Largest Number Is= "+a2);
                        }
                }
	}
}
