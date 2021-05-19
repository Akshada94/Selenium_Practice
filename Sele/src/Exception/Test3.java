package Exception;

import net.bytebuddy.implementation.bytecode.Throw;

public class Test3
{
static void validateAge(int Age) throws Exception//throws use declare thise method to throwing this exce.please handle it
{
	if(Age>18)
	{
		
		System.out.println("Elligible for Vote");
	}
	else
	{
		System.out.println("Not Elligible for Vote");
		throw new Exception();//stop the execution further not exectute voted succesfully

	}
	System.out.println("Voted Succesfully");
}

	public static void main(String[] args) throws Exception //temp.throwing exception//passing 1 method 2 another method called exception propagation 
	{
		validateAge(12);
 
	}

}
