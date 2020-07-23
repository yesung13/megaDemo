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
			System.out.println("==CUD==");
			for (int i = 0; i < cnt; i++) {
				System.out.print(arr[i] + " ");

			}
			System.out.println("\n");

			System.out.println("[1]추가");
			System.out.println("[2]삭제");
			System.out.println("[3]삽입");
			System.out.println("[0]종료");

			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			if (sel == 1) {

				System.out.print("추가할 값 입력 : ");
				int data = sc.nextInt();
				arr[cnt] = data;
				cnt += 1;

			} else if (sel == 2) {

				System.out.print("삭제할 값 입력 : ");
				int data = sc.nextInt();
				int delIdx = -1;

				for (int i = 0; i < cnt; i++) {
					if (arr[i] == data) {
						delIdx = i;
					}
				}

				if (delIdx == -1) {
					System.out.println("입력하신 값이 존재하지 않습니다.");
				} else {
					int[] temp = new int[5];
					int tempIdx = 0;
					for (int i = 0; i < cnt; i++) {

						if (i != delIdx) {
							temp[tempIdx] = arr[i];
							tempIdx += 1;
						}
					}

					for (int i = 0; i < cnt; i++) {
						arr[i] = temp[i];
					}

					cnt -= 1;
				}

			} else if (sel == 3) {

				System.out.print("삽입할 위치 입력 : ");
				int idx = sc.nextInt();
				if (cnt < idx || idx < 0) {
					System.out.println("해당 위치에 삽입할 수 없습니다");
					continue;
				}

				System.out.print("삽입할 값 입력 : ");
				int data = sc.nextInt();

				int[] temp = new int[cnt + 1];
				int tempIdx = 0;

				for (int i = 0; i < cnt + 1; i++) {
					if (idx != i) {
						temp[i] = arr[tempIdx];
						tempIdx += 1;
					}
				}

				for (int i = 0; i < cnt + 1; i++) {
					arr[i] = temp[i];
				}
				arr[idx] = data;
				cnt += 1;

			} else if (sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}

		}

	}
}
