class Market{

static String shampooBrand[]={ "clinic plus", "dove", "chick", "himalayan", "axe",
"garnier", "avon", "denver", "vatika", "lotus herbal", "sunsilk", 
"park avenue" ,"patanjali", "amway", "loreal"};

static String soapBrands[]={ "life buoy", "santoor", "dove", "himalaya", "pears",
"dettol", "lux", "kesar", "mysore sandal", "medimix", "sinthol", 
"nivea", "kama ayurveda", "khadi organique", "fiama"};

static String groceries[]={ "oil", "sugar", "meat", "peanuts", "toor dal", 
"moong dal", "white chana", "wheat", "rice", "ragi", "millets", "maida",
"orange", "fish", "oats", "barley"};

public static void main(String a[]){
	
	System.out.println("Main Started");
	getShampooBrand();
	getSoapBrands();
	getGroceries();
	System.out.println("Main Ended");
}
public static void getShampooBrand(){
	System.out.println("List of Shampoo brands: "+shampooBrand.length);
	for(int i=0;i<shampooBrand.length;++i){
	System.out.println(shampooBrand[i]);
}
return;
}
public static void getSoapBrands(){
	System.out.println("List of soap brands:"+soapBrands.length);
	for (int j=0;j<soapBrands.length; j++){
	System.out.println(soapBrands[j]);
}
return;
}
public static void getGroceries(){
	System.out.println("List of groceries are:"+groceries.length);
	for(int k=0;k<groceries.length;k++){
	System.out.println(groceries[k]);
}
return;
}
}