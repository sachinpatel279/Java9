

class Youtube{

	static int totalYoutubeUser=150000;
	int Subscriber=0;

	void dispYoutubers(){

		System.out.println("totalYoutubeUser="+totalYoutubeUser);
		System.out.println("Subscriber="+Subscriber);

	}

}

class TikTok{

	static int totalTikTokUser=120000;
	int Followers=1200;

	void dispTikTokers(){

		System.out.println("totalTikTokUser="+totalTikTokUser);
		System.out.println("Followers="+Followers);

	}

}

class User{

	public static void main(String[]args){

		Youtube carryminati=new Youtube();
		carryminati.Subscriber=50000;
		carryminati.dispYoutubers();

		Youtube hindustani_Bhau=new Youtube();
		hindustani_Bhau.Subscriber=45000;
		hindustani_Bhau.dispYoutubers();

		TikTok tiktok_Famous_user1=new TikTok();
		tiktok_Famous_user1.Followers=100;
		tiktok_Famous_user1.dispTikTokers();
		tiktok_Famous_user1.totalTikTokUser=100; 

		TikTok tiktok_Famous_user2=new TikTok();
		tiktok_Famous_user2.Followers=0;
		tiktok_Famous_user2.dispTikTokers();

	}

}

