//static and instance method
class KutumbSI2{
	int mob=1;  //instance variable
	int laptop=1;//instance variable
	static int tv=1;//static variable
	
	void display(){
		System.out.println("in display");		
	}

	static void statdisplay(){
		System.out.println("in statdsiplay");
	}

public static void main(String []args){
	KutumbSI2 obj1=new KutumbSI2();
	obj1.display();	

	KutumbSI2.statdisplay();
	statdisplay();	
		
	}
}
