package OopsConcepts;
//partial implementation go for abstract class
public class AbstractImpleTest extends AbstractTest
{

	public static void main(String[] args) 
	{
		
		AbstractImpleTest a=new AbstractImpleTest();
		a.run();
		a.milage();
		
	}

	@Override
	void run() {

System.out.println("run success");
	}

}
