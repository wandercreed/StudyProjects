
public class a7cPALINDROM {

	public static void main(String[] args) {

		String str = "bghhha";

		System.out.print(istPalindrom(str));

		/* String palindropm check
		 * String str = "ahhhha ahhhha ahhhha"; 
		 * String [] str2 = str.split(" ");		
		 * for (int i = 0; i < str2.length;i++) { 
		 * istPalindrom(str2[i]); 
		 * }
		 */

	}

	public static boolean istPalindrom(String str) {

		char[] wort = str.toCharArray();

		int anfang = 0;
		int ende = str.length() - 1;

		while (ende > anfang) {
			if (wort[anfang] != wort[ende]) {
				System.out.println("Das Wort ist kein Palindrom");
				return false;
			}

			++anfang;
			--ende;
		}
		System.out.println("Das Wort ist  Palindrom");
		return true;

	}

}
