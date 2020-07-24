package weekly.answer;

public class W02 {

	public String soulution(String s) {
		int length = s.length();
		int index = length / 2;
		return (length % 2 == 0) ? s.substring(index - 1, index + 1) : s.substring(index, index + 1);
	}

	public static void main(String[] args) {
		W02 middleString = new W02();
		System.out.println(middleString.soulution("abcde"));
		System.out.println(middleString.soulution("qwer"));
		System.out.println(middleString.soulution("as1df"));
		System.out.println(middleString.soulution("q34e"));
	}

}
