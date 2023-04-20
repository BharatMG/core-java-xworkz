class LaptopComparision{

static String brandName = "lenovo";
static String processorBrand = "intel" ;
static String processorName = "core i5";
static String color = " dark black";
static String ramType = "ddr4";
static int price = 55999;

public static void main(String laptop[]){
System.out.println("laptop brand name is "+ brandName);
System.out.println("processor brand is "+ processorBrand);
System.out.println("processor name is "+ processorName );
System.out.println("color is "+ color);
System.out.println("ram type is "+ ramType );
System.out.println("price is "+ price);
System.out.println("RE INITIALIZING THE ABOVE STATIC VARIABLES");

brandName = "asus";
processorBrand = "intel";
processorName = "core i5";
color = "black plastic";
ramType = "ddr4";
price = 51990;

System.out.println("laptop brand name is "+ brandName);
System.out.println("processor brand is "+ processorBrand);
System.out.println("processor name is "+ processorName );
System.out.println("color is "+ color);
System.out.println("ram type is "+ ramType );
System.out.println("price is "+ price);
}
}