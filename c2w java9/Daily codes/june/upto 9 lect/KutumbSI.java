//static and instance method

class KutumbSI{
	int mob=1;  //instance variable
	int laptop=1;//instance variable
	static int tv=1;//static variable
	
	void display(){
		System.out.println("in display");
		}	

	static void statdisplay(){
		System.out.println("in statdisplay");
		}

public static void main(String []args){
	KutumbSI obj1=new KutumbSI();
	obj1.display();
	obj1.statdisplay();	

	KutumbSI obj2=new KutumbSI();
	obj2.display();
	obj2.statdisplay();	
	
	}
}
/*------op
in display
in statdisplay
in display
in statdisplay
*/
