
public class reverseNumber {

	public static void main(String[] args) {

		int i = 123456789, reverse = 0;
		System.out.println("original no.:" + i);

		while (i != 0) {
			int digit = i % 10;
			reverse = reverse * 10 + digit;
			i /= 10;
		}

		System.out.println("Reversed No.:" + reverse);
	}
}
