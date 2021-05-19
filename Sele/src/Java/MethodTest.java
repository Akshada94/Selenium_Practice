package Java;

public class MethodTest {
	//method declaration
	void login() 
	{
		System.out.println("login success");
	}

	
	//static method
	static void login1() 
	{
		System.out.println("login1 success");
	}
	
	static int add()
	{ 
		int b=20;
		//String c="akshu";
		return b;
	//	return c;
	}
	static String add1()
	{ 
		//int b=20;
		String c="akshu";
		//return b;
		return c;
	}
	public static void main(String[] args) {

MethodTest m=new MethodTest();
//m.login();
//login1();
	//m.add();
	//System.out.println("return value is"+m.add());
System.out.println(add());
	System.out.println(add1() );
	}

}
