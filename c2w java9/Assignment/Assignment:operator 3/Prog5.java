

class Cricket{

	static int totalInternationalTeams=105;
	int totalWorldCup=10;

	static void WorldCupPlayCount(){

		System.out.println("Total Country Are Play WorldCup="+totalInternationalTeams);
	}

	void WorldCupWon(){
		System.out.println("Total India Won WorldCup="+totalWorldCup);
	}
}
class Play{

	public static void main(String[] args){

		Cricket worldCup= new Cricket();
		worldCup.totalInternationalTeams=12;
		worldCup.WorldCupPlayCount();
		worldCup.totalWorldCup=2;
		worldCup.WorldCupWon();
	}
}
