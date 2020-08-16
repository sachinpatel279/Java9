
class Prog15{

	void var1(int num){
		int count=0,no=num;

		if(num%2==0){
			while(num!=0){
				num=num/2;
				count++;

			}
		}
		else{
			num=num+1;
			while(num !=0){
				num=num/2;
				count++;
			}
		}
		System.out.println("steps required for " +no+ " : "+count);
	}
}

class Reduce{
	public static void main(String[]args){
		Prog15 reduce=new Prog15();
		reduce.var1(8);
		reduce.var1(123);
	}
}
