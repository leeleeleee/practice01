package practice01;

public class Prob5 {

	public static void main(String[] args) {
		
		String str = new String();
		for (int i = 1; i < 100; i++) {
			System.out.print(i);
			str=String.valueOf(i);
			int length=str.length();
			for(int j = 0; j < length; j++) {
				char n = str.charAt(j);
				if( n == '3' || n == '6'|| n == '9' ) {
					System.out.print("짝");
				}
			}
			System.out.println("\n");
		}

	}
}
