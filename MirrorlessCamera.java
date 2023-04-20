class MirrorlessCamera{
static String brandName = "Sony";
static String modelNumber = "ZV-E10L";
static String modelName = "alpha";
static String color = "black";
static String sensorType = "CMOS";
static int price = 61490;

public static void main(String camera[]){
System.out.println("camera brand name is "+ brandName);
System.out.println("model number is "+ modelNumber);
System.out.println("model name is "+ modelName);
System.out.println("color is "+ color);
System.out.println("sensor type is "+ sensorType);
System.out.println(" price is "+ price);
System.out.println("RE INITIALIZE THE ABOVE STATIC VARIABLES");

brandName = "canon";
modelNumber = "R50";
modelName = "EOs R50";
color = "white";
sensorType = "CMOS";
price = 74990;

System.out.println("camera brand name is "+ brandName);
System.out.println("model number is "+ modelNumber);
System.out.println("model name is "+ modelName);
System.out.println("color is "+ color);
System.out.println("sensor type is "+ sensorType);
System.out.println(" price is "+ price);
}
}