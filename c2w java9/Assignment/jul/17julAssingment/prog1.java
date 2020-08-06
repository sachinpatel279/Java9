
class Dominos{

	int Price=100;
	int Quantity=2;
	static int Total=200;

	static void Bill(){

		System.out.println("Total Cost Is="+Total);

	}

}

class PizzaOrder{

	public static void main(String[]args){

		Dominos pizza=new Dominos();
		pizza.Quantity=4;
		pizza.Price=100;
		System.out.println("Pizza");
		System.out.println("Quantity="+pizza.Quantity);
		System.out.println("Price="+pizza.Price);
		pizza.Total=400;
		pizza.Bill();

		Dominos fries=new Dominos();
		fries.Quantity=3;
		fries.Price=50;
		System.out.println("Fries");
		System.out.println("Quantity="+fries.Quantity);
		System.out.println("Price="+fries.Price);
		fries.Total=150;
		fries.Bill();




	}

}



