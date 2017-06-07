package learning2;

public class SystemExit {
	public static void main(String[] args) {
		int arr[] = new int[5];
		try {
			System.out.println("I am in try block");
			int x = arr[5];
		} catch (Exception ex) {
			System.out.println("I am in catch block");
			System.exit(1);
			ex.printStackTrace();
		} finally {
			System.out.println("I am in finally block!!!");
		}
	}
}
