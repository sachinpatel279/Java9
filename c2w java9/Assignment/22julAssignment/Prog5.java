
class Samsung{

	public static void main(String[]args){

		Samsung iphoneX=null;
		Samsung iphoneXR=null;
		Samsung iphone11Pro=null;

		Samsung S10=new Samsung();

		boolean isiphoneXSamsung=iphoneX instanceof Samsung;
		System.out.println("is iphoneX and Samsung product ="+isiphoneXSamsung);

		boolean isiphoneXRSamsung=iphoneXR instanceof Samsung;
		System.out.println("is iphoneXR and Samsung product ="+isiphoneXRSamsung);

		boolean isiphone11ProSamsung=iphone11Pro instanceof Samsung;
		System.out.println("is iphone11pro and Samsung product ="+isiphone11ProSamsung);

		boolean isS10Samsung=S10 instanceof Samsung;
		System.out.println("is S10 and Samsung Product ="+isS10Samsung);

	}

}





