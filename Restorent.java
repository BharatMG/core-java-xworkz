class Restorent{
	static String menu[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	
public static boolean addItems(String foodName){
		System.out.println("add items method started ");
		boolean isAdded=false;
		if(menu!=null){
			menu[index++]=foodName;
			isAdded=true;
			System.out.println("food name is found"+foodName);
		}
		else{
			System.out.println("food name not found"+foodName);
		}
		System.out.println("add items method ended");
		return isAdded;
}
public static void getItems(){
		System.out.println("get items method started");
		for(int i=0;i<menu.length;i++){
			System.out.println(menu[i]);
		}
		System.out.println("----get items method ended");
}
public static boolean updateItems(String oldFoodName,String updateFoodName){
		System.out.println("-----update tiem method started-----");
		boolean isUpdate=false;
		for(int i=0;i<menu.length;i++){
			if(menu[i]==oldFoodName)
			menu[i]=updateFoodName;
	}
		System.out.println("----update food name method ended----");
		return isUpdate;
}
}