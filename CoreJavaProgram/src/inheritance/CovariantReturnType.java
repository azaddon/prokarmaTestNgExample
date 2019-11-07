package inheritance;

class A {
	A m1() {
		System.out.println("this is method A");
		return new A();
	}
	
}
class B extends A{
	A m1() {
		System.out.println("this is method B");
		return new A();
	}
}
class CovariantReturnType {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is simple method");
		B obj = new B();
		System.out.println(obj.m1());

	}

}
