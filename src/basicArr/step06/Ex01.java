package basicArr.step06;

import java.util.Scanner;

/*
 * # 숫자이동[1단계]
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 */
//1023
public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] game = { 0, 0, 2, 0, 0, 0, 0 };

		int player = 0;

		// 질문: 인덱스를 고정으로 두고 i++ 하거나, while문에 안에 첫번째 for문에 player = i를 두거나 -> 변수의 활용을 중점으로 코딩하기
		// for (int i = 0; i < 7; i++) {
		// if (game[i] == 2) {
		// player = i;
		// }
		// }

		boolean run = true;
		while (run) {

			for (int i = 0; i < 7; i++) {
				if (game[i] == 2) {
					player = i;
					System.out.print("옷 ");
				} else {
					System.out.print(game[i] + " ");
				}
			}
			System.out.println();

			System.out.print("캐릭터를 이동[왼쪽(1), 오른쪽(2)]: ");
			int dir = sc.nextInt(); // direction

			if (dir == 1) {
				if (player - 1 >= 0) {
					game[player - 1] = 2;
					game[player] = 0;
//					player -= 1;
				} else {
					System.out.println("세상의 끝에 도달했습니다.");
				}

			} else if (dir == 2) {
				if (player + 1 < 7) {
					game[player + 1] = 2;
					game[player] = 0;
//					player += 1;
				} else {
					System.out.println("세상의 끝에 도달했습니다.");
				}

			}

		}
	}
}
