package practice01;

public class Prac04 {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			String str = String.valueOf(i);
			int length = str.length();
			System.out.print(i);
			for (int j = 0; j < length; j++) {
				if (str.charAt(j) == '3' || str.charAt(j) == '6' || str.charAt(j) == '9') {
					System.out.print("¦");
				}
			}
			System.out.println("");
			// }
		}
	}
}

