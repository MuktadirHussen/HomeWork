package hw5Q2Constructor;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer = new Computer();
		System.out.println("");
		Computer computer1 = new Computer("Apple", "MacBook Air", "MacOsJave", 800, 'A', false);
		System.out.println("\n*******************\n");
		Computer computer2 = new Computer("Dell", "OptiPlex", "Windows10", 900, 'B', true);
	}
}
