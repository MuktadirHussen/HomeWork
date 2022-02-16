package hw11Q2Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("\n****Sister****");
		Sister sis = new Sister();
		sis.sister();
		sis.sister(10, 5, 8, "10", 2, 4);
		sis.sister(7, 22, "15");
		sis.sister(9, 11, 23);
		Sister.sister(12, 17, 19, "45");
		
		System.out.println("\n****Niece***");
		Niece niece = new Niece();
		niece.sister();
		niece.sister(4, 45, "30");
		niece.sister(6, 9, 2, "32", 8, 7);
		Niece.sister(4, 6, 8, "45");
		niece.sister(3, 9, 67);
	}
}