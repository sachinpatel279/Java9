

class MobilePhone{

	int count=12000;

	void M30S_4GBRAM(){

		System.out.println("Mobile Price");
		System.out.println("Count="+count);

	}

	static void M30S_6GBRAM(){

		System.out.println("New Price");

	}


	public static void main(String[]args){

		MobilePhone mob1=new MobilePhone();
		mob1.M30S_4GBRAM();
		mob1.M30S_6GBRAM();

		MobilePhone mob2=new MobilePhone();
		mob2.count=15000;
		mob2.M30S_4GBRAM();
	
	}

}
