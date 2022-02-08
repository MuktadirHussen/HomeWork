package hw8Q3Abstraction;

public interface University {
	
	// public University() { 
	//}
	// you can not declare constructor inside the interface.
	// interface can not be instantiated and can not create object.
	// To call any method object is needed and for interface no object is required.
	// so there is no need of having constructor in it.
	public void classSize();

	public void playGround();

	public void teacher();
}