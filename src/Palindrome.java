
public class Palindrome {

	public static void main(String[] args) {

		String s = "mada";

		int j = s.length() - 1;
		int size = s.length() - 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(j)) {
				--j;
				if (i == size) {
					System.out.println("Palindrome");
				} 

				}else {
					System.out.println("Not a palindrome");
					break;
			}
		}
	}
}
