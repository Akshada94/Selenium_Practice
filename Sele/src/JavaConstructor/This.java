package JavaConstructor;

public class This
{
	int a;
	/* This(int a)
	 {
		 System.out.println("hello");
	 //this.a=a;//this keyword diff global nd local var.
	 }*/
	This()
	 {
		 System.out.println("default");
	 }
	This(int a)
	 {
		 System.out.println("1 para construct");
	 }


	 This(int a,String s)
	 {
		 System.out.println("2 para construct");
	 }

	public static void main(String[] args) {
		
		new This(10);
		
		new This(30,"akshu");
		new This();
//This t=new This(10);
//new This(20);
//System.out.println(t.a);
	}

}
