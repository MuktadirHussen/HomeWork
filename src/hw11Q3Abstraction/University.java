package hw11Q3Abstraction;

public interface University extends College, Hospital {
	
	public static void university() {		
	}
	public void classSize();
	public void playGround();
	public void teacher();
	public default void gymnasium() {
	}
	public static void library() {
	}
}