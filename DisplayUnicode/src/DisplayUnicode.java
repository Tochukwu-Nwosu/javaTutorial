import javax.swing.JOptionPane;

public class DisplayUnicode {
	public static void main(String[] args) {
		//Unicode encoding scheme
		JOptionPane.showMessageDialog( null, "\u6B22\u8FCE \u03b1 \u03b2 \u03b3", "\u6B22\u8FCE Welcome", JOptionPane.INFORMATION_MESSAGE);
	//Explicit Casting
	int num = (int)66.89;
	System.out.println(num);
	char ch = (char)99;
	System.out.println(ch);
	int add = '2' + '3';
	System.out.println(add);
	}
}
//Encoding is the binary representation of characters or mapping of characters to it's binary representation.