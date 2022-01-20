package hw5Q3Constructor;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(" ");

		Student student1 = new Student("Muktadir Hussen", 123, 'M', 3.976f, true);
		System.out.println(" ");
		Student student2 = new Student("Runa Jabbar", 456, 'F', 4.976f, true);
		System.out.println(" ");
		Student student3 = new Student("Ahyan Hussen", 789, 'M', 5.976f, false);

	}

}
