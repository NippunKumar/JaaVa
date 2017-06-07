package exceptionInterview;

public class NoExceptionChaining {
	public static void main(String[] args) {
		System.out.println("No chaining example:");
		try {
			try {
				throw new Exception("Exception ONE");
			} catch (Exception e) {
				throw new Exception("Exception TWO");
			}
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}
}
