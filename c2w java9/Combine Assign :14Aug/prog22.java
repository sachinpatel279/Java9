
class Prog22{

	public static void main(String[]args){

		//char ch='a';
		char ch='s';
		String sVar=null;

		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
			sVar="Vowel";
		}
		else{
			sVar="Consonant";
		}
		

		switch(sVar){

			case "Vowel":{

				System.out.println("It is Vowel");
				break;
			
			}
			case "Consonant":{

				System.out.println("It is Consonant");
				break;

			}
		}
	}
}



