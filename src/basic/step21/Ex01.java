package basic.step21;

/*
 * # 반복문 for
 * 1. 반복문의 조건 3가지
 * 1) 초기식
 * 2) 조건식
 * 3) 증감식
 * 2. for문의 구조
 * for(초기식;조건식;증감식){
 * 		조건식이 참일 동안 실행할 문장;
 * }
 * 3. for문의 실행 순서
 * 초기식 -> 조건식 -> 실행문 -> 증감식 -> 조건식 -> 실행문 -> 증감식 ...
 */

// i = i + 1;
// i += 1;
// i++;
// ++i;

public class Ex01 {

	public static void main(String[] args) {
		// while문과 for문 예시
		// int x = 1;
		// while (x <= 5) {
		// System.out.println(x);
		// x = x + 1;
		// }
		//
		// System.out.println();
		//
		// for (int y = 1; y <= 5; y++) {
		// System.out.println(y);
		// }

		// 문제 1) 1부터 5까지 출력
		// 정답 1) 1, 2, 3, 4, 5
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " ");
		}
		System.out.println();
		
		// 문제 2) 1부터 10까지 반복해, 5~9까지 출력
		// 정답 2) 5, 6, 7, 8, 9
		for (int i = 1; i <= 10; i++) {
			if (5 <= i && i <= 9) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// 문제 3) 1부터 10까지 반복해 6~3까지 출력
		// 정답 3) 6, 5, 4, 3
		for (int i = 10; i >= 1; i--) {
			if (3 <= i && i <= 6) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// 문제 4) 1부터 10까지 반복해 3미만 7이상 출력
		// 정답 4) 1, 2, 7, 8, 9, 10
		for (int i = 1; i <= 10; i++) {
			if (i < 3 || 7 <= i) {
				System.out.print(i);
			}
		}

	}

}
