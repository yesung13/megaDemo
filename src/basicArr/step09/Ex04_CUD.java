package basicArr.step09;

import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 최종
 * 1) 추가
 * 2) 삭제
 * 3) 삽입
 */

public class Ex04_CUD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = { 10, 20, 0, 0, 0 };
		int cnt = 2;

		boolean run = true;
		while (run) {

			System.out.println("[1]추가");
			System.out.println("[2]삭제");
			System.out.println("[3]삽입");
			System.out.println("[0]종료");

			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			if (sel == 1) {

				System.out.print("추가할 값 입력 : ");
				int data = sc.nextInt();

			} else if (sel == 2) {

				System.out.print("삭제할 값 입력 : ");
				int data = sc.nextInt();

			} else if (sel == 3) {

				System.out.print("삽입할 위치 입력 : ");
				int idx = sc.nextInt();

				System.out.print("삽입할 값 입력 : ");
				int data = sc.nextInt();

			} else if (sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}

		}

	}
}
