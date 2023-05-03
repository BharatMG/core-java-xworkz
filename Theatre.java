class Theatre{
static String movieNames[]={null,null,null,null,null,null,
null,null,null,null};
static int index;

public static boolean AddMovies(String movieName){
System.out.println("movie name method started");
boolean isAdded= false;
if(movieName != null){
	movieNames[index++]=movieName;
	isAdded= true;
}
else{	System.out.println("name is invalid");
}	
System.out.println("movie name method started");
return isAdded;	
}
public static void getMovieNames(){
	System.out.println("get movieName method Started");
	System.out.println("List of movie names are :");
	for(int i=0;i<movieNames.length; i++){
		System.out.println(movieNames[i]);
}
	System.out.println("get movieName method Ended");
	}
public static boolean updatedMovieName(String oldMovieName, String newMovieName){
	System.out.println("updated MovieName method started");
	boolean isUpdated = false;
	for(int i=0;i<movieNames.length;i++){
		if(movieNames[i].equals(oldMovieName)){
			movieNames[i]=newMovieName;
			isUpdated=true;
		}
	}
	System.out.println("updated MovieName method ended");
	return isUpdated;
}
}
