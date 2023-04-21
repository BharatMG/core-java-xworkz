class Refrigerator{
static boolean isConnected;
static String BrandName = "LG";
static int price = 16990;
static int maxDegree = 7;
static int minDegree ;
static int currentDegree;

public static void main(String frize[]){
	System.out.println("Main Started ");
	onOrOff();
	maxDegree();
	maxDegree();
	maxDegree();
	minDegree();
	minDegree();
	onOrOff();
	maxDegree();
	System.out.println("Main Ended");
}

public static boolean onOrOff(){
	System.out.println("On or Off method started*** ");
	if(isConnected == false){
	 isConnected = true ;
	 System.out.println("Refrigerator is On............");
	}
else if(isConnected == true){
	isConnected = false;
	System.out.println("Refrigerator is Off............");
}
else{
	System.out.println("Switch on the Refrigerator first ..");
}
	System.out.println("On or Off Method Ended*** ");
	return isConnected;
}
public static int maxDegree(){
	System.out.println("Maximum degree method Started");
	if(isConnected == true){
		if(currentDegree < maxDegree){
		System.out.println("current Degree is less than max... proceed");
			currentDegree = currentDegree + 1;
		System.out.println("current degree is  "+ currentDegree);
		}
		else{
			System.out.println("Maximum degree is reached ");
		}
	}
	else{
		System.out.println("Switch on Refrigerator first,*,*,*,");
	}
		System.out.println("Maximum degree method ended ..");
		return currentDegree;
	}
public static int minDegree(){
	System.out.println("Minimum method Started");
	if(isConnected == true){
		if( currentDegree > minDegree){
		System.out.println("current degree is more than min.. proceed");
			currentDegree = currentDegree - 1;
		System.out.println("current degree is : "+ currentDegree);	
		}
		else{
			System.out.println("Minimum degree is reached ");
		}
	}
	else{
		System.out.println("Switch on the Refrigerator first ,*,*,*,");
	}
	System.out.println("Minimum Method Ended");
	return currentDegree;
	}
}	

