class SwiggyQuantityTester{
public static void main(String []swiggy){
	System.out.println("Main method Started");
	String foodName = "Kaju Roll";
	double priceQuantity = SwiggyQuantity.searchFood(foodName,4);
	System.out.println("The price of "+ foodName + "is "+ priceQuantity);
	System.out.println("Main method Ended");
}
}