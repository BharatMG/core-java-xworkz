class ZomatoTester {

public static void main(String zomato[]){
	System.out.println("Main method Started");
		String itemName = "Idli";
		double price = Zomato.searchItem(itemName);
	System.out.println("The price of "+ itemName + "is " + price);	
	
	System.out.println("Main method Ended");
}
}