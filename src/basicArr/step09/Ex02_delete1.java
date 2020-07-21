package basicArr.step09;

import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 삭제
 */
//8분
public class Ex02_delete1 {

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
				for (int i = 0; i < cnt; i++) {
					System.out.print(arr[i] + " ");

				}
				System.out.println("\n");

				System.out.print("삭제할 값 입력 : ");
				int data = sc.nextInt();

				for (int i = 0; i < cnt; i++) {
					if (arr[i] == data) {
						arr[i] = 0;
						System.out.println("삭제 완료\n");
					}
				}

			}

		}

	}

}
