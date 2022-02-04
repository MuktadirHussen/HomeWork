package hw8Q3Abstraction;

public class ColumbiaUniversity {
	/*
	 * public abstract void chemistry(); Regular class does not contain abstract
	 * methods, methods only contain non abstract methods in regular class method
	 * can be implemented but not declared in abstract class method can be declared
	 * only but not implemented
	 */
	public ColumbiaUniversity() {
	}
	public void biology() {
		System.out.println("You can not have abstract method in regular class");
	}
}