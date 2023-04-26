class ZomatoQuantityTester{
	public static void main(String zomato[]){
	System.out.println("Main methid started");
		String itemName = "Idli";
	double price = ZomatoQuantity.searchItem(itemName);
		double pricewithQuantity= ZomatoQuantity.searchItem(itemName, 5);
	System.out.println("the price of "+ itemName + "is "+ pricewithQuantity);	
		System.out.println("Main method Ended");
	}

}