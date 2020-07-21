package basicArr.step09;

import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 추가
 */
// 0930
public class Ex01_update1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 10, 20, 0, 0, 0 };
		int cnt = 2;

		int idx = 0;
		boolean run = true;
		while (run) {

			for (int i = 0; i < cnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();

			if (cnt >= 5) {
				System.out.println("종료");
				break;
			}

			System.out.println("[1]추가");

			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			if (sel == 1) {

				System.out.print("추가할 값 입력 : ");
				int data = sc.nextInt();
				cnt += 1;
				for (int i = 0; i < cnt; i++) {
					if (arr[i] == 0) {
						arr[i] = data;
					}
				}
				System.out.println();

			}
		}

	}

}
