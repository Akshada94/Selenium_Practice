package OopsConcepts;

class Compose extends Login {
	public void composeEmail()
	{
		System.out.println("Mail Composed Success");
	}
	public static void main(String[] args) {
		
		Compose c=new Compose();
		c.login();
		c.composeEmail();
	}

}
