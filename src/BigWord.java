
public class BigWord {

	public static void main(String[] args) {
		
		String s="testing campus";
		String [] s2=s.split(" ");
		String temp=null;
		
		if(s2[0].length()>s2[1].length()) {
			temp=s2[0];
		}
		if (s2[1].length()>s2[0].length()) {
			temp=s2[1];
		}
		if (temp!=null) {
			System.out.println("Biggest word is:"+temp);
		}
		else {
			System.out.println("Too many words of same length");
		}
	}
}
