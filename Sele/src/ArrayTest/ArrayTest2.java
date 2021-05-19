package ArrayTest;

public class ArrayTest2 {

	public static void main(String[] args) {
		//declaration of array
		//int a[];
		//int []a;
		int [] a;
		//instatation -defining the size of array
		a=new int[5];//[0,0,0,0,0]
		//initialization
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		//a[5]=60;//java.lang.ArrayIndexOutOfBoundsException
		//print array
		for (int i : a)
		{
		System.out.println(i);	
		}
		//declare and instatiate
		int b[]=new int[5];
		//intialization
		b[0]=10;
		b[1]=20;
		b[2]=30;
		
		//declare,instation and initiaze
		int c[]= {1,2,3,4,5,6};
		
	}

}
