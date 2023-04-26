class MultiplicationTester{
public static void main(String []mul){
System.out.println("Main method Started");
int mulTwoNumbers = Multiplication.getMultiplication(12,9);
int mulThreeNumbers = Multiplication.getMultiplication(12,9,8);
System.out.println("Multiplication of two numbers is "+ mulTwoNumbers);
System.out.println("Multiplication of three numbers is "+ mulThreeNumbers);
System.out.println("Main method Ended");
}
}