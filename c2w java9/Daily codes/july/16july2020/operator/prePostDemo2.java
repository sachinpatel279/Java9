
class PrePostDemo2{

	public static void main(String[]args){

		int num=10;
		int ans=0;
		
		//num++->num=num+1
		ans=num++;
		System.out.println(ans);	//10
		System.out.println(num);	//11


		ans=num++;
		System.out.println(ans);	//11
		System.out.println(num);	//12
	}

}
