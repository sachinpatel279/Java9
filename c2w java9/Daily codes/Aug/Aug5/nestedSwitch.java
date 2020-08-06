
class NestedSwitchDemo{

	public static void main(String[]args){

		int floor=4;

		switch(floor){

			case 1:
				{
					char ch='F'; //s for shopping ,f-food
					System.out.println("First Floor");
					
					switch(ch){

						case 'S':
						case 's':
							System.out.println("Shopping");
							break;
						case 'F':
						case 'f':
							System.out.println("Nusta Khaych");
							break;

						default :
							System.out.println("Service Not Available");
							break;
					}
				}
				break;
				
				
			case 2:
                                {
                                        char ch='m'; //M for shopping ,p-playstation
                                                
					System.out.println("Second Floor");
                                        switch(ch){
                                                
                                                case 'M':
                                                case 'm':      
                                                        System.out.println("Dil Bichara: Movie");
                                                        break;
                                                case 'P':       
                                                case 'p':
                                                        System.out.println("Football");
                                                        break;
                                                        
                                                default :
                                                        System.out.println("Service Not Available");
                                                        break;
                                        }               
                                }       
                                break;
			
			default:
				System.out.println("Wrong floor");
				break;
		}
	}
}	
