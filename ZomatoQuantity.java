class ZomatoQuantity{

public static double searchItem(String itemName){
	double price = 0.00;
	System.out.println("Searching method Started ");

	if("Masala Dose"== itemName){
	System.out.println("Thanks for selecting "+ itemName);
	price = 60.00;
	}
	if("veg biryani" == itemName){
	System.out.println("thanks for selecting "+ itemName);
	price =130.00;
	}
	if("Idli"== itemName){
	System.out.println("Thanks for selecting "+ itemName);
	price =45.00;
	}	
	if("Tandoori chicken" == itemName){
	System.out.println("Thanks for selecting "+ itemName);
	price =170.00;
	}	
	if("mutton Biryani "== itemName){
	System.out.println("Thanks for selecting "+ itemName);
	price =230.00;
	}
	if("Shawarma "== itemName){
	System.out.println("Thanks for selecting "+ itemName);
	price =70.00;
	}
	if("Roti sabzi"== itemName){
	System.out.println("Thanks for selecting "+ itemName);
	price =75.00;
	}
	if("palav "== itemName){
	System.out.println("Thanks for selecting "+ itemName);
	price =40.00;
	}
	if("chapati curry "== itemName){
	System.out.println("Thanks for selecting "+ itemName);
	price =80.00;
	}
	System.out.println("Searching method Ended ");
	return price;
}
	public static double searchItem(String itemName, int quantity){
	double price = 0.00;
	System.out.println("main method started");
	if("Masala Dose"== itemName){
	System.out.println("Thanks for selecting "+ itemName);
	price = 60.00* quantity;
	}
	if("veg biryani"== itemName){
	System.out.println("thanks for selecting "+ itemName);
	price = 130.0 * quantity;
	}
		if("Idli"== itemName){
	System.out.println("Thanks for selecting "+ itemName);
	price =45.00* quantity;
	}	
	if("Tandoori chicken" == itemName){
	System.out.println("Thanks for selecting "+ itemName);
	price =170.00* quantity;
	}	
	if("mutton Biryani "== itemName){
	System.out.println("Thanks for selecting "+ itemName);
	price =230.00* quantity;
	}
	if("Shawarma "== itemName){
	System.out.println("Thanks for selecting "+ itemName);
	price =70.00* quantity;
	}
	if("Roti sabzi"== itemName){
	System.out.println("Thanks for selecting "+ itemName);
	price =75.00* quantity;
	}
	if("palav "== itemName){
	System.out.println("Thanks for selecting "+ itemName);
	price =40.00*quantity;
	}
	if("chapati curry "== itemName){
	System.out.println("Thanks for selecting "+ itemName);
	price =80.00* quantity;
}
return price;
}
}