package OopsConcepts;

public class Honda extends Car {
	public void hondamilage()
	{
		System.out.println("15km/L");
	}
	public static void main(String[] args) {
		Honda h=new Honda();
		h.brand();
		h.hondamilage();
		h.engine();
		h.colour();
	}

}
