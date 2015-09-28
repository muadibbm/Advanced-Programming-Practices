package Interface;

public class LockableCounter extends Counter implements LockIF {

	static String description = "A lockable counter.";
	private boolean lock;
	public void lock() {
		this.lock = true;
	}
	public void unlock() {
		this.lock = false;
	}
	public boolean isLocked() {
		return this.lock;
	}
	public void click() {
		this.value = this.value + 2;
	}
	
}
