class LibraryTester{
public static void main(String []bookName){
	System.out.println("main method Started");
	System.out.println("calling book name is ");
Library.addLibraryBooks("Meditation");
Library.addLibraryBooks("how to win Friends");
Library.addLibraryBooks("paths of fear");
Library.addLibraryBooks("public speaking");
Library.addLibraryBooks("how to sucess");
Library.addLibraryBooks("civilization");
Library.addLibraryBooks("books to read");
Library.addLibraryBooks("the great gatsby");
Library.addLibraryBooks("the richest man");
Library.addLibraryBooks("rich dada poor dad");
Library.addLibraryBooks("three men in boat");
Library.addLibraryBooks("Isro");
Library.addLibraryBooks("animal form");
Library.addLibraryBooks("heart of darkness");
Library.addLibraryBooks("pride of prejudice");
Library.getLibraryBooks();
Library.updateLibraryBooks("three men in boat" , "ponniyin selvan");
Library.getLibraryBooks();
	String isPresent =Library.getBookName("the richest man");
		System.out.println("search book :"+isPresent);
	System.out.println("main method Ended");
}
}