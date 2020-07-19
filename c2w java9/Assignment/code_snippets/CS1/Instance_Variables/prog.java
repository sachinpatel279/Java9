class InstanceVariableDemo{

	int age=25;
	String name="Ramesh";
	float weight=59.6f;
	long phone_number=808828384l;

	public void displayInfo(){

		System.out.println("Name :"+name);
		System.out.println("Age:"+age);
		System.out.printf("Weight:"+weight);
		System.out.printf("\nPhone number :"+phone_number);
		System.out.println();

	}

}

class MainDemo{

	public static void main(String[] arguments){

		InstanceVariableDemo isd=new InstanceVariableDemo();
	       	isd.displayInfo();

	}

}
				
