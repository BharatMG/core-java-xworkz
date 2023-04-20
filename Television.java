class Television{

static String brandName = "onida";
static String soundOutput = "20 W";
static int price = 8000;
static String refreshRate = "60 Hz";
static String screenType = "LED";

public static void main(String a[]){
System.out.println("the Television brand name is " + brandName);
System.out.println("the sound output is "+ soundOutput);
System.out.println("the Television price name is " + price);
System.out.println("refresh rate is "+ refreshRate);
System.out.println("the screen type is "+ screenType);
System.out.println("RE INITIALIZE THE ABOVE STATIC VARIABLES");
brandName = "toshiba";
soundOutput = "20 W";
price = 20499;
refreshRate = "60 Hz";
screenType = "LED";

System.out.println("the Television brand name is " + brandName);
System.out.println("the sound output is "+ soundOutput);
System.out.println("the Television price name is " + price);
System.out.println("refresh rate is "+ refreshRate);
System.out.println("the screen type is "+ screenType);
}
}