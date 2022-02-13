package hw10Q3Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	// one keyword (extends) used for the inheritance.
	// abstract class can inherit other abstract or regular class using extends keyword.
	// only one inheritance is possible for an abstract class
	// abstract class can not inherit an Interface class by extends keyword
	// implements keyword is used to inherit Interface in abstract class
	// an abstract class can inherit one or more interface class
	// an abstract class cannot inherit a regular class or abstract class by implements keyword
	public MedicalSchool() {
	}
	public abstract void anatomyLab();
	public void biochemistryLab() {
		System.out.println("Media school has two labs");
	}
}