package scheduler;

public class PersistentTime {
	static int currentTime;
	
	private static PersistentTime firstInstance = null;

	// Private singleton to prevent instantiation.
	private PersistentTime() {
	}

	public static PersistentTime getInstance() {

		if (firstInstance == null) {

			firstInstance = new PersistentTime();
			currentTime = 1;
		}

		return firstInstance;
	}
	
	
	
	public int getTime() {
		return currentTime;
	}
	
	
}

