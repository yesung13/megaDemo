package basicArr.step09;

import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 삭제
 */
//8분
// 질문: temp 마지막 인덱스에 0을 남기는 이유? 또한 temp를 사용하는 이유?
public class Ex02_delete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 10, 20, 30, 40, 50 };
		int cnt = 5;

		boolean run = true;
		while (run) {

			System.out.println("[2]삭제");

			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			if (sel == 2) {

				int delIdx = -1;

				System.out.print("삭제할 값 입력 : ");
				int data = sc.nextInt();

				for (int i = 0; i < cnt; i++) {
					if (arr[i] == data) {
						delIdx = i;
					}
				}

				if (delIdx == -1) {
					System.out.println("입력하신 값이 존재하지 않습니다.");
				} else {
					int temp[] = new int[5];
					int tempIdx = 0;

					for (int i = 0; i < cnt; i++) {
						if (i != delIdx) {
							temp[tempIdx] = arr[i];
							tempIdx += 1;
						}
					}

					for (int i = 0; i < cnt; i++) {
						arr[i] = temp[i];
						System.out.print(arr[i] + " ");
					}
					System.out.println();

					cnt -= 1; // 추가할때 생긴 공간을 삭제
				}

			}

		}

	}

}
