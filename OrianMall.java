class OrianMall{
static String orianMallBrandNames[]={null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null};
static int index;

public static boolean addBrands(String brandName){
	System.out.println("add brand name method started ");
	boolean isAdded= false;
		if(brandName!=null && index<orianMallBrandNames.length){
			orianMallBrandNames[index++]=brandName;
			isAdded=true;
	}
	else{
		System.out.println("brand name is invalid");
	}
	System.out.println("add brand Name method ended");
	return isAdded;
}
public static void getBrandNames(){
	System.out.println("get brandName method started");
	for(int i=0;i<orianMallBrandNames.length; i++){
		System.out.println(orianMallBrandNames[i]);
	}
	}
public static boolean updateBrandName(String oldBrandNames, String updatedBrandName){
	System.out.println("updated brand name is ");
	boolean isUpdated=false;
	for(int i=0;i<orianMallBrandNames.length; i++){
		if(orianMallBrandNames[i].equals(oldBrandNames)){
			orianMallBrandNames[i]=updatedBrandName;
			isUpdated=true;		
		}
	}
	System.out.println("update brand method ended");
	return isUpdated;
}	
public static String getBrandName(String brandName){
	for(int i=0;i<orianMallBrandNames.length;i++){
	if(orianMallBrandNames[i].equals(brandName)){
	return orianMallBrandNames[i];
	}
}
	return "no brand Name found";
	}
}