class OrianMallTester{
public static void main(String []brands){
	System.out.println("Main method Started");
System.out.println("calling brand name is ");
OrianMall.addBrands("Allen Solly");
OrianMall.addBrands("PVR");
OrianMall.addBrands("Hamley's");
OrianMall.addBrands("Zara");
OrianMall.addBrands("tascano");
OrianMall.addBrands("Starbucks");
OrianMall.addBrands("imagine");
OrianMall.addBrands("Empire restorent");
OrianMall.addBrands("manyavar");
OrianMall.addBrands("fossile exclusive");
OrianMall.addBrands("land mark");
OrianMall.addBrands("phoenix");
OrianMall.addBrands("Marketcity Mall");
OrianMall.addBrands("GAP");
OrianMall.addBrands("West side");
OrianMall.getBrandNames();
OrianMall.updateBrandName("West side", "Funky Monkeys play store");
OrianMall.getBrandNames();
	String isBrandName=OrianMall.getBrandName("imagine");
	System.out.println("the searching brand is "+isBrandName );
	System.out.println("Main method Ended");
}
}