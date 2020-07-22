
class TernaryDemo4{

	public static void main(String[]args){

		int x=25;
		int y=20;
		int z=22;

		int res=0;
		
		res=(x>y) ? ((x>z) ? x : z ) :((y > z) ? y : z);
		System.out.println(res);

	

	}
}
