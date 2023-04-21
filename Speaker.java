class Speaker {

	static boolean isConnected;
	static String brandName = "Noise";
	static int price = 3000;
	static int maxVolume=100;
	static int minVolume;
	static int currentVolume;

public static void main(String speaker[]){
	System.out.println("Main started");
	boolean connected = onOrOff();
	System.out.println("Speaker is connected "+ connected);
	boolean disConnected = onOrOff();
	System.out.println("Speaker is connected "+ disConnected);

	System.out.println("Main Ended");
}

public static boolean onOrOff(){
	System.out.println("ON or Off method started ");
	if(isConnected== false){
	isConnected= true;
	System.out.println("Speaker is turned on  ");
}
else if(isConnected == true){
	isConnected = false;
	System.out.println("Speaker is turned off ");
}
	System.out.println("On Or Off method Ended");
	return isConnected;
}
}