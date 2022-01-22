package hw3Q2Javaariables;

public class AboutMe {

	public String name = "Muktadir hussen";
	public byte age = 32;
	public char sex = 'M';
	public int bankBalance = 25000;
	public float height = 5.7212f;
	public long yearlySalary = 610000l;
	public short yearlyRent = 13000;
	public boolean usCitizen = true;

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe();
		System.out.println("My name: " + aboutMe.name);
		System.out.println("MY age: " + aboutMe.age);
		System.out.println("My height:" + aboutMe.height);
		System.out.println("MyYearlySalary: " + aboutMe.yearlySalary);
		System.out.println("My gender: " + aboutMe.sex);

	}
}
