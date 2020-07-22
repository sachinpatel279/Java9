class Football{

}

class Cricket2{

	public static void main(String[]args){

		Cricket t20=new Cricket();
		Cricket test=new Cricket();
		Football fmatch=new Football();

		System.out.println(t20 instanceof Object );//true
		System.out.println(fmatch instanceof Football);//true

		System.out.println(fmatch instanceof Object);

	}

}
		


