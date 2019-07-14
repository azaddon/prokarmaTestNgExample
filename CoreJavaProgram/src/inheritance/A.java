package inheritance;
//some changes
 class A {
	int i = 10;
	public void message(){
		System.out.println("Parent Class A");
	}

 static class B extends A {
	int i = 20;
	public void message(){
	System.out.println("Child Class B");
	}
	public void message1(){
	System.out.println("Only Class B method");
	}
}
//Main method

public static void main(String[] args) {
//Reference variable of Super Class A with object of class B.
		//The OVERRIDING method is called through the reference variable of the superclass
		A a1 =  new A();
		//a1.message();
		A b1 =new B();
        b1.message();//not accessible
}
}
