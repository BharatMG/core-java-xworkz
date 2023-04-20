class CookwareModify{
static String brandName = "prestige";
static String madeOf  = "aluminium" ;
static String coating = "non-stick";
static String color = " dark black";
static String warranty = "1 year";
static int price = 1899;

public static void main(String set[]){

System.out.println(" brand name is "+ brandName);
System.out.println("made of "+ madeOf);
System.out.println("coating is "+ coating );
System.out.println("color is "+ color);
System.out.println("warranty is "+ warranty );
System.out.println("price is "+ price);
System.out.println("RE INITIALIZE THW ABOVE STATIC VARIABLES");

brandName = "butterfly";
madeOf = "aluminium";
coating = "non-stick";
color = "black";
warranty = "1 year";
price = 1049;

System.out.println(" brand name is "+ brandName);
System.out.println("made of "+ madeOf);
System.out.println("coating is "+ coating );
System.out.println("color is "+ color);
System.out.println("warranty is "+ warranty );
System.out.println("price is "+ price);
}
}