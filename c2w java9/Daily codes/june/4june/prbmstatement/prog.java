class Mall{
	int pizzaprice= 100;
	int burgerprice=50;
	static int movieprice=300;

	static void Movie(){
		System.out.println("Tanhaji");
	}

	void FoodStall(){
		System.out.println("khayla Jau");
	}

}

class Friends{
	public static void main(String[]args){

		Mall majja=new Mall();
		majja.FoodStall();

		majja.Movie();
	}

}

	
