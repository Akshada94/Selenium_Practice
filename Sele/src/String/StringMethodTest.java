package String;

public class StringMethodTest {

	public static void main(String[] args)
	{
	  String s1="pankaj";
	  System.out.println(s1.length());
	  System.out.println(s1.toUpperCase());
	  System.out.println(s1.toLowerCase());
	  System.out.println("element at oth index "+s1.charAt(0));
	String s2="I love My country";
	String [] arr=s2.split(" ");
	for (String string : arr) {
		System.out.println(string);
	}
	}

}
