
class ChineseApps{

	static int appsCount=100;

		int appsUseInIndia=59;
		
		void dispAppsUseIndia(){

			System.out.println("TotalAppsUseInIndia="+appsUseInIndia);

		}

		static void dispAppsInfo(){

			System.out.println("TotalChineseApps="+appsCount);

		}

}

class ChinesePhones{

	static int mobileCount=20;

		int exportInIndia=10;

		void dispExportInfo(){

			System.out.println("TotalChinesePhoneExportInIndiaCount="+exportInIndia);

		}

		static void dispMobileInfo(){

			System.out.println("TotalChinesePhones="+mobileCount);

		}

}

class ChineseProducts{

	public static void main(String[]args){

		ChineseApps Apps=new ChineseApps();
		Apps.dispAppsInfo();
		Apps.dispAppsUseIndia();
		
		ChineseApps Boycott=new ChineseApps();
		Boycott.appsUseInIndia=0;
		Boycott.dispAppsUseIndia();
		Boycott.appsCount=41;
		Boycott.dispAppsInfo();
		
		ChinesePhones Mobile=new ChinesePhones();
		Mobile.dispExportInfo();
		Mobile.dispMobileInfo();
		
		ChinesePhones Ban=new ChinesePhones();
		Ban.exportInIndia=0;
		Ban.dispExportInfo();
		Ban.mobileCount=10;
		Ban.dispMobileInfo();
	}

}







