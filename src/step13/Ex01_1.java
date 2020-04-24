package step13;

import java.util.Random;

/*
 * # 369게임[1단계]
 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
 * 2. 위 수에 369의 개수가
 * 	1) 2개이면, 짝짝을 출력
 *  2) 1개이면, 짝을 출력
 *  3) 0개이면, 해당 숫자를 출력
 * 예)
 * 		33	 : 짝짝
 * 		16	 : 짝
 * 		 7	 : 7
 */

//어려움

public class Ex01_1 {
	public static void main(String[] args) {
		Random ran = new Random();
		int rNum = ran.nextInt(50) + 1; // [0 ~ 49] + 1
		System.out.println("랜덤 숫자: " + rNum);

		if (3 <= rNum && rNum <= 9) {
			if (rNum % 3 == 0) {
				System.out.println("짝");
			} else {
				System.out.println("숫자: " + rNum);
			}

		} else if (13 <= rNum && rNum <= 19) {
			if (rNum % 3 == 1) {
				System.out.println("짝");
			} else {
				System.out.println("숫자: " + rNum);
			}

		} else if (23 <= rNum && rNum <= 29) {
			if (rNum % 3 == 2) {
				System.out.println("짝");
			} else {
				System.out.println("숫자: " + rNum);
			}

		} else if (33 <= rNum && rNum <= 39) {
			if (rNum % 3 == 0) {
				System.out.println("짝짝");
			} else {
				System.out.println("숫자: " + rNum);
			}

		} else if (43 <= rNum && rNum <= 49) {
			if (rNum % 3 == 1) {
				System.out.println("짝");
			} else {
				System.out.println("숫자: " + rNum);
			}

		} else {
			System.out.println("숫자: " + rNum);
		}

	}
}
