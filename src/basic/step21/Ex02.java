package basic.step21;

import java.util.Scanner;

/*
 * # 보조제어문
 * 1. break
 * . 반복문 1개를 즉시 종료
 * 2. continue
 * . 반복문의 조건식으로 바로 이동
 * . 아래식을 실행시키고 싶지 않을 때 사용
 */

public class Ex02 {

	public static void main(String[] args) {
		// break
		for (int i = 0; i < 15; i++) {
			if (i > 3) {
				break;
			}
			System.out.println(i);
		}

		// continue
		Scanner sc = new Scanner(System.in);

		boolean run = true;
		while (run) {
			System.out.println("1.사과");
			System.out.println("2.바나나");
			System.out.println("3.딸기");

			System.out.print("메뉴를 선택: ");
			int sel = sc.nextInt();

			if (sel != 1 && sel != 2 && sel != 3) {
				System.out.println("잘못입력하셨습니다\n다시 입력하세요");
				continue;
			}

			if (sel == 1) {

			} else if (sel == 2) {

			} else if (sel == 3) {

			}
		}
	}

}
