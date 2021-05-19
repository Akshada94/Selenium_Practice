package OopsConcepts;

public class ChildC extends ParentP{
void marry()
{
	System.out.println("Will marry with B");
}
	public static void main(String[] args) {
		ChildC c=new ChildC();
		c.marry();
		ParentP p=new ParentP();
		p.marry();
		ParentP p1=new ChildC();//upcasting
		p1.marry();

	}

}
