package practice;

public class Car {

	public String carName;
	public char model;
	public int weight;
	public boolean fourWheel;

	// default constructor(no argument constructor)
	public Car() {
		System.out.println("the cars info is down below: ");

	}
//parameterized constructor declared
	public Car(String carName, char model, int weight, boolean fourWheel) {
		this.carName = carName;
		this.model = model;
		this.weight = weight;
		this.fourWheel = fourWheel;

		System.out.println("The car name is: " + carName + "\nCar model: " + model + "\nCar weight: " + weight
				+ "\nHas fourWheelDrive: " + fourWheel);
	}

}
