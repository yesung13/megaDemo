package basicArr.step09;

import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 삽입
 */
//1059
public class Ex03_insert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = { 10, 20, 0, 0, 0 };
		int cnt = 2;

		boolean run = true;
		while (run) {

			for (int i = 0; i < cnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();

			System.out.println("[3]삽입");

			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			if (sel == 3) {
				if (cnt == 5) {
					System.out.println("더 이상 삽입할 수 없습니다.");
					continue;
				}

				System.out.print("삽입할 위치 입력 : ");
				int idx = sc.nextInt();

				if (cnt < idx || idx < 0) { // db 테이블에서 시퀀스 넘버랑 동일하다고 생각하면 된다.
					System.out.println("해당 위치에는 삽입할 수 없습니다.");
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

			}
		}

	}
}
