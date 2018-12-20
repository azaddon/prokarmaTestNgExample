package exceptionhandling;

public class RunTimeExceptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=0;
		int c;
		try {
			c = a/b;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			
			System.out.println("Division by zero not possible");
		}
		finally {
			System.out.println("Always Executes");
		}
		int num[] = {1,2,3};
		for(int i=0;i<=3;i++)
			try {
				System.out.println(num[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				System.out.println("Array is overflow");
			}
	}

}
