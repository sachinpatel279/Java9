class Demo1{

	static int a=10;
	int b=20;
	String str1="Hello,";
	String s=new String("World");
}

class DemoMain{

	public static void main(String[]args){

		Demo1 d=new Demo1();
		System.out.println("a= "+Demo1.a);
		System.out.println("b= "+d.b);
		System.out.println("str1= "+d.str1);
		System.out.println("s= "+d.s);
	}

}
