package Practice_Testng;

import org.testng.annotations.Test;

public class DataProvider 
{
	@Test(dataProvider = "login")
	void loginTest(String user,String pass)
	{
		System.out.println("Start Testing");
		System.out.println(user+"-----"+pass);
		System.out.println("End Testing");
	}
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
}
