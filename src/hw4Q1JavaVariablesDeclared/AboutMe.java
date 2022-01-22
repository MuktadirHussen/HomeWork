package hw4Q1JavaVariablesDeclared;

public class AboutMe {
	public String name = "Muktadir hussen";
	public byte age = 32;
	public float height = 5.712f;
	public int yearlySalary = 61000;
	public long bankBalance = 50000l;
	public double grade = 4.123;
	public short yearlyRent = 13000;
	public char gender = 'M';
	public boolean usCitizen = true;

	public AboutMe() {
		System.out.println("This is all about me: ");
	}
	public void aboutMe() {
		System.out.println("My Name Is: " + name + "\nMy Age: " + age + "\nMy Height: " + height
		+ "\nMy Yearly Salary: " + yearlySalary + "\nMy Bank Balance: " + bankBalance + "\nMy Grade: " + grade
		+ "\nMy House Rent: " + yearlyRent + "\nMy Gender: " + gender + "\nAm I US Citizen Ans: " + usCitizen);
	}
	public static void main(String[] args) {
		AboutMe info = new AboutMe();
		info.aboutMe();
	}

}
