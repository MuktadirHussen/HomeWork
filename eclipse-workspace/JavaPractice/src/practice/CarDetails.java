package practice;

public class CarDetails {

	public static void main(String[] args) {
		Car car=new Car();// default constructor initialized 
		System.out.println("               ");
		
		Car car1 = new Car("Honda", 'S', 23000, true);
		System.out.println("\n*********\n");
		Car car2 = new Car("Toyota", 'M', 24000, false);
		System.out.println("\n*********\n");
		Car car3 = new Car("Ford", 'L', 25000, true);
		System.out.println("\n*********\n");
		Car car4 = new Car("Bmw", 'Q', 26000, false);
		System.out.println("\n*********\n");
		Car car5 = new Car("Mercedes", 'W', 27000, true);

	}

}
