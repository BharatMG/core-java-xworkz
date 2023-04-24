class Flipkart8Tester
{
	public static void main(String []cart)
	{
		System.out.println("main starts");
		String itemName="fan";
		double prize=Flipkart8.searchItem(itemName);
		System.out.println("prize of the item  "+itemName+"  is  "+prize);
		System.out.println("main ends");
	}
}
