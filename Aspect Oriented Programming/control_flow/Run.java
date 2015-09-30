package control_flow;

public class Run {

	public static void main(String[] args) {
		
		Human human = new Human();
		Robot robot = new Robot();
		
		System.out.println(human.reason());
		System.out.println(robot.reason());
	}

}
