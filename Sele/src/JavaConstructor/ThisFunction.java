package JavaConstructor;
//this() call same class constructor
public class ThisFunction {
	 ThisFunction()
	 {
	 this(10);
	  System.out.println("default");
		
	}
	 ThisFunction(int a)
	 {
	 this(20,"akh");
	  System.out.println("1 param constructor");
		
	}
	 ThisFunction(int a,String s)
	 {
		 //this();recursive calling in constructor not allow in java
	
	  System.out.println("2 parm constructor");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		new ThisFunction();
	}

}
