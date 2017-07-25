package tr.org.linux.kamp.kendiUpperCase;

public class KendiUpperCase {
	
	
	public static void main(String[] args) {
		String str="hello world";
		System.out.println(buyukHarfeDon(str));
	}
	public static String buyukHarfeDon(String str) {
		String result="";
		for (int i=0;i<str.length();i++) {
		result+=Character.toUpperCase(str.charAt(i));
		}
	return result;
	}
	
}
