package Java;

public class SwitchTest {

	public static void main(String[] args) {
		int exp=3;
		String technology="Automation";
		switch (technology) {
		case "Automation":
			switch(exp)
			{
			case 1:
				System.out.println("you are not elligible");
			
		    case 2:
			System.out.println("u r not elligible");
			break;
		    case 3:
			System.out.println("you are elligible");
			break;
		    case 4:
				System.out.println("you are over elligible");
				break;
			}
			break;
		case "Manual":
			System.out.println("u r not elligible");
			break;

		default:
		     System.out.println("u r not alllowed");		

	         break;
		}
	}

}
/*int exp=2;
switch (exp) {
case 1:
	System.out.println("u r not elligible");
	break;
case 2:
	System.out.println("u r for elligible for l1");
	break;

case 3:	
	System.out.println("u r for elligible for l2");
	break;

case 4:
	System.out.println("u r for elligible for l3");
	break;
default:
     System.out.println("u r not alllowed");		

     break;
}*/