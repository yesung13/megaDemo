package basic.step16;

import java.util.Scanner;

/*
 * # 반복문 종료(-100)
 * 1. 무한 반복을 하면서 숫자를 입력받는다.
 * 2. 입력한 숫자가 -100이면, 프로그램은 종료된다.
 */

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int run = 1;
		while (run == 1) { // true 키워드와 같은 의미
			System.out.println("숫자를 입력[EXIT:-100] : ");
			int num = sc.nextInt();

			if (num == -100) {
				System.out.println("프로그램 종료");
				run = 0; // break;
			}
		}

	}

}
