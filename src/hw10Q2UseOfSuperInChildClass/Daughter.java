package hw10Q2UseOfSuperInChildClass;

public class Daughter  extends Father {

	public String birthMonth;
	public int age;

	public Daughter() {
		super();
		super.father();
		super.fatherInfo(birthMonth, age, sex, usCitizen);
		super.familyName = ("Muktadir");
		System.out.println("This is a default consturctor from Daughter class");
	}
	public Daughter(String birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("This is a paramitarized consturctor from Daughter class");
	}
	public void daughter() {
		super.familyName = familyName;
		System.out.println("This is a void type method from Daughter class");
	}
	public void daughterInfo(String birthMonth, int age) {
		super.father();
		super.fatherInfo(birthMonth, age, sex, usCitizen);
		super.familyName = familyName;
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("This is a paramitirized type method from Daughter class");
	}
}