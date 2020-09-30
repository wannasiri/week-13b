package week13b;

public class overloading1 {
	static void sound() {
		System.out.println("Hello");
	}
	static void sound(int a) {
		int cat;
		cat = a;
		System.out.println("Hey !!" + cat);
	}
	public static void main(String[]args) {
		sound(59);
	}
}
