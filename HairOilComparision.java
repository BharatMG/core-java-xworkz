class HairOilComparision {
static String brandName = "BAJAJ";
static String modelName = "Almondoil";
static String quantity = "650 ml";
static String appliedFor = "hair strenthening";
static String maximumShelfLife = "36 months";
static int price = 313;

public static void main(String oil[]){

System.out.println("hair oil brand name is "+ brandName);
System.out.println("model name is "+ modelName);
System.out.println("quantity is "+ quantity);
System.out.println("applied for "+ appliedFor);
System.out.println("maximum shelf life is "+ maximumShelfLife);
System.out.println(" price is "+ price); 
System.out.println("RE INITIALIZE THE ABOVE STATIC VARIABLES");

brandName = "indulekha";
modelName = "bhringa";
quantity = "100ml";
appliedFor = "hair strenthening";
maximumShelfLife = "24 months";
price = 332;

System.out.println("hair oil brand name is "+ brandName);
System.out.println("model name is "+ modelName);
System.out.println("quantity is "+ quantity);
System.out.println("applied for "+ appliedFor);
System.out.println("maximum shelf life is "+ maximumShelfLife);
System.out.println(" price is "+ price); 
}
}