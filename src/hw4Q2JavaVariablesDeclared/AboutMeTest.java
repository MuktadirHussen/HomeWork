package hw4Q2JavaVariablesDeclared;
// Testing 1
// Testing 2
public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe info = new AboutMe();

		info.name = "Muktadir hussen";
		info.age = 32;
		info.height = 5.712f;
		info.yearlySalary = 61000;
		info.bankBalance = 500000l;
		info.grade = 4.123;
		info.yearlyRent = 13000;
		info.gender = 'M';
		info.usCitizen = true;
		info.aboutMe();

		System.out.println("\n**************************\n");

		AboutMe info2 = new AboutMe();
		info2.name = "Alex";
		info2.age = 34;
		info2.height = 4.712f;
		info2.yearlySalary = 51000;
		info2.bankBalance = 600000l;
		info2.grade = 3.123;
		info2.yearlyRent = 14000;
		info2.gender = 'F';
		info2.usCitizen = false;
		info2.aboutMe();

	}

}
