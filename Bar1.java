class Bar1{

static String alcohol[]={ "IB", "Black & White", "Old Monk", "100 papers", 
"Teacher's", "Tuborg", "Royal Stag", "Signature"};

public static void main(String s[]){
System.out.println("Main Started");
getBarBrands();
System.out.println("Main Ended");
}
public static void getBarBrands(){
System.out.println("List of alcohol brands"+ alcohol.length);
for(int i=0;i<alcohol.length;i++){
System.out.println(alcohol[i]);
}
return  ;
}
}