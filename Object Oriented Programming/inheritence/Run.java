package Inheritence;

public class Run {
	
	public static void main (String [] args) {
		
		Parent parent = new Parent(); // p
		Parent first_child = new Child(); // fc
		Child second_child = new Child(); // sc
		
		System.out.println("p says : " + parent.whoAmI());
		System.out.println("fc says : " + first_child.whoAmI());
		
		System.out.println("population count is " + first_child.getPopulation());
		
		System.out.println("p says : " + parent.authority());
		System.out.println("fc says : " + first_child.authority());
		
		parent.notAbstract();
		
		System.out.println("p : " + parent.doSomething("Walking"));
		// System.out.println(first_child.doSomething("Walking", "Playing"));
		// Since the static type of first_child is Parent, it does not have access to the overloaded method doSomething of Child
		System.out.println("fc : " + first_child.doSomething("Walking"));
		System.out.println("sc : " + second_child.doSomething("Walking", "Playing"));
		
		System.out.println("p : " + parent.rebel());
		System.out.println("fc : " + first_child.rebel());
		System.out.println("sc : " + second_child.rebel());
		
		parent.makeMoney();
		first_child.makeMoney();
		second_child.makeMoney();
		
		Parent a = new Parent();
		// ((Child)a).authority(); Fails at runtime since parent cannot be cast to the child
		// ((Child)a).childMethod(); Fails at runtime since parent cannot be cast to the child
		
		Parent b = new Child();
		((Child)b).childMethod();
	}
	
	static {
		System.out.println("Static blocks run once as soon as the class is loaded and before the main() method executes.");
	}
}
