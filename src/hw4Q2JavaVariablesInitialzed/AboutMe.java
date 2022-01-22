package hw4Q2JavaVariablesInitialzed;

public class AboutMe {
	// variables declared
	public String name;
	public byte age;
	public float height;
	public int yearlySalary;
	public long bankBalance;
	public double grade;
	public short yearlyRent;
	public char gender;
	public boolean usCitizen;
	// constructor declared
	public AboutMe() {
		System.out.println("This is all about me: ");
	}
	// method implemented
	public void aboutMe() {
		System.out.println("My Name Is: " + name + "\nMy Age: " + age + "\nMy Height: " + height
		+ "\nMy Yearly Salary: " + yearlySalary + "\nMy Bank Balance: " + bankBalance + "\nMy Grade: " + grade
		+ "\nMy House Rent: " + yearlyRent + "\nMy Gender: " + gender + "\nAm I US Citizen?Ans: " + usCitizen);
	}

}
