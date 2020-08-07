
class Pattern5{

	public static void main(String[] args){

		int temp=1;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				int sum=((temp * temp)-1);
				System.out.print(" "+sum);
				temp++;
			}
		System.out.println();
		}
	}
}
