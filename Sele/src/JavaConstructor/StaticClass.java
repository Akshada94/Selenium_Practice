package JavaConstructor;

public class StaticClass {
	{
		System.out.println("non static block");//execute n no.of time
	}
	static {
		System.out.println("Static Block");//execute only once at the time of class load jvm execute static block 1st.memory locate once nd only one copy of mem.
	}
public static void main(String[] args) {
	new StaticClass();
	//new StaticClass();//no.of object created that time execute 
	new StaticClass();
}
}
