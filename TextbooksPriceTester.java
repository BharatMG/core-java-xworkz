class TextbooksPriceTester{

public static void main(String book[]){
	System.out.println("Main Method Started");
	String bookName = "Mathematics";
	double score = Textbooks.subjectBooks(bookName);
	System.out.println("the score of "+ bookName + " is " + score);
	System.out.println("Main Method Ended");
}
}