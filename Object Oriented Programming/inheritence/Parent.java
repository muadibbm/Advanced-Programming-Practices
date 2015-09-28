package Inheritence;

public class Parent extends Person{
	
	private static int population = 0;
	
	public Parent() {
		population++;
	}
	
	public String whoAmI() { 
		return "I am a Parent";
	}
	
	public int getPopulation() {
		return population;
	}
	
	public final String authority() {
		return "Parent is in charge";
	}
	
	public String doSomething(String action) {
		return "do " + action;
	}
	
	public String rebel() {
		return "Obey!";
	}
	
	public static void makeMoney() {
		System.out.println("Parent Made Money");
	}
	
}
