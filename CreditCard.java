class CreditCard{

public static void main(String card[]){
	String creditCards[]={ "SBI creditcard", "axis", "flipkart axis", 
	"amazon pay icici", "hdfc", "canara", "icici", "bajaj", "kotak mahendra",
	"corporation", "american express", "bank of america", "standard charted",
	"karnataka bank", "maharastra bank"};
	
	System.out.println("Main Started");
	getCreditCards(creditCards);
	System.out.println("Main Ended");
}

public static void getCreditCards(String creditCards[] ){

	System.out.println("list of Credit card names:"+ creditCards.length );
	for(int i=0;i<creditCards.length ; i++){
	System.out.println(creditCards[i]);
}
return;
}
}