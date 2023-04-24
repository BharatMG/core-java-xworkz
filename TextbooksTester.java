class TextbooksTester{

public static void main(String book[]){
	System.out.println("Main Method Started");
	String bookName = "Science";
	double score = Textbooks.subjectBooks(bookName);
	System.out.println("the score of "+ bookName + " is " + score);
	
	System.out.println("Main Method Ended");
}

}