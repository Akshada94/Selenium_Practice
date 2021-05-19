package JavaConstructor;

public class SuperFunctionChild extends SuperFunction{
public SuperFunctionChild() 
{super(10);//super()used to call superclassconstructor
System.out.println("child class constructor");
}

 


	public static void main(String[] args)
	{
		new SuperFunctionChild();

	}

}
