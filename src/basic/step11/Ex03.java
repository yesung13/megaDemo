package basic.step11;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가위(0)바위(1)보(2) 게임[2단계]
 * 1. com은 0~2 사이의 랜덤한 숫자를 저장한다.
 * 2. me는 0~2 사이의 숫자를 입력받는다.
 * 3. com과 me를 비교해,
 * 		1) 비겼다.
 * 		2) 내가 이겼다.
 * 		3) 내가 졌다.			를 출력한다.
 */

public class Ex03 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		int com = ran.nextInt(3);
		System.out.print("가위(0)바위(1)보(2) 입력: ");
		int me = sc.nextInt();
		if (0 <= me && me <= 2) {

			if (com == me) {
				System.out.println("비겼다");
			}

			if (com < me) {
				System.out.println("내가 이겼다");
			}

			if (com > me) {
				System.out.println("내가 졌다");
			}
		}

		if (me >= 3) {
			System.out.println("잘못된 입력 값 입니다.");
		}

	}

}
