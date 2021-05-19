package JavaConstructor;

public class DefaultConstructor 
{
	int a;
	public DefaultConstructor(int num)//jvm provide internally one construtor called default constructor
	{
		//a=10;
		//System.out.println("default constructor");
		a=num;
	}
	
	

	public static void main(String[] args) {
		DefaultConstructor d=new DefaultConstructor(10);
		System.out.println(d.a);
	}

}
