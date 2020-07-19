class StaticMethodDemo{

	int rollno=10;
	static String family_name="Core2Web Family";
	String batch="Java9";

	static void oneRule(){

		System.out.println("\n You Must Know the code till Core..");
		System.out.println("\n Only Rule:Coding Coding and Coding 24x7");

	}

	public void methodOne(){
		System.out.println("Roll no:"+rollno);
		System.out.println("Family name:"+family_name);
		System.out.println("Batch:"+batch);
	}


	public void methodTwo(){

		rollno=13;
		batch="PPA";
		System.out.println("Roll no:"+rollno);
		System.out.println("Family Name:"+family_name);
		System.out.println("Batch:"+batch);

	}

}

class MainMethod2{

	public static void main(String[]args){

		StaticMethodDemo skd=new StaticMethodDemo();

		System.out.println("\n\n-----from Method One-----");
		skd.methodOne();
		StaticMethodDemo.oneRule();

		System.out.println("\n\n-----from Method Two-----");
		skd.methodTwo();
		StaticMethodDemo.oneRule();

		System.out.println("\n\n-----from main Method-----");

		skd.rollno=52;
		skd.batch="Python";

		System.out.println("Roll no:"+skd.rollno);
		System.out.println("Family Name:"+StaticMethodDemo.family_name);
		System.out.println("Batch:"+skd.batch);
		StaticMethodDemo.oneRule();

	}

}



