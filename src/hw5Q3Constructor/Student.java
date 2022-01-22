package hw5Q3Constructor;

public class Student {
	public String stName;
	public int stId;
	public char sex;
	public float grade;
	public boolean isJavaProgrammer;

	public Student() {
		System.out.println("This is from Default Constructor of student class:");
	}
	public Student(String stName, int stId, char sex, float grade, boolean isJavaProgrammer) {
		this.stName = stName;
		this.stId = stId;
		this.sex = sex;
		this.grade = grade;
		this.isJavaProgrammer = isJavaProgrammer;
		System.out.println("Student name: " + stName + ",Id: " + stId + ",Sex: " + sex + ",Grade: " + grade
		+ ",IsJavaProgrammer: " + isJavaProgrammer);

	}

}
