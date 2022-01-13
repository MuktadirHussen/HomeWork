package hw4Q2JavaVariablesDeclared;

public class AboutMe {

	public String name;
	public byte age;
	public float height;
	public int yearlySalary;
	public long bankBalance;
	public double grade;
	public short yearlyRent;
	public char gender;
	public boolean usCitizen;

	public AboutMe() {
		System.out.println("This is all about me: ");
	}

	public void aboutMe() {
		System.out.println("My Name Is: " + name + "\nMy Age: " + age + "\nMy Height: " + height
				+ "\nMy Yearly Salary: " + yearlySalary + "\nMy Bank Balance: " + bankBalance + "\nMy Grade: " + grade
				+ "\nMy House Rent: " + yearlyRent + "\nMy Gender: " + gender + "\nAm I US Citizen Ans: " + usCitizen);
	}

}
