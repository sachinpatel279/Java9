
class Pune{

	static int covidActiveCases=14000;
	int totalCases=28000;

	static void noCorona(){

		System.out.println("No Corona Cases");

	}

	void lockDown(){

		System.out.println("Corona Avtive Cases="+covidActiveCases);

	}

	void noLockDown(){

		System.out.println("Corona Total Cases="+totalCases);

	}

}

class Mumbai{

	static int covidActiveCases=30000;
	int totalCases=100000;

	static void noCorona(){

		System.out.println("No Corona Cases");

	}

	void lockDown(){

		System.out.println("Corona Active Cases="+covidActiveCases);
	
	}

	void noLockDown(){

		System.out.println("Corona Total Cases="+totalCases);

	}

}

class CovidCases{

	public static void main(String[]args){

		System.out.println("Pune Corona Cases");
		Pune coronaCases1=new Pune();
		coronaCases1.lockDown();
		coronaCases1.noLockDown();

		System.out.println("Pune Corona Cases After No Lockdown");
		Pune coronaCases2=new Pune();
		coronaCases2.covidActiveCases=20000;
		coronaCases2.totalCases=34000;
		coronaCases2.lockDown();
		coronaCases2.noLockDown();




		System.out.println("Mumbai Corona Cases");
                Mumbai coronaCases3=new Mumbai();
                coronaCases3.lockDown();
                coronaCases3.noLockDown();

                System.out.println("Mumbai Corona Cases After No Lockdown");
                Mumbai coronaCases4=new Mumbai();
                coronaCases4.covidActiveCases=40000;
                coronaCases4.totalCases=110000;
                coronaCases4.lockDown();
                coronaCases4.noLockDown();
	}

}
