class InverterACcomparision{

static String brandName = "candy";
static String capacity = "1.5 ton";
static String rating = "3 star";
static String color = "white";
static String condenserCoil = "copper";
static String coolingCapacity = "1200 W";
static int price = 31990;

public static void main(String ac[]){

System.out.println("inverter ac brand nameis "+ brandName);
System.out.println("ac capacityis "+ capacity);
System.out.println("rating is "+ rating);
System.out.println("color is "+ color);
System.out.println("condenser coil is "+ condenserCoil);
System.out.println("cooling capacity is "+ coolingCapacity);
System.out.println("price is "+ price);
System.out.println("RE INITIALIZE THE ABOVE STATIC VARIABLES");
brandName = "godrej";
capacity = "1.5 ton";
rating = "5 star";
color = "white";
condenserCoil = "copper";
coolingCapacity = "4900 W";
price = 37490;

System.out.println("inverter ac brand nameis "+ brandName);
System.out.println("ac capacityis "+ capacity);
System.out.println("rating is "+ rating);
System.out.println("color is "+ color);
System.out.println("condenser coil is "+ condenserCoil);
System.out.println("cooling capacity is "+ coolingCapacity);
System.out.println("price is "+ price);
}
}