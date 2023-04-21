class IronBox{
static boolean isConnected;
static String brandName = "Bajaj";
static int price = 625;
static int maxHeat = 5;
static int minHeat;
static int currentHeat;

public static void main(String ironbox[]){
System.out.println("Main Started");
onOrOff();
maxHeat();
maxHeat();
maxHeat();
minHeat();
minHeat();
onOrOff();
System.out.println("Main Ended");
}
public static boolean onOrOff(){
	System.out.println("On or Off method Started ");
	if(isConnected == false){
	 isConnected = true;
	 System.out.println("iron box is On....");
	}
	else if(isConnected == true){
		isConnected = false;
		System.out.println("iron box is off....");
	}
	System.out.println("On or Off Method Ended");
	return isConnected;
}
public static int maxHeat(){
	System.out.println("Maximum heat method Started");
	if(isConnected== true){
		if(currentHeat < maxHeat){
		System.out.println("current heat is less than Max...proceed");	
		currentHeat = currentHeat + 1;
		System.out.println("curren heat is " + currentHeat);
		}
		else{
			System.out.println("Maximum heat reached  ");
		}
	}	
else{
	System.out.println("switch on the iron box first*****");
}	
System.out.println("Maximum heat Method Ended ");
return currentHeat;
	}
public static int minHeat(){
	System.out.println("Maximum Heat Method Started ");
	if(isConnected == true){
		if(currentHeat > minHeat){
	System.out.println("current heat is more than Min.... proceed ");		
			currentHeat = currentHeat - 1;
			System.out.println("current heat is " + currentHeat);
		}
		else{
			System.out.println("Minimum Heat Reached ");
		}
	}
	else{
		System.out.println("Switch on the iron box first*****");
	}
	System.out.println("Minimum Heat Method Ended ");
	return currentHeat;
}
}

