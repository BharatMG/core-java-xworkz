class Microwave{
	static boolean isConnected;
	static int maxTimeInSec=30;
	static int minTimeInSec;
	static int currentTimeInSec;
	
	public static void main(String[] cook){
	System.out.println("main method starts ");
		onOrOff();
		increseTime();
		increseTime();
		decreseTime();
		decreseTime();
		increseTime();
		increseTime();		
		onOrOff();
		increseTime();

	System.out.println("main method ends");
}
	
public static boolean onOrOff(){
		System.out.println("on or off method starts ");
		if(isConnected == false){
			isConnected = true;
			System.out.println("microwave is on ");
		}
		else if(isConnected ==true){
			isConnected =false;
			System.out.println("microwave is off ");
		}
		System.out.println("on or off method ends ");
			return isConnected;
	}
	
	public static int increseTime()
	{
		System.out.println("increse Time method starts ");
		if(isConnected ==true){
			if(currentTimeInSec<maxTimeInSec){
				System.out.println("current time is less than max time");
				currentTimeInSec = currentTimeInSec + 5;
				System.out.println("current time is........."+currentTimeInSec);
			}
			else
			{
		System.out.println("max time reached ");
				
			}		
		}
		else
		{
			System.out.println("turn on the microwavefirst ");
	
		}
	     	System.out.println("increse Time method ends ");
			return currentTimeInSec;
	}
		public static int decreseTime(){
		System.out.println("decrese Time starts");
		if(isConnected == true){
			if(currentTimeInSec > minTimeInSec ){
				System.out.println("decrease time starts");
				currentTimeInSec = currentTimeInSec - 2;
				System.out.println("current time is "+currentTimeInSec);
				
		}
		else{
				System.out.println("min time reached ");
		}
		}
		else{
			System.out.println("turn on the microwave first ");
		}
		System.out.println("decrease time ends ");
		return currentTimeInSec;
}
}