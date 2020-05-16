package basicArr.step04;

import java.util.Random;
import java.util.Scanner;

/*
 * # 즉석복권
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 * 2. 아래 3종류의 복권의 당첨여부를 출력한다.
 */
// for문은 반복 횟수가 정해져 있을 때
// for(;;) {} //for문 무한반복
// while문은 무한반복일 경우 사용
public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] lotto1 = { 0, 0, 7, 7, 7, 0, 0, 0 };
		int[] lotto2 = { 7, 0, 7, 7, 0, 0, 0, 0 };
		int[] lotto3 = { 7, 0, 7, 7, 7, 0, 7, 0 };

		int allCnt = 0;

		boolean run = true;
		while (run) {

			// 복권들의 결과 마지막에 종료 후 당첨된 갯수 출력
			System.out.println("[1]번복권 결과확인");
			System.out.println("[2]번복권 결과확인");
			System.out.println("[3]번복권 결과확인");

			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			if (sel == 1) {
				int check = -1;
				int cnt = 0;
				for (int i = 0; i < 8; i++) {
					if (lotto1[i] == 7) {
						cnt += 1;
						if (cnt == 3) {
							check = 1;
						}
					} else {
						cnt = 0;
					}
				}
				if (check == 1) {
					System.out.println("당첨");
					allCnt += 1;
				} else {
					System.out.println("꽝");
				}

			} else if (sel == 2) {
				int check = -1;
				int cnt = 0;
				for (int i = 0; i < 8; i++) {
					if (lotto2[i] == 7) {
						cnt += 1;
						if (cnt == 3) {
							check = 1;
						}
					} else {
						cnt = 0;
					}
				}
				if (check == 1) {
					System.out.println("당첨");
					allCnt += 1;
				} else {
					System.out.println("꽝");
				}

			} else if (sel == 3) {
				int check = -1;
				int cnt = 0;
				for (int i = 0; i < 8; i++) {
					if (lotto3[i] == 7) {
						cnt += 1;
						if (cnt == 3) {
							check = 1;
						}
					} else {
						cnt = 0;
					}
				}
				if (check == 1) {
					System.out.println("당첨");
					allCnt += 1;
					run = false;
					System.out.println("총 당첨된 복권: " + allCnt); // 계속 반복되면 갯수가 정확하지 않기 때문에 마지막 복권 결과이면 반복문 빠져나옴
				} else {
					System.out.println("꽝");
					allCnt += 1;
					run = false;
					System.out.println("총 당첨된 복권: " + allCnt);
				}
			}

		}

	}

}
