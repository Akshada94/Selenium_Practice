package Practice_Testng;

import org.testng.annotations.Test;

public class Priority
{
@Test(priority=4)
public void add()
{
System.out.println("add");	
}

@Test(priority=-1)
public void cdd()
{
System.out.println("cdd");	
}
@Test()
public void bdd()
{
System.out.println("bdd");	
}
}
