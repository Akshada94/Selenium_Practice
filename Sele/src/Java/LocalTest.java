package Java;




public class LocalTest
{
    static int c=30;//static/class level variable
    int d=40;//instance variable/nonstatic
	static void method1()
	{
		int a=20;//local variable
		System.out.println(a);
		System.out.println(c);
		
		
		LocalTest l=new LocalTest();
		System.out.println(l.d);
		//System.out.println(d);//not allowded
	}
	
  void method2()
	{
		int a=20;//local variable
		System.out.println(a);
		System.out.println(c);
		System.out.println(d);
	}
  
  
	public static void main(String[] args) {
		//System.out.println(c);

		LocalTest l=new LocalTest();
		System.out.println(l.d);
//System.out.println(a);
	//	System.out.println(d);
	}

}
