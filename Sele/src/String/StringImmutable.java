package String;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated met
		
		
		
		//String object string literals goes to string constant pool
		String s1="akshada";
		String s2="pawar";
		String s3="akshada";
		s1="amit"; //it changes s3 also bcoz of this string is immutable in java
		
		
		
		String s4="akshada";
		//string object using new keyword goes to heap area
		String s5=new String("anuja");
		String s6=new String("akshada");
        String s7=new String("anuja");	
        // == Compare the address of an objects
        System.out.println(s1==s2);//false
        System.out.println(s1==s3);//true
        System.out.println(s1==s5);//false
        System.out.println(s1==s6);//false
        
        //.equal compare the contents of objects
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s5));//false
        System.out.println(s1.equals(s6));//true
        
        //compareTo
        System.out.println(s1.compareTo(s2));//-ve(s1<s2)
        System.out.println(s1.compareTo(s3));//+ve(s1>s3)
        

	}

}
