class Perfumes{

static String brands[]={ "denver", "shoots", "park avenue", "signature", 
"wild stone", "engage", "sun shine", "vilan", "axis", "dior", "calvin",
"brut","stay with me", "cool & breezy"};

public static void main(String perfume[]){
	System.out.println("Main Started");
	getPerfumeBrands();
	System.out.println("Main Ended");
}
public static void getPerfumeBrands(){	
	System.out.println("list of perfumes names:"+ brands.length);
	for(int i=0;i<brands.length ; i++){
	System.out.println(brands[i]);
}
}
}

