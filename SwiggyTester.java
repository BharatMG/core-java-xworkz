class SwiggyTester{

public static void main(String swiggy[]){
	System.out.println("Main method Started");
String foodName = "chicken Steam Momo " ;
	double price = Swiggy.searchFood( foodName );
System.out.println("The price of "+ foodName + "is "+ price);
	
	System.out.println("Main method Ended");

}

}