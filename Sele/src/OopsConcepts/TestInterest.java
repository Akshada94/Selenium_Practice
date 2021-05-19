package OopsConcepts;
//overriding
public class TestInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b;
		b=new SBI();//upcasting
		 float val1=b.getRateOfInterest();
		 System.out.println(val1);
		 
		 b=new ICICI();
		 float val2=b.getRateOfInterest();
		 System.out.println(val2);
		

	}  

} 
