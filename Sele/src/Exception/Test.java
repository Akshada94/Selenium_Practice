package Exception;

public class Test {

	public static void main(String[] args)
	{
		System.out.println("Start 1.........");
		System.out.println("Start 2.........");
		try
		{
		int a=20/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("End.........");
	}

}
