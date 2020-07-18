package basicArr.step07;

import java.util.Scanner;

import javax.xml.bind.ParseConversionEvent;

/* 
 * # 틱택토
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] game = new int[9];

		int turn = 0;
		int win = 0;
		boolean run = true;
		while (run) {
			System.out.println("===틱택토===");
			for (int i = 0; i < 9; i++) {
				if (game[i] == 0) {
					System.out.print("[" + i + "]");
				} else if (game[i] == 1) {
					System.out.print("[X]");
				} else if (game[i] == 2) {
					System.out.print("[O]");
				}
				if (i % 3 == 2) {
					System.out.println();
				}
			}

			if (win == 1) {
				System.out.println("[p1]승리");
				break;
			} else if (win == 2) {
				System.out.println("[p2]승리");
				break;
			}

			if (turn % 2 == 0) {
				System.out.print("[p1]인덱스 입력:");
				int idx = sc.nextInt();

				if (game[idx] == 0) {
					game[idx] = 1;
					turn += 1;
				}
			} else if (turn % 2 == 1) {
				System.out.print("[p2]인덱스 입력: ");
				int idx = sc.nextInt();
				if (game[idx] == 0) {
					game[idx] = 2;
					turn += 1;
				}
			}

			// 가로 검사
			for (int i = 0; i < 3; i += 3) {
				if (game[i] == 1 && game[i + 1] == 1 && game[i + 2] == 1) {
					win = 1;
				} else if (game[i] == 2 && game[i + 1] == 2 && game[i + 2] == 1) {
					win = 2;
				}
			}

		}

	}

}
