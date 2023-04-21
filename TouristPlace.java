class TouristPlace{

static String tourist[]={"manali", "chikkamagaluru", "bengaluru", "hubli", "kemmanagundi",
"horanadu", "beluru", "halebidu", "pattadakallu", "banavasi", "sirasi", 
"murdeshwara", "goa"};

public static void main(String tour[]){
	System.out.println("Main started");
	getTouristPlaces();
	System.out.println("main Ended");
}
public static void getTouristPlaces(){

	System.out.println("tourist places:"+ tourist.length);
	for(int i=0; i<tourist.length; i++){
	System.out.println(tourist[i]);
}
}
}