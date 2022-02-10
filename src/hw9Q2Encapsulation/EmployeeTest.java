package hw9Q2Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Runa Jabbar");
		employee.setAge(31);
		employee.setSex('F');
		employee.setUsCitizen(true);
		
		System.out.println("The name of employee: " + employee.getName() + ", \nage: " +  
		employee.getAge() + ", \nsex: " + employee.getSex() + ", \nUs citizen?: " +   
		employee.isUsCitizen());
	}
}