class MoblieShopTester{
public static void main(String[] mobile){
	System.out.println("calling mobile Names ");
	System.out.println("Main method Started");
 MoblieShop.AddMobile("Nokia");
 MoblieShop.AddMobile("Samsung");
 MoblieShop.AddMobile("Apple");
 MoblieShop.AddMobile("Iphone");
 MoblieShop.AddMobile("Blackberry");
 MoblieShop.AddMobile("Micromax");
 MoblieShop.AddMobile("Realme");
 MoblieShop.AddMobile("Redme");
 MoblieShop.AddMobile("Lenovo");
 MoblieShop.AddMobile("motorolla");
 MoblieShop.getMobileNames();
 MoblieShop.updatedMobilName("Micromax", "google pixel");
 MoblieShop.getMobileNames();
	System.out.println("Main method Ended");
}
}