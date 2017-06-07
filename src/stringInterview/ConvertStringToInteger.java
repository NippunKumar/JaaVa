package stringInterview;

public class ConvertStringToInteger {
	public static void main(String[] args) {
		String str1 = "5";
		int result = Integer.parseInt(str1); // Using parsrInt()
		System.out.println(result);

		String str2 = "5";
		Integer result2 = Integer.valueOf(str2); // Using valueOf()
		System.out.println(result);

		int x = 5;
		String str = Integer.toString(x); // using Integer Class' toString()

	}
}
