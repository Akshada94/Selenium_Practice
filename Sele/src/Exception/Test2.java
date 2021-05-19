package Exception;

public class Test2 {
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
		finally//db connection close/file close using finally block/whetehe exception occur or not it always execute
		{
			System.out.println("this is execute always");
			System.exit(0);//using for stop finally block
			
		}
		System.out.println("End.........");
	}


}
