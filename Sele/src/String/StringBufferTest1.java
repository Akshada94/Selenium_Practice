package String;

public class StringBufferTest1 {

	public static void main(String[] args) {
		String s1="pankaj";
		System.out.println("before concat "+s1);
		s1.concat("gupta");
		
		
		
		
		
		System.out.println("after concat "+s1);
		StringBuffer b=new StringBuffer("pankaj");//cannot call multiple thread
		System.out.println("before "+b);
		b.append("gupta");
		System.out.println("after "+b);
		
		StringBuilder sb=new StringBuilder("pankaj");//multiple thread access/call
		sb.reverse();
		System.out.println(sb);
		//toString method 
		System.out.println(sb.toString());
		//System.out.println(sb.substring(0));
		
	}

}
