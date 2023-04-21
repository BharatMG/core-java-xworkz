class College{

	static String departmentName[]={ "ECE", "EEE", "CSE", "ME", "Civil", "ISE", "textile",
"automobile", "aerospace", "chemical", "solar", "nanotechnology", 
"environmental", "machine learning"};

public static void main(String dept[]){
	System.out.println("Main Started");
	getbranches();
	System.out.println("Main Ended");
	}
	
public static void getbranches(){
	System.out.println("list of college Department names:"+ departmentName.length );

	for(int i=0;i<departmentName.length ; i++){
	System.out.println(departmentName[i]);
	}
	return;
}

}