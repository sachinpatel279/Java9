

class Cricket{

	public static void main(String[]args){

		Cricket test=new Cricket();
		Cricket oneday=new Cricket();
		Cricket t20=new Cricket();
		Cricket Thirty5=null;
		
		boolean res;

		res=test instanceof Cricket;	//type 1 //true
		System.out.println(res);

		System.out.println(oneday instanceof Cricket);	//type2 /true
		System.out.println(t20 instanceof Cricket);	//type2 /true

		System.out.println(Thirty5 instanceof Cricket);		//false

	}

}
		


