class Hospital{

	static String doctorName[]={ "Paramedic", "Psychologist","Nurse","ENT doctor",
"Pharmacist","Consulting doctor","Attending doctor", "surgeon", "Duty doctor",
"Family doctor","Veterinarian", "Dentist"};

public static void main(String doctor[]){
	System.out.println("Main Started");
	myDoctorNames();
	System.out.println("Main Ended");

	}
public static void myDoctorNames(){	
	System.out.println("list of doctor names:"+ doctorName.length);
	for(int i=0;i<doctorName.length ; i++){
	System.out.println(doctorName[i]);
}
return;
}
}

