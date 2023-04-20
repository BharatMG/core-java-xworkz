class HandWashComparision{
static String brandName = "lifebuoy";
static String type = "refile pouch" ;
static String idealFor = "men & women";
static String quantity = "1500ml";
static int price = 199;

public static void main(String wash[]){

System.out.println(" brand name is "+ brandName);
System.out.println("type is  "+ type);
System.out.println("ideal for "+ idealFor );
System.out.println("quantity is "+ quantity );
System.out.println("price is "+ price);
System.out.println("RE INITIALIZE THE ABOVE STATIC VARIABLES");
brandName = "dettol";
type = "pouch";
idealFor = "men & women";
quantity = "1500ml";
price = 171;

System.out.println(" brand name is "+ brandName);
System.out.println("type is  "+ type);
System.out.println("ideal for "+ idealFor );
System.out.println("quantity is "+ quantity );
System.out.println("price is "+ price);
}
}