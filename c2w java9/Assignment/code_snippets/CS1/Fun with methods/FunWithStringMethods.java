class SomeStringMethods{

	public static void main(String[]args){

		//String one=''; //error
		String two="";
		String three="navigableSet@Core2WebTechnologies";

		//isEmpty()
		System.out.println(two.isEmpty());
		
		//length()
		System.out.println(three.length());

		//charAt()
		System.out.println(three.charAt(0));

		//equals()
		System.out.println(two.equals(""));

		//concat()
		System.out.println(three.concat("is the best place"));

		//toLowerCase()
		System.out.println("NAVUGABLE-SET".toLowerCase());

		//toUpperCase()
		System.out.println("navigable-set".toUpperCase());

	}

}
