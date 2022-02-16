package hw11Q2Polymorphism;

public class Sister {
	
	public void sister() {
		System.out.println("This is a void type method from Sister class");
	}
	public void sister(int age1, int age2, int age3, String age4, int age5, int age6){
		int total1= age1 + age2+ age3+ Integer.parseInt(age4) + age5 + age6;
		System.out.println("Total age of Sister: " + total1);
	}
	public int sister(int age1, int age2, String age4) {
		int total2 = age1 + age2 + Integer.parseInt(age4);
		System.out.println("Total age of Sister: " + total2);
		return total2;
	}
	// method is overloading in line 12 and line 19 because they both have,
	// different type of parameter/signature and in different combination (line 12 has String age).
	//final method can overload.
	public final int sister(int age3, int age5, int age6) {
		int total3 =age3 + age5 + age6;
		System.out.println("Total age of Sister: " + total3);
		return total3;
	}
    // static method can overload.
	public static int sister(int age2, int age5, int age6,String age4) {
		int total4 = age2 + age5 + age6 + Integer.parseInt(age4);
		System.out.println("Total age of Sister: " + total4);
		return total4;
}
}