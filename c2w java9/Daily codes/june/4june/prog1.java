class ExamCancel{
	int x=10;
	static int y=20;
	int z=30;

	void happy(){
		System.out.println("Thanks CM saheb");
	}

	static void DecisionPending(){
		System.out.println("student chidale");
	}


}


class Students{
	public static void main(String []args){
		
		ExamCancel obj=new ExamCancel();
		obj.happy();
		
		
		obj.DecisionPending();
		//ExamCancel.DecisionPending();
	}

}
