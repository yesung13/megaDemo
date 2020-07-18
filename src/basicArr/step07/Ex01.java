package basicArr.step07;

import java.util.Random;
import java.util.Scanner;

/*
 * # 1 to 50[1단계] : 1 to 4
 * 1. arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
 * 2. 사용자는 1부터 순서대로 해당 위치 값을 입력한다.
 * 3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
 * 예)
 * 4 2 3 1
 * 입력 : 3
 * 4 2 3 9
 * 입력 : 1
 * 4 9 3 9
 * ...
 * 
 * 중복숫자 금지(1) 활용문제
 */

public class Ex01 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[4];
		int[] check = new int[4];

		int i = 0;
		while (i < 4) {
			int r = ran.nextInt(4);
			if (check[r] == 0) {
				check[r] = 1;
				arr[i] = r + 1;
				i += 1;
			}
		}

		int cnt = 1; // 포인트

		int j = 0;
		while (j < 4) {
			for (int k = 0; k < 4; k++) {
				System.out.print(arr[k] + " ");
			}
			System.out.println();

			System.out.print("입력[1~4]: ");
			int idx = sc.nextInt();

			// j는 답을 맞추지 못하면 무한 반복 실행
			if (arr[idx-1] == cnt) {
				arr[idx-1] = 9;
				cnt += 1;
				j += 1;
			}

		}

	}

}
