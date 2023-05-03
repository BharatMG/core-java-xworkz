class RestorentTester{
public static void main(String[] food){
		System.out.println("main method started");
		Restorent.addItems("masala dosa");
		Restorent.addItems("idly ");
		Restorent.addItems("vada");
		Restorent.addItems("poori");
		Restorent.addItems("gobi mancuri");
		Restorent.addItems("gud bud");
		Restorent.addItems("faludha");
		Restorent.addItems("roti");
		Restorent.addItems("veg beriany");
		Restorent.addItems("fried rice");
		Restorent.addItems("curd rice");
		Restorent.addItems("north indian meals");
		Restorent.addItems("south indian meals");
		Restorent.addItems("lemon rice");
		Restorent.addItems("mango milk shake");
		Restorent.getItems();
		Restorent.updateItems("poori","upma");
		Restorent.getItems();
		String isAvailable=Restorent.getItem("fried rice");
		System.out.println("the food is "+isAvailable);
		System.out.println("main method ended");
	}
}