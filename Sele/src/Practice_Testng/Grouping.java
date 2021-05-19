package Practice_Testng;

import org.testng.annotations.Test;

public class Grouping
{

	@Test(groups= {"Sanity","Regression"})
	public void Sanity()
	{
		System.out.println("hello sanity");
	}
	@Test(groups= {"Regression"})
	public void Regression()
	{
		System.out.println("hello Regression");
	}
	@Test(groups= {"Smoke"})
	public void Smoke()
	{
		System.out.println("hello Smoke");
	}
	@Test(groups= {"Sanity","Smoke"})
	public void Sanity2()
	{
		System.out.println("hello test4");
	}	
	
}
