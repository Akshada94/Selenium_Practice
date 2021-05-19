package Practice_Testng;

import org.testng.annotations.Test;

public class DependsOn
{
@Test
public void Test1()
{
	System.out.println("hello test1");
}
@Test(dependsOnMethods= {"Test1"})
public void Test2()
{
	System.out.println("hello test2");
}
@Test
public void Test3()
{
	System.out.println("hello test3");
}
@Test(dependsOnMethods= {"Test3"})
public void Test4()
{
	System.out.println("hello test4");
}
}
