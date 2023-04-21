class multiplication{
public static void main(String multion[]){
System.out.println("Main Started");
multiply(23,456);//invoking a method
multiply(24,78);//argument
multiply(345,958);// calling a method
System.out.println("Main Ended");
}
public static void multiply(int a, int b){  // declaration a method, signature of a method
System.out.println("multiplication Started");
System.out.println(a*b);
System.out.println("multiplication Ended");
return;
}
}