package Interface;

public class Run {
	
	public static void main (String[] args)
	{
		Counter c1 = new LockableCounter();
		LockableCounter c2 = new LockableCounter();
		LockIF c3 = new LockableCounter();
		c1.click();
		System.out.println(c1.getValue());
		System.out.println(c1.description);
		c2.click();
		System.out.println(c2.getValue());
		System.out.println(c2.description);
		c2.unlock();
		System.out.println(c2.isLocked());
		// c3.click(); Won't compile since there is not matching method in the static type
		c3.unlock();
		System.out.println(c3.isLocked());
		//System.out.println(c3.description); Won't complie since there is no description in the static type
	}
}
