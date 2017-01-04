package practice01;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		int l=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자를 입력하시오 : ");
		String s = scanner.nextLine();
		int length = s.length();
		for (int i = 0; i < length; i++) {
			System.out.println("");
			l++;
				for (int j = 0; j < l; j++) {
					System.out.print(s.charAt(j));

				}
			}

	}
}
//int k=0;
//for (int i = 1; i <= 7; i++) {
//	System.out.println();
//	k++
//	for (int j = 0; j < 10; j++) {
//		System.out.print(j+k);
