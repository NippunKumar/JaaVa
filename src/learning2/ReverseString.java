package learning2;

public class ReverseString {

	public static void reversestring(String str) {

		StringBuilder builder = new StringBuilder(str);
		builder.reverse();
		System.out.println(builder);
	}

	public static String revStr(String st) {
		char ch[] = st.toCharArray();
		String result="";
		for (int x = ch.length - 1; x >= 0; x--) {
			result = result + ch[x];
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(revStr("Hi How are You"));
	}
}
