class Covid19{ //object
	//comstructor
}

class Lockdown extends Covid19{  //parent is covid19
	Lockdown(){
		//super()
		System.out.println("in constructor");
	}

	public static void main(String[]args){

		Lockdown obj= new Lockdown();
		System.out.println("lockdown extend zale");
	}
}
