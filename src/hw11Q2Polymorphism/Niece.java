package hw11Q2Polymorphism;

import java.net.CacheRequest;

public class Niece extends Sister {

	@Override
	public void sister() {
		System.out.println("This is a void type method from Niece class");
	}
	@Override
	public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total1 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6 -3;
		System.out.println("Total age of Sister: " + total1);
	}
	// method is overriding below same method name but different syntax or logic,
	// added -3 in line 20 to change the logic and 
	// this is an example of method is overriding.
	@Override
	public int sister(int age1, int age2, String age4) {
		int total2 = age1 + age2 - 3 + Integer.parseInt(age4); 
		System.out.println("Total age of Sister: " + total2);
		return total2;
	}
	// final and static method can not override but can be over loaded
	// @Override
	// public final int sister(int age3, int age5, int age6) {
	// int total3 =age3 + age5 + age6;
	// System.out.println("Total age of Sister: " + total3);
	// return total3;
	// }
	// @Override
	// public static int sister(int age2, int age5, int age6,String age4) {
	// int total4 = age2 + age5 + age6 + Integer.parseInt(age4);
	// System.out.println("Total age of Sister: " + total4);
	// return total4;
	// }
}