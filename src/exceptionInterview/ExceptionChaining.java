package exceptionInterview;

public class ExceptionChaining {
	public static void main(String[] args) {
		System.out.println("chaining example :");
		try {
			try {
				throw new Exception("Exception One");
			} catch (Exception e) {
				throw new Exception("Exception Two", e);
			}
		} catch (Exception e) {
			e.printStackTrace(System.out);
			System.out.println("Printing cause:");
			e.getCause().printStackTrace(System.out);
		}
	}
}
d