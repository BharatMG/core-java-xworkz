class JeansComparision {
static String brandName = "veirdo";
static int size = 32;
static String faded = "light fade";
static String color = " dark black";
static String idealFor = "men";
static int price = 1499;

public static void main(String jeans[]){

System.out.println("jeans brand name is "+ brandName);
System.out.println("jeans size is "+ size);
System.out.println("faded is "+ faded );
System.out.println("color is "+ color);
System.out.println("ideal for "+ idealFor);
System.out.println("price is "+ price);
System.out.println("RE INITIALIZE THE ABOVE STATIC VARIABLES");
brandName = "roadster";
size = 28;
faded = "";
color = "black";
idealFor = "women";
price = 549;

System.out.println("jeans brand name is "+ brandName);
System.out.println("jeans size is "+ size);
System.out.println("faded is "+ faded );
System.out.println("color is "+ color);
System.out.println("ideal for "+ idealFor);
System.out.println("price is "+ price);
}
}