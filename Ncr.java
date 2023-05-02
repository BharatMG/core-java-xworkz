class Ncr{
public static long getFactorial(int number){
long fact = 1;
	for(int i=1;i<= number; i++ ){
	 fact =fact*i;
	}
return fact;
}
}