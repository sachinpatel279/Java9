class T20{
	static String capt="virat kohli";
	int toss=0;
	
	static void list(){
		System.out.println("player list");
		System.out.println(capt);

		T20 obj=new T20();
		System.out.println(obj.toss);
		}

	void batOrBowl(){
		System.out.println("decision");
		System.out.println(capt);
		System.out.println(toss);
		}

	public static void main(String []args){
		list();
		T20 fmatch=new T20();
		fmatch.batOrBowl();
		}
}
