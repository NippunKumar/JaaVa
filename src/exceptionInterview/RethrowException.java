package exceptionInterview;

public class RethrowException {
	public static void main(String[] args) {
		try {
			myMethod();
		} catch (NullPointerException ex) {
			System.out.println(" Got NullPointerException in main method");
			System.out.println("NullPointerException Re-thrown in myMethod() method will be handled here");
		}
	}
	static void myMethod() {
		try {
			String str = null;
			System.out.println(str.length()); // This statement throws NullPointerException
		} catch (NullPointerException ex) {		
			System.out.println("Got Null pointer Exception in myMethod ");
			System.out.println("Re-Throwing NullPointerException");
			throw ex; 
			
		}
	}
}
