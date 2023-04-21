class OttMethod{

static String hotStarMovies[]={ "RRR", "Alone", "run babe run", "night manager", "tiny beautiful things",
"formula unplugged", "chhichhore", "baagi3", "tanhaj", "brahmastra",};

static String netflixMovies[]={ "vedha", "Gandhada gudi", "writer padmabhushan", "head bush",
"the great indian kitchen", "taj", "guru shishyaru", "remo", "thothapuri",
"mansoon raga", "vikranth rona", "galipata2"};

public static void main(String ott[]){
	
System.out.println("Main started");
 getHotStarMovies();
 getnetflixMovies();
System.out.println("Main ended");
}
public static void getHotStarMovies(){
	System.out.println("calling kannada method");
	System.out.println("list of kannada movies");
	for(int i=0;i<hotStarMovies.length;i++){
	System.out.println(hotStarMovies[i]);
}
return;
}
public static void getnetflixMovies(){
System.out.println("calling netflix movies");
System.out.println("list of netflix movies");
for(int j=0;j<netflixMovies.length;j++){
System.out.println(netflixMovies[j]);
}
return;
}
}