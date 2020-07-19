class IndianArmy{
	static int Year=1971;
	int armyTroopsCount=100000;
	
	static void displayYear() {
	
		System.out.println("This Year="+Year);
		
		}
		
	 	void displayArmyTroops(){
	
			System.out.println("Total Army Troops Are="+armyTroopsCount);
		
			}
		
}

class IndianNavy{

	static int Year=1975;
	
	int navyTroopsCount=50000;
	
	static void displayYear(){
	
		System.out.println("This Year="+Year);
		
		}
		
		void displayNavyTroops(){
	
			System.out.println("Total Navy Troops Are="+navyTroopsCount);
			
			}
}

class IndianAirForce{

	static int Year=1972;
	
	int airForceTroopsCount=20000;
	
	static void displayYear(){
	
		System.out.println("This Year="+Year);
	
		}
		
		void displayAirForceTroops(){
		
		System.out.println("Total Air Force Troops Are="+airForceTroopsCount);
		
		}
}

class Army {

	public static void main(String[] args){
	
		IndianArmy armyTroops=new IndianArmy();
		armyTroops.displayYear();
		armyTroops.displayArmyTroops();	
				
		IndianArmy Army_Recruitment=new IndianArmy();
		Army_Recruitment.Year=1976;
		Army_Recruitment.displayYear();
		Army_Recruitment.armyTroopsCount=300000;
		Army_Recruitment.displayArmyTroops();	
			 


		IndianNavy navyTroops= new IndianNavy();
		navyTroops.displayYear();
		navyTroops.displayNavyTroops();

		IndianNavy Navy_Recruitment= new IndianNavy();
		Navy_Recruitment.Year=1981;
		Navy_Recruitment.displayYear();
		Navy_Recruitment.navyTroopsCount=150000;
		Navy_Recruitment.displayNavyTroops();



		IndianAirForce airForceTroops=new IndianAirForce();
		airForceTroops.displayYear();
		airForceTroops.displayAirForceTroops();

		IndianAirForce airForce_Recruitment=new IndianAirForce();
		airForce_Recruitment.Year=1978;
		airForce_Recruitment.displayYear();
		airForce_Recruitment.airForceTroopsCount=80000;
		airForce_Recruitment.displayAirForceTroops();
	}
}
