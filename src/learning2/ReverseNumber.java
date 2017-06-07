package learning2;

public class ReverseNumber {
	public static int revNum(int x) {
		int y = x;
		int temp = 0;
		int result = 0;
		while (y > 0) {
			temp = y % 10;
			y = y / 10;
			result = result * 10 + temp;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(revNum(1234));
	}
}
