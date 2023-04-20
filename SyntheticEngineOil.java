class SyntheticEngineOil{

static String brandName = "castrol";
static String quantity = "3L";
static String suitableFor = "petroil diesel engines";
static double weight = 2.8;
static int price =1604;

public static void main(String oil[])  {

System.out.println("synthetic engine oil brand name "+ brandName);
System.out.println("quantity is "+ quantity);
System.out.println("oil suitable for "+ suitableFor);
System.out.println("weight is "+ weight);
System.out.println("price is "+ price);
System.out.println("RE INITIALIZE THE ABOVE STATIC VARIABLES");
brandName = "motul";
quantity = "1 L";
suitableFor = "4 stroke engines";
weight = 1;
price = 729;

System.out.println("synthetic engine oil brand name "+ brandName);
System.out.println("quantity is "+ quantity);
System.out.println("oil suitable for "+ suitableFor);
System.out.println("weight is "+ weight);
System.out.println("price is "+ price);
}
}