package stringInterview;

public class RemoveChar {
	public static void main(String[] args) {
		      String str = "India is my country";
		      System.out.println(charRemoveAt(str, 7));
		   }
		   public static String charRemoveAt(String str, int pos) {
		      return str.substring(0, pos) + str.substring(pos + 1);
		   }
}
