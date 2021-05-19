package Practice_Testng;

import org.testng.annotations.Test;

public class EnableDisable
{
@Test(enabled=false)
public void Test1()
{
	System.out.println("hello test1");
}
@Test(enabled=true)
public void Test2()
{
	System.out.println("hello test2");
}
@Test(enabled=true)
public void Test3()
{
	System.out.println("hello test3");
}
}
