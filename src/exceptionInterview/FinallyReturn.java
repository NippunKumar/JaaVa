package exceptionInterview;

public class FinallyReturn {
	public static void main(String[] args) {
		System.out.println("Normal folw execution: output " + Normal());
		System.out.println("Exception ececution: output" + Exception());
	}

	public static int Normal() {
		try {
			// no exception is thrown
			return 0;
		} catch (Exception e) {
			System.out.println("(Normal flow) Exception caught");
		} finally {
			
			System.out.println("(Normal flow) Finally");
		}
		System.out.println("(Normal flow) Rest of code");
		return -1;
	}

	public static int Exception() {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("(Exception) Exception caught");
		} finally {
			System.out.println("(Exception]) Finally");
		}
		System.out.println("(Exception)  Rest of code");
		return -1;
	}
}
