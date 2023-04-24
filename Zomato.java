class Zomato{

public static double searchItem(String itemName){
	System.out.println("Searching method Started ");

	if("Masala Dose"== itemName){
	System.out.println("Thanks for selecting "+ itemName);
	return 60.00;
	}

	if("veg biryani" == itemName){
	System.out.println("thanks for selecting "+ itemName);
	return 130.00;
	}

	if("Idli"== itemName){
	System.out.println("Thanks for selecting "+ itemName);
	return 45.00;
	}
	
	if("Tandoori chicken" == itemName){
	System.out.println("Thanks for selecting "+ itemName);
	return 170.00;
	}
	
	if("mutton Biryani "== itemName){
	System.out.println("Thanks for selecting "+ itemName);
	return 230.00;
	}
	if("Shawarma "== itemName){
	System.out.println("Thanks for selecting "+ itemName);
	return 70.00;
	}
	if("Roti sabzi"== itemName){
	System.out.println("Thanks for selecting "+ itemName);
	return 75.00;
	}
	if("palav "== itemName){
	System.out.println("Thanks for selecting "+ itemName);
	return 40.00;
	}
	if("chapati curry "== itemName){
	System.out.println("Thanks for selecting "+ itemName);
	return 80.00;
	}
	System.out.println("Searching method Ended ");
	return 0.00;
}

}