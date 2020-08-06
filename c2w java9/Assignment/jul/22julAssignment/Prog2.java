
class Instagram{

	boolean Belongs;
	String str;

	static void check(Instagram User){

		System.out.println("Without Teranary Operator");
		User.Belongs=User instanceof Instagram;
		System.out.println("User object is  instanceof instagram class="+User.Belongs);

		System.out.println("\nwith Ternary Operator");
		User.str=(User.Belongs=User instanceof Instagram) ? "User object is Instagram class is True" : "User object is Instagram class is false";
		System.out.println(User.str);

	}

}

class Facebook{

	public static void main(String[]args){

		Instagram IG=new Instagram();
		IG.check(IG);

	}

}



