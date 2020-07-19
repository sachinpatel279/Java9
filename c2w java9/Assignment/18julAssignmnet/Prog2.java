

class Operator{

	public static void main(String[]args){

		int num=5;
		int ans;

		ans=(num>>>=2);
		System.out.println(ans);

		ans=(num<<=3);
		System.out.println(ans);

		ans=(num^=2);
		System.out.println(ans);

		ans=(++num);
		System.out.println(ans);

		ans=(~num);
		System.out.println(ans);
		
	}

}




