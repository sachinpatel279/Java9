public class ClassTwo{

	public void displayInfoTwo(){

		System.out.println("Hello everyone,");
		System.out.println("This method is from ClassTwo,");

	}

	public static void main(String args[]){

		ClassOne obj1=new ClassOne();
		ClassTwo obj2=new ClassTwo();

		obj1.displayInfoOne();
		obj2.displayInfoTwo();

	}

}
