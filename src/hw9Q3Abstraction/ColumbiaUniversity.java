package hw9Q3Abstraction;

public class ColumbiaUniversity extends MedicalSchool{
	// used one keyword to inherit the class,
	// regular class can inherit another regular or abstract class.
	// but we have to implemented methods, not declared,
    //	regular class does'nt allow abstract methods in the class.
	// here we made hygiene and anatomyLab to non abstract methods.
	// abstract class cannot inherit an Interface class using keyword extends.
	public ColumbiaUniversity() {
	}
	public void biology() {
	}
	@Override
	public void anatomyLab() {		
	}
	@Override
	public void hygiene() {
	}
}