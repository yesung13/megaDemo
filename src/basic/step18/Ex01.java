package basic.step18;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int p1 = 0;
		int p2 = 0;

		int br = 0; // break
		int turn = 0;

		boolean run = true;
		while (run) {

			if (turn % 2 == 0) {
				System.out.print("[p1차례]1~3 입력 : ");
				p1 = sc.nextInt();
				br = br + p1;
				turn += 1;
			} else if (turn % 2 == 1) {
				System.out.print("[p2차례]1~3 입력 : ");
				p2 = sc.nextInt();
				br = br + p2;
				turn += 1;
			}
			System.out.println("br = " + br);

			if (br >= 31) {
				if (turn % 2 == 0) {
					System.out.println("[p1]승리");
				} else if (turn % 2 == 1) {
					System.out.println("[p2]승리");
				}
				run = false;
				System.out.println("게임 종료");
			}
		}

	}
}
