class TheatreTester{
public static void main(String []movie){
	System.out.println("main method Started");
	System.out.println("calling movie names: ");
	Theatre1.getMovieNames();
	Theatre1.AddMovies("Ragevendra Stores");
	Theatre1.AddMovies("Kgf");
	Theatre1.AddMovies("Kgf2");
	Theatre1.AddMovies("PS2");
	Theatre1.AddMovies("Avatar");
	Theatre1.AddMovies("Hondisi baryeri");
	Theatre1.AddMovies("SHIVAJI SURATKAL-2");
	Theatre1.AddMovies("John wick");
	Theatre1.AddMovies("Sisu");
	Theatre1.AddMovies("Gandhada gudi");
	Theatre1.AddMovies("Paramatma");
	Theatre1.getMovieNames();
//System.out.println("movie name is" +Theatre1.getMovieNames("Kgf2"));
	Theatre1.updatedMovieName("Avatar", "james");
	Theatre1.getMovieNames();
	String isMovie=Theatre1.getMovieName("SHIVAJI SURATKAL-2");
	System.out.println("Searching movie is" +isMovie);
	System.out.println("main method Ended");
}
}