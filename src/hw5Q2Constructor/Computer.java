package hw5Q2Constructor;

public class Computer {
	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUsa;

	public Computer() {

		System.out.println("This is from default Constructor of Computer class. ");

	}

	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUsa) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUsa = madeInUsa;

		System.out.println("My brand: " + brand + "\nModel: " + model + "\nOperating System: " + operatingSystem
				+ "\nPrice: $" + price + "\nGrade: " + grade + "\nMade in usa :" + madeInUsa);

	}

}
