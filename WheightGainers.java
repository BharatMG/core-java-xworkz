class WheightGainers {
static String brandName = "kobra labs";
static String form = "powder";
static String foodType = "vegitarian";
static String usage = "Pre-workout & Post-workout";
static String dietaryPreference = "Gluten Free, No Artificial Color Flavor & Cholesterol";
static int price = 500;

public static void main(String gym[]){

System.out.println("wheight gainers brand name is "+ brandName);
System.out.println(" form is "+ form);
System.out.println("food type is "+ foodType);
System.out.println("usage is "+ usage);
System.out.println(" dietry prefarence is "+ dietaryPreference);
System.out.println("price is "+ price);
System.out.println(" RE INITIALIZE THE ABOVE STATIC VARIABLES");

brandName = "dynamic nutrition";
form = "powder";
foodType = "vegitarian";
usage = "Pre-workout & Post-workout";
dietaryPreference = "gluten free";
price = 2372;

System.out.println("wheight gainers brand name is "+ brandName);
System.out.println(" form is "+ form);
System.out.println("food type is "+ foodType);
System.out.println("usage is "+ usage);
System.out.println(" dietry prefarence is "+ dietaryPreference);
System.out.println("price is "+ price);
}
}