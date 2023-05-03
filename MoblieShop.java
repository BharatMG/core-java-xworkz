class MoblieShop{
static String mobileNames[]={null,null,null,null,null,null,null,null,null,null};
static int index;
public static boolean AddMobile(String mobileName){
System.out.println("add mobile names Started");
 boolean isAdded = false;
 if(mobileName!=null){
	 mobileNames[index++]=mobileName;
	 isAdded= true;
}
else{
	System.out.println("enter valid mobileName");
}
System.out.println("add mobile names Ended");
return isAdded;
}
public static void getMobileNames(){
	System.out.println("get mobileName method started");
	for(int i=0;i<mobileNames.length;i++){
		System.out.println(mobileNames[i]);
	}
		System.out.println("get mobileName method Ended");
}
public static boolean updatedMobilName(String oldMobileName,String newMobileName){
	System.out.println("updated movie name method started ");
	boolean isUpdated = false;
	for(int i=0;i<mobileNames.length;i++){
	if(mobileNames[i].equals(oldMobileName)){
		mobileNames[i]=newMobileName;
		isUpdated=true;
	}
	}
		System.out.println("updated movie name method ended ");
		return isUpdated;
	}
}
