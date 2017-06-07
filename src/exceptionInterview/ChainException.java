package exceptionInterview;

public class ChainException {
	static void method1() throws NumberFormatException {
		int i = Integer.parseInt("1"); // This statement throws
										// NumberFormatException if it does not convert to the numeric value
		method2();
	}

	static void method2() throws NullPointerException{
		String s = null;
		System.out.println(s.length()); // This statement throws
										// NullPointerException
	}
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception ex) {
			System.out.println("This block can handle all types of exceptions");
			ex.printStackTrace();
		}
	}
}
