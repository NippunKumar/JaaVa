package stringInterview;

public class RemoveAllSpace {
	public static void main(String[] args) {
		String str = "India		Is My    Country";
		String NoSpaceStr = str.replaceAll("\\s", ""); // using built in method
		System.out.println(NoSpaceStr);
		char[] strArray = str.toCharArray();
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < strArray.length; i++) {
			if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
				stringBuffer.append(strArray[i]);
			}
		}
		System.out.println(stringBuffer);
	}
}
