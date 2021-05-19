package Practice_Testng;

import org.testng.annotations.Test;

public class DataProviderTest 
{
	@Test(dataProvider = "login",dataProviderClass=DataProviderClass1.class)
	void loginTest(String user,String pass)
	{
		System.out.println("Start Testing");
		System.out.println(user+"-----"+pass);
		System.out.println("End Testing");
	}
}
