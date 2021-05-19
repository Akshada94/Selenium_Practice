package OopsConcepts;

public class InferfaceClass implements InterfaceTest {

	public static void main(String[] args) {
		
InferfaceClass i=new InferfaceClass();
i.run();
i.add();
	}

	@Override
	public void run() {

System.out.println("run test body");
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

}
