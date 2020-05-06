package basic.step19;

import java.util.Scanner;

/*
 * # 최대값 구하기[2단계]
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 */

public class Ex01_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		int i = 1;
		while (i <= 3) {
			System.out.print("정수 입력:");
			int num = sc.nextInt();
			if (i == 1) {
				num1 = num;
			} else if (i == 2) {
				num2 = num;
			} else if (i == 3) {
				num3 = num;
			}
			i += 1;
		}

		if (num1 > num2 && num1 > num3) {
			System.out.println("가장 큰 값: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("가장 큰 값: " + num2);
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("가장 큰 값: " + num3);
		}
	}

}
