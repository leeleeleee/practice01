package practice01;

import java.util.Scanner;

public class Prac03 {

	public static void main(String[] args) {
		while(true){Scanner scanner = new Scanner(System.in);
		System.out.print("수를 입력하세요 :");
		int n = scanner.nextInt();
		
		for(int i =1; i<=n; i++) {
			for(int j =1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		}
//		scanner.close();

}
}