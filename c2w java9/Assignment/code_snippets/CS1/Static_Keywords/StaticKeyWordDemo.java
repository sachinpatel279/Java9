class StaticKeyWordDemo{

	int rollno=10;
	static String family_name="Core2Web Family";
	String batch="Java9";

	public void methodOne(){

		System.out.println("Roll no:"+rollno);
		System.out.println("Family Name:"+family_name);
		System.out.println("Batch:"+batch);

	}

	public void methodTwo(){

		rollno=13;
		batch="PPA";
		System.out.println("Roll no:"+rollno);
		System.out.println("Family name:"+family_name);
		System.out.println("Batch:"+batch);
	}



}

class MainMethod{

	public static void main(String[]args){

		StaticKeyWordDemo skd=new StaticKeyWordDemo();

		System.out.println("\n\n------from method one-----");
		skd.methodOne();

		System.out.println("\n\n------from method Two-----");
		skd.methodTwo();

		System.out.println("\n\n------from main method-----");

		skd.rollno=52;
		skd.batch="Python";

		System.out.println("Roll no:"+skd.rollno);
		System.out.println("Family Name:"+StaticKeyWordDemo.family_name);
		System.out.println("Batch:"+skd.batch);

	}

}
