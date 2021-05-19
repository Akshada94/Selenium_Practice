package ArrayTest;

public class ArrayTest1 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		int []array= {20,30,40,50};
		
		
		
		
		int []ar=new int[10];//[1,0,0,3,0,0,0,0,0,0]
				ar[0]=1;
				ar[3]=3;
				ar[2]=5;
				System.out.println(ar[2]);
				System.out.println("lenght of array>"+ar.length);
				System.out.println("for loop iterate");
				for(int i = 0; i < ar.length; i++) {
					System.out.println(ar[1]);
				}
				System.out.println("for each iterate");
				for (int i : ar) {
					System.out.println(i);
				}
	}

}
