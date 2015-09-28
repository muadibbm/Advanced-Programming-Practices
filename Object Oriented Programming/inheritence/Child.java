package Inheritence;

public class Child extends Parent {
	
	public Child() {
		super();
	}
	
	public String whoAmI() { 
		return "I am a Child";
	}
	
	// Cannot modify the method final authority() inherited from the parent
	
	public String doSomething(String action, String secondAction) {
		return "do " + action + " and do " + secondAction;
	}
	
	@Override
	public String rebel() {
		return "Rebel!";
	}
	
	public static void makeMoney() {
		System.out.println("Child Made Money");
	}
	
	public void childMethod() {
		System.out.println("Child Can do this");
	}
}
