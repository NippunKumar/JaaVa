package exceptionInterview;

public class DemonstrateFinally {
	public static void main(String[] args) {
		int array[] = new int[2];
		try {
			System.out.println("Inside try");
			System.out.println("Access invalid element" + array[3]);// will throw ArrayIndexOutOfBoundException 
			System.exit(1);
		} catch (Exception ex) {
			System.out.println("I am in catch block");
			ex.printStackTrace();
		} finally {
			System.out.println("finally is always executed.");
		}
	}
}
