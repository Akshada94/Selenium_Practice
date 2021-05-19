package Practice_Testng;

public class DataProviderClass1 
{
	@org.testng.annotations.DataProvider(name="login")
	public static Object [][] getData()
	{
		return new Object [][]
		{
			{"Pankaj","pass1"},
			{"akshu","ak11"},
			{"harsha","harsh12"}
			
		};
		
	}

	@org.testng.annotations.DataProvider(name="signup")
	public static Object [][] getData2()
	{
		return new Object [][]
		{
			{"Pankaj","pass1"},
			{"akshu","ak11"},
			{"harsha","harsh12"}
			
		};
		
	}
}
