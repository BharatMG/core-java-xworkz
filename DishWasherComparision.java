class DishWasherComparision {

static String brandName = "bosch";
static String color = "white";
static String modelNumber = "SMS66GW01I";
static String waterConsumtion = "9.5 L";
static String controlType = "button";
static int price = 40990;

public static void main(String dishwash[]){

System.out.println("dishwash brand name is " + brandName);
System.out.println(" colur is " + color);
System.out.println("model number is "+ modelNumber);
System.out.println("water consumtion is "+ waterConsumtion);
System.out.println("control type is "+ controlType);
System.out.println(" price is "+ price);

System.out.println("RE INITIALIZE THE ABOVE STATIC VARIABLES");

brandName = "onida";
color = "silver";
modelNumber = "DW12PS";
waterConsumtion = "11 L";
controlType = "button";
price = 24990;

System.out.println("dishwash brand name is " + brandName);
System.out.println(" colur is " + color);
System.out.println("model number is "+ modelNumber);
System.out.println("water consumtion is "+ waterConsumtion);
System.out.println("control type is "+ controlType);
System.out.println(" price is "+ price);

}
}