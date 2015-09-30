package control_flow;

public aspect Logger {

	before() : execution(String Human.reason()) {
		System.out.println("> captured execution : " + thisJoinPoint);
	}
	
	before() : execution(String Robot.reason()) {
		System.out.println("> capture execution : " + thisJoinPoint);
	}
	
	after() : execution(* *(..))
		&& !within(Logger)
		&& !cflow(execution(* java.*.*.*(..))) {
		System.out.println("> execution : " + thisJoinPoint);
	}
}
