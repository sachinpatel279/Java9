//in one program two class is use then how to call both class

class BCCI{
	void niyam(){
		System.out.println("BCCI Rules");
	}
}

class IPL{
	public static void main(String[] args){
		System.out.println("IPL Rules");
		BCCI rule=new BCCI();
		rule.niyam();
	}
}

//at compile time code compile with saved name a file and at run time run code run with where the main method present in class
