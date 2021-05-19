package Java;

public class Fibo {

	public static void main(String[] args) {
		int f1=0,f2=1,n=6,f3 = 0;
		System.out.println(f1+" "+f2);
		for(int i=0;i<n;i++) {
			f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
			
			System.out.println(+f1+" "+f2+" "+f3);
		}
	


	}

}
