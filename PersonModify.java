class PersonModify{

/*static String personName = "bharat";
static int age = 28;
static long phoneNumber = 8553366463l;
static boolean isAlive = true;
static char gender = 'M';
static String qualification = "BE";*/


public static void main(String persion[]){

String personName = "bharat";
int age = 28;
long phoneNumber = 8553366463l;
boolean isAlive = true;
char gender = 'M';
String qualification = "BE";

System.out.println("persion name is "+ personName);
System.out.println(" age is "+ age);
System.out.println(" phone number is "+ phoneNumber);
System.out.println(" is alive "+ isAlive);

System.out.println(" gender is "+ gender);
System.out.println("qualification is "+ qualification);



System.out.println(" re initialization of above mentioned static variables");
personName = "abhishree";
age = 5;
phoneNumber = 1234562346l;
isAlive = true;
gender = 'F';
qualification = "LKG";

System.out.println("persion name is "+ personName);
System.out.println(" age is "+ age);
System.out.println(" phone number is "+ phoneNumber);
System.out.println(" is alive "+ isAlive);

System.out.println(" gender is "+ gender);
System.out.println("qualification is "+ qualification);

}
}