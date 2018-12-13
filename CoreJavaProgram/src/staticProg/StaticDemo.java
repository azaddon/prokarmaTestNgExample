package staticProg;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticExampleClass s1 = new StaticExampleClass("bmw");
		System.out.println("make of car is:-" + s1.getMake());
		System.out.println("instance num is:-" + StaticExampleClass.getInsanceNum());

		StaticExampleClass s2 = new StaticExampleClass("mercedes");
		System.out.println("make of car is:-" + s2.getMake());
		System.out.println("instance num is:-" + StaticExampleClass.getInsanceNum());
	}

}
