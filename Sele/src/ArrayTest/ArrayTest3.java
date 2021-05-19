package ArrayTest;

public class ArrayTest3 {
	
	
	
	public static void main(String[] args) {
		int [][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		
		
		
		
		for(int i=0;i< args.length;i++) 
		{
			for(int j=0;j<args.length;j++)
			{
				System.out.print(arr[i][j]+" ");
				
			}
			
		}
	}

}
