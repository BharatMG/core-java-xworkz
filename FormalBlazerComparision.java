class FormalBlazerComparision {

static String brandName = "Raymond";
static String idealFor = "men";
static String color = "dark blue";
static String fabric = "polystester";
static String type = "single breasted";
static int price = 3359;

public static void main(String blazer[]){

System.out.println("blazer brand name is "+ brandName);
System.out.println("ideal for "+ idealFor);
System.out.println("color is "+ color);
System.out.println("fabric is "+ fabric);
System.out.println("type is "+ type);
System.out.println("price is "+ price);
System.out.println("RE INITIALIZE THE ABOVE STATIC VARIABLES");

brandName = "peter england";
idealFor = "men";
color = "red";
fabric = "polyester";
type = "single breasted";
price = 1999;

System.out.println("blazer brand name is "+ brandName);
System.out.println("ideal for "+ idealFor);
System.out.println("color is "+ color);
System.out.println("fabric is "+ fabric);
System.out.println("type is "+ type);
System.out.println("price is "+ price);


}
}