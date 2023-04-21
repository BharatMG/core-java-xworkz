class Speaker1 {

	static boolean isConnected;
	static String brandName = "Noise";
	static int price = 3000;
	static int maxVolume=100;
	static int minVolume;
	static int currentVolume;

public static void main(String speaker[]){
System.out.println("Main started");
	onOrOff();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	decreaseVolume();
	decreaseVolume();
	onOrOff();
	increaseVolume();
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

public static int increaseVolume(){
	System.out.println("increaseVolume method Started ");
	if(isConnected == true){
		if(currentVolume< maxVolume){
		System.out.println(" current volume is less than Max... proceed");
		currentVolume = currentVolume + 1;
		System.out.println("The current volume is "+ currentVolume);
		}
		else{
			System.out.println("Max volume is reached  ");
			}
	}
	else {
		System.out.println("Macchaaa Speaker turn on madu first  ");
		}
	System.out.println("increaseVolume method is Ended");
	return currentVolume;
	}
	
public static int decreaseVolume(){
	System.out.println("decreaseVolume method Started");
	if(isConnected == true){
		if(currentVolume> minVolume){
	System.out.println(" current volume is more than Mim... proceed");
currentVolume = currentVolume - 1;
	System.out.println("The current volume is "+ currentVolume);
	}
		else{
			System.out.println("Min volume is reached  ");
			}
	}
		else {
		System.out.println("Macchaaa Speaker turn on madu first  ");
		}	
	System.out.println("decreaseVolume method is Ended");
	return currentVolume;
	}
}	


