//changes in static variable and run variable

class Kutumb3{
	int mob=1;  //instance variable
	int laptop=1;//instance variable
	static int tv=1;//static variable
	
	void shashimethod(){
		System.out.println("Mob="+mob);
		System.out.println("Laptop="+laptop);
		System.out.println("TV="+tv);		
	}

	void vikasmethod(){
		System.out.println("Mob="+mob);
		System.out.println("Laptop="+laptop);
		System.out.println("TV="+tv);
	}

public static void main(String []args){
	Kutumb shashi=new Kutumb();
	shashi.mob=0;
	shashi.tv=0;
	shashi.shashimethod();	

	Kutumb vikas=new Kutumb();
	vikas.vikasmethod();	
	}
}

/*-----op
Mob=0
Laptop=1
TV=0
Mob=1
Laptop=1
TV=0
*/	
