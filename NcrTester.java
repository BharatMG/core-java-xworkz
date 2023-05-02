class NcrTester{
public static void main(String []comb){
System.out.println("Main method Started");
long ncrValue=Ncr.getFactorial(6)/(Ncr.getFactorial(4)*Ncr.getFactorial(6-4));
System.out.println("Ncr value is ");
System.out.println(ncrValue);
System.out.println("Main method Ended");
}
}