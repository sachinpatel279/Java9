

class CoronaMaha{

	int count=170000;

	void precoution(){

		System.out.println("Kalji Ghya");
		System.out.println("Count="+count);

	}

	static void impDecision(){

		System.out.println("CM's-decision");

	}


	public static void main(String[]args){

		CoronaMaha Jun28=new CoronaMaha();
		Jun28.precoution();
		Jun28.impDecision();

		CoronaMaha Jun29=new CoronaMaha();
		Jun29.count=175000;
		Jun29.precoution();
	
	}

}
