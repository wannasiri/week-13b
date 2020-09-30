package week13b;

public class addition {
	static void math(int a,int b) {
		int c;
		c=a+b;
		System.out.println(c);
	}
	static void add() {
		System.out.println("Welcome");
	}
	static int add(int a,int b) {
		return (a+b);
	}
	static int add(double z,double q) {
		double p,m,c;
		p=z;
		m=q;
		return (int)(z=q);
	}
	public static void main(String[]args) {
		addition obj1 = new addition();
		math(50,50);
		add();
		System.out.println("Calling add method with two int parameter" + obj1.add(10, 25));
		System.out.println("Calling add method with two int parameter" + obj1.add(10, 30));
	}
}
