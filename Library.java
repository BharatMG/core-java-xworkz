class Library{
static String libraryBooks[]={null,null,null,null,null,null,null,null,null,null,null,null,null,
null};
static int index;

public static boolean addLibraryBooks(String libraryBook){
System.out.println("add LibraryBooks method started");
boolean isAdded=false;
if(libraryBook!=null && index<libraryBooks.length){
	libraryBooks[index++]=libraryBook;
	isAdded=true;
}
else{
	System.out.println("maximum....reached");
}
	System.out.println("add LibraryBooks method Ended");
	return isAdded;
}

public static void getLibraryBooks(){
	System.out.println("get LibraryBooks method Started");
	for(int i=0;i<libraryBooks.length; i++){
		System.out.println(libraryBooks[i]);
	}
}
public static boolean updateLibraryBooks(String oldBookName,String updatedBookName){
	System.out.println("updated book name method Started");
	//System.out.println("update library book name is ");
	boolean isUpdated= false;
	for(int i=0;i<libraryBooks.length; i++){
	if(libraryBooks[i].equals(oldBookName)){
		libraryBooks[i]=updatedBookName;
		isUpdated= true;
	}
}
	System.out.println("updated book name method Ended");
	return isUpdated;
}
public static String getBookName(String bookName){
	for(int i=0;i<libraryBooks.length;i++){
	if(libraryBooks[i].equals(bookName)){
	return libraryBooks[i];
	}
}
	return "no book Name found";
	}
}
