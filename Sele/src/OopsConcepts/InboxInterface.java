package OopsConcepts;

public class InboxInterface implements Branding,LoginInterface 
{

	public static void main(String[] args) {
		InboxInterface i=new InboxInterface();
		i.branding();
		i.Login();

	}

	@Override
	public void Login() {
		System.out.println("login done");
		
	}

	@Override
	public void branding() {
 		System.out.println("branding is Gmail");
	}

}
