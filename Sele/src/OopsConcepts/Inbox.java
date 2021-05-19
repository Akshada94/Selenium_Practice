package OopsConcepts;

public class Inbox  extends Login{
	public void inboxChecked()
	{
		System.out.println("Inbox checked success");
	}
	public static void main(String[] args) {
		Inbox i=new Inbox();
		i.login();
		i.inboxChecked();
	}

}
