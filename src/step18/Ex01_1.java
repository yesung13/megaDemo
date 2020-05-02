package step18;

import java.util.Scanner;

/*
 * # 베스킨라빈스31
 * 1. p1과 p2가 번갈아가면서 1~3을 입력한다.
 * 2. br은 p1과 p2의 입력값을 누적해서 저장한다.
 * 3. br이 31을 넘으면 게임은 종료된다.
 * 4. 승리자를 출력한다.
 * 
 * 예) 
 * 1턴 : p1(2)	br(2)
 * 2턴 : p2(1)	br(3)
 * 3턴 : p1(3)	br(6)
 * ...
 */

// 3명일 경우에는 turn%3==0, turn%==1, turn%2==0 이런식으로 할 수 있다.
// 어려움
public class Ex01_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int p1 = 0;
		int p2 = 0;

		int br = 0;
		int turn = 0;

		boolean run = true;
		while (run) {
			if (turn % 2 == 0) {
				System.out.print("[p1차례]1~3입력: ");
				p1 = sc.nextInt();
				if (1 <= p1 && p1 <= 3) {
					br = br + p1;
					turn = turn + 1;
				} else {
					System.out.println("입력범위 오류");
				}

			} else if (turn % 2 == 1) {
				System.out.print("[p2차례]1~3입력: ");
				p2 = sc.nextInt();
				if (1 <= p2 && p2 <= 3) {
					br = br + p2;
					turn = turn + 1;
				} else {
					System.out.println("입력범위 오류");
				}
			}
			System.out.println("br = " + br);

			if (br >= 10) {
				if (turn % 2 == 0) {
					System.out.println("[p1 승리] WIN");
				} else if (turn % 2 == 1) {
					System.out.println("[p2 승리] WIN");
				}
				run = false;
				System.out.println("게임종료");
			}
		}

	}

}
