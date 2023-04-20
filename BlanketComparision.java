class BlanketComparision{

static String modelName = "mink";
static String outerMaterial = "micro fiber";
static String idealUsage = "mild water";
static String color = "purple";
static int price = 697;

public static void main(String blanket[]){

System.out.println("blanket model name is "+ modelName);
System.out.println("outer material name is "+ outerMaterial);
System.out.println("ideal usage is "+ idealUsage);
System.out.println("color is "+ color);
System.out.println("price is "+ price);
System.out.println("  RE INITIALIZING THE ABOVE STATIC VARIABLES");
modelName = "Double Jaipuri Razai";
outerMaterial = "micro fiber";
idealUsage = "heavy winter";
color = "red";
price = 499;

System.out.println("blanket model name is "+ modelName);
System.out.println("outer material name is "+ outerMaterial);
System.out.println("ideal usage is "+ idealUsage);
System.out.println("color is "+ color);
System.out.println("price is "+ price);
}
}