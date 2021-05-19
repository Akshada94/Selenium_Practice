package JavaConstructor;

public class ExecutionSequenceOfAllChild extends ExectionSEquenceOfAll
{
	 ExecutionSequenceOfAllChild()
	 {
		 super(10);
		 System.out.println("Child Constructor");
	}
	 ExecutionSequenceOfAllChild(int a)
	 {
		 this();
		 System.out.println("child constructor 1 para");
	 }
	 {
		 System.out.println("child non static block");
	 }
	 static
	 {
		 System.out.println("Child Class static block");

	 }
	public static void main(String[] args) {
		
		new ExecutionSequenceOfAllChild();
	}

}
