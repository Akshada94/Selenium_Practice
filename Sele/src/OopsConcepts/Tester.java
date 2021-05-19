package OopsConcepts;
//tester Is-a employee is-a relationship
public class Tester extends Employee {

int joiningBonus=200000;
public static void main(String[] args) {
	Tester t=new Tester();
	System.out.println("joiningBonus"+t.joiningBonus);
	System.out.println("salary"+t.salary);
}
}