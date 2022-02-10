package hw9Q3Abstraction;

public abstract class MedicalSchool extends NursingSchool {
	// one keyword (extends) used for the inheritance.
	// abstract class can inherit other abstract or regular class using extends keyword.
	// abstract class can not inherit an Interface class.
	// only one inheritance is possible for an abstract class
	public MedicalSchool() {
	}
	public abstract void anatomyLab();
	public void biochemistryLab() {
		System.out.println("Media school has two labs");
	}
}