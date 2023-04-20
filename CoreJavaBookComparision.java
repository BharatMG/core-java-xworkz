class CoreJavaBookComparision{
static String bookName = "core java :made simple";
static String publications = "BPB publications";
static String authorName = "som prakhas rai";
static int pages = 586;
static int price = 654;
static String language = "english";

public static void main(String book[]){

System.out.println("name of book is "+ bookName);
System.out.println("name of publications "+ publications);
System.out.println("author name is "+ authorName);
System.out.println("number of pages is "+ pages);
System.out.println("price is "+ price);
System.out.println("RE INITIALIZE THE ABOVE STATIC VARIABLES");

bookName = "Continuous Delivery in Java";
publications = " Shroff/O'Reilly";
authorName = "Daniel Bryant ";
language = "english" ;
price = 1300;

System.out.println("name of book is "+ bookName);
System.out.println("name of publications "+ publications);
System.out.println("author name is "+ authorName);
System.out.println("language is "+ language);
System.out.println("price is "+ price);
}
}