package hw9Q3Abstraction;

public interface University extends College, Hospital {
    // used only one keyword (extends) for inheritance
    // Yes An Interface can inherit other interface classes
    // An Interface can't inherit regular class or abstract class
	// A regular or abstract class can't inherit an interface
	// one or more inheritance is possible in Interface 
	// regular class or abstract class can do only single inheritance 
	public void classSize();
	public void playGround();
	public void teacher();
	
	public default void gymnasium() {
	}
	public static void library() {
	}
}