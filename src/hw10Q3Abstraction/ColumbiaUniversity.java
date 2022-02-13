package hw10Q3Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool{
	// one keyword (extends) used for the inheritance.
	// abstract class can inherit other abstract or regular class using extends keyword.
	// only one inheritance is possible for an abstract class
	// abstract class can not inherit an Interface class by extends keyword
	// implements keyword is used to inherit Interface in abstract class
	// an abstract class can inherit one or more interface class
	// an abstract class cannot inherit a regular class or abstract class by implements keyword
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
	@Override
	public void lawInfo() {		
	}
	@Override
	public void commonRoom() {		
	}
	@Override
	public void laboratory() {
	}
	@Override
	public void languageClub() {
	}
	@Override
	public void emergencyRoom() {		
	}
	@Override
	public void surgeryRoom() {		
	}
	@Override
	public void cafeteria() {		
	}
	@Override
	public void classSize() {		
	}
	@Override
	public void playGround() {		
	}
	@Override
	public void teacher() {		
	}
	@Override
	public void vocationalInfo() {		
	}
}