class HardDiskDrive{

static String brandName = "WD elements";
static String capacity = "1TB" ;
static String type = "HDD";
static String color = " dark black";
static String connectivity = "USB 3.0 & 2.O";
static int price = 4219;

public static void main(String drive[]){

System.out.println(" brand name is "+ brandName);
System.out.println("capacity is "+ capacity);
System.out.println("type is "+ type );
System.out.println("color is "+ color);
System.out.println("connectivity is "+ connectivity );
System.out.println("price is "+ price);
System.out.println("RE INITIALIZE THE ABOVE STATIC VARIABLES");

brandName = "toshiba";
capacity = "1TB";
type = "HDD";
color = "color";
connectivity = "USB 3.2";
price = 3995;

System.out.println(" brand name is "+ brandName);
System.out.println("capacity is "+ capacity);
System.out.println("type is "+ type );
System.out.println("color is "+ color);
System.out.println("connectivity is "+ connectivity );
System.out.println("price is "+ price);
}
}