class Fan{
static boolean isConnected;
static int price = 6000;
static String brandName = "Usha";
static int maxSpeed = 5;
static int minSpeed;
static int currentSpeed;

public static void main(String frize[]){
	System.out.println("Main Started");
	onOrOff();
	maxSpeed();
	maxSpeed();
	maxSpeed();
	minSpeed();
	minSpeed();
	minSpeed();
	onOrOff();
	minSpeed();
	System.out.println("Main Ended");

}

public static boolean onOrOff(){
	System.out.println("On or Off method started");
	if(isConnected == false ){
	 isConnected = true;
	 System.out.println("Fan is turned on  ");
	}
	else if(isConnected== true){
	isConnected = false;
	System.out.println("Fan is turned off");
	}
	System.out.println("On or Off method Ended");
	return isConnected;
}
public static int maxSpeed(){
	System.out.println("Maximum speed method Started");
	if(isConnected == true){
		if(currentSpeed < maxSpeed){
			System.out.println("current Speed is less than Max... proceed");
		currentSpeed = currentSpeed + 1;
		System.out.println("current speed is  "+ currentSpeed);
		}
		else{
			System.out.println("maximum speed reached**** ");
		}
	}
	else{
		System.out.println("Switch On the Fan  first  ");
	}
	System.out.println("Maximum speed method Ended");
	return currentSpeed;
}
public static int minSpeed(){
	System.out.println("Minimun speed method Started");
	if(isConnected == true){
		if(currentSpeed > minSpeed){
	System.out.println("current speed is more than Minimum... proceed");
		currentSpeed = currentSpeed - 1;
		System.out.println("current speed is "+ currentSpeed);
		}
	else{
		System.out.println("Minimum speed is reached ***");
	}
	}
	else{
		System.out.println("Switch On the Fan  first ");
	}
	System.out.println("Minimum speed Method Ended");
	return currentSpeed;
	}
}
