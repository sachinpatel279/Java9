
class Prog2{

	void Angle(int a){

		if(a>90 && a<180){

			System.out.println(a+"is Obtuse Angle");
		}

		if(a<90){

			System.out.println(a+"is Acute Angle");

		}

		if(a==90){

			System.out.println(a+"is Right Angle");

		}

	}

	public static void main(String[]args){

		Prog2 obj=new Prog2();
		obj.Angle(130);
		obj.Angle(60);
		obj.Angle(90);

	}

}





