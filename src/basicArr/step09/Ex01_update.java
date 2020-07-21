package basicArr.step09;

import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 추가
 */

/*
 * # break문 와 continue문
 * 1. break문 : 자신이 포함된 가장 가까운 반복문을 벗어남
 * 2. continue문
 * 	1) 반복문 내에서만 사용
 *  2) 반복문의 끝으로 이동하여 다음 반복으로 넘어감
 *  3) for문의 경우 증감식으로 이동!
 *  4) while문의 경우 조건식으로 이동!
 * 
 */
//30분
public class Ex01_update {

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

			System.out.println("[1]추가");

			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			if (sel == 1) {

				if (cnt == 5) {
					System.out.println("더 이상 추가할 수 없습니다.");
					continue;
				}

				System.out.print("추가할 값 입력 : ");
				int data = sc.nextInt();

				arr[cnt] = data;
				cnt += 1;
			}
		}

	}

}
