class FlipkartQuantityTester{

public static void main(String []flipkart){
System.out.println("Main method started");
String productName = "U.S. POLO ASSN";
//System.out.println("the price is "+ productName);
double priceQuantity = FlipkartQuantity.searchProduct(productName, 6);
System.out.println("The price is "+ productName + "is "+ priceQuantity);
System.out.println("Main method Ended");
}
}