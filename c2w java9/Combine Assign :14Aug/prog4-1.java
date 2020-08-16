
class Prog4_1{

	void int Largest(int[] a,int total){
		int temp;

		for(int i=0;i<total;i++){
			for(int j=1+i;j<total;j++){

				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-2];
	}

	public static void main(String[]args){

		int a[]={455,800,56,39,290,18,383,3,290,29,10};
		int b[]={10,9,4,5,6,7,8,3};
		int c[]={10,8,56,23,45,97};

		System.out.println("From 'a' Second Largest Number Is :"+Largest(a,11));
		System.out.println("From 'b' Second Largest Number Is :"+Largest(b,8));
		System.out.println("From 'c' Second Largest Number Is :"+Largest(c,6));
	}
}

