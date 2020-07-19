
class Capgemini{

	static int noOfEmp=200000;

		int projectCount=200;
		
		void displayProject(){

			System.out.println("CapgrminiProjectCount="+projectCount);

		}

		static void empInfo(){

			System.out.println("CapgeminiTotalEmp="+noOfEmp);

		}

}

class TCS{

	static int noOfEmp=300000;

		int projectCount=350;

		void displayProject(){

			System.out.println("TCSProjectCount="+projectCount);

		}

		static void empInfo(){

			System.out.println("TCSTotalEmp="+noOfEmp);

		}

}

class ITCompanies{

	public static void main(String[]args){

		Capgemini pune=new Capgemini();
		pune.projectCount=130;
		pune.displayProject();
		pune.empInfo();

		Capgemini chennai=new Capgemini();
		chennai.projectCount=70;
		chennai.displayProject();
		chennai.empInfo();


		TCS mumbai=new TCS();
		mumbai.projectCount=200;
		mumbai.displayProject();
		mumbai.empInfo();

		TCS banglore=new TCS();
		banglore.projectCount=150;
		banglore.displayProject();
		banglore.empInfo();

	}

}







