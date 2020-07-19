
class Honda{

	static int typesOfBike=25;

		int noOfBikeSale=300;
		
		void displayBikeSale(){

			System.out.println("HondanoOfBikeSale="+noOfBikeSale);

		}

		static void totalBike(){

			System.out.println("HondaTotalBike="+typesOfBike);

		}

}

class TVS{

	static int typesOfBike=30;

		int noOfBikeSale=400;

		void displayBikeSale(){

			System.out.println("TVSnoOfBikeSale="+noOfBikeSale);

		}

		static void totalBike(){

			System.out.println("TVSTotalBike="+typesOfBike);

		}

}

class MotorCycleCompanies{

	public static void main(String[]args){

		Honda katraj=new Honda();
		katraj.noOfBikeSale=180;
		katraj.displayBikeSale();
		katraj.totalBike();

		Honda dekkan=new Honda();
		dekkan.noOfBikeSale=120;
		dekkan.displayBikeSale();
		dekkan.totalBike();


		TVS warje=new TVS();
		warje.noOfBikeSale=150;
		warje.displayBikeSale();
		warje.totalBike();

		TVS narhe=new TVS();
		narhe.noOfBikeSale=250;
		narhe.displayBikeSale();
		narhe.totalBike();

	}

}







