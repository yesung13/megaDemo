package step16;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 1. 정답을 맞추면 게임은 종료된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 */

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int answer = ran.nextInt(50) + 1;
		int score = 100;
		int range = 0;

		System.out.println("범위: 1~50");
		System.out.println("문제: " + answer);

		if (0 < range || range <= 50) {
			int run = 1;
			while (run == 1) {
				int myAnswer = sc.nextInt();

				if (answer == myAnswer) {
					System.out.println("정답");
					run = 0;
				} else {
					score = score - 5;
					// System.out.println("오답");
					if (score != 0) {
						if (answer > myAnswer) {
							System.out.println("Up");
						} else if (answer < myAnswer) {
							System.out.println("Down");
						}
					} else if (score == 0) {
						System.out.println("미션 실패");
						run = 0;
					}

				}
			}
			System.out.println("점수: " + score);
			
		} else if (range > 51) {
			System.out.println("잘못된 입력값입니다.");
		}

	}

}
