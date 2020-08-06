
class Prog5{

	boolean isEligible(int a){

		if(a<=75){

			System.out.println("\n Your Attendance is "+a);
			System.out.println("\n Processing ");
			System.out.println("\n Student is not eligible for exam");

		}
		else{

			System.out.println("\n Your Attendance is "+a);
			System.out.println("\n Processing "+a);
			System.out.println("\n Student is eligible for exam ");

		}

		return true;
	}

}
class Attendance{

	public static void main(String[]args){

		Prog5 obj=new Prog5();
		obj.isEligible(65);

	}
}

