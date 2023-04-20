class WiredGamepad{
static String brandName = "RPM euro";
static String connectivity = "USB" ;
static String operatingRange = "1.8m";
static String salesPackage = "1 conroller ,1 cd ";
static int price = 699;

public static void main(String gamepad[]){

System.out.println(" brand name is "+ brandName);
System.out.println("connectivity is  "+ connectivity);
System.out.println("operating range is "+ operatingRange );
System.out.println("sales package is "+ salesPackage );
System.out.println("price is "+ price);
System.out.println("RE INITIALIZE THE ABOVE STATIC VARIABLES");

brandName = "F-FERONS ";
connectivity = "bluetooth";
operatingRange = "10 m";
salesPackage = "1 BLUETOOTH SPEAKER, 1 CHARGING CABLE";
price = 399;


System.out.println(" brand name is "+ brandName);
System.out.println("connectivity is  "+ connectivity);
System.out.println("operating range is "+ operatingRange );
System.out.println("sales package is "+ salesPackage );
System.out.println("price is "+ price);


}
}