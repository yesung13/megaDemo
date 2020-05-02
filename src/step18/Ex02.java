package step18;

import java.util.Random;

/*
 * # 369게임[2단계]
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 */

public class Ex02 {
	public static void main(String[] args) {
		Random ran = new Random();

		int range = 0;

		boolean run = true;
		while (run) {
			int rNum = ran.nextInt(50) + 1;
			int x = rNum / 10;

			System.out.println("랜덤숫자: " + rNum);

			if (x == 3 || x == 6 || x == 9) {
				System.out.println("짝");
			} else {
				System.out.println(rNum);
			}
			run = false;
			System.out.println("게임종료");

		}

	}

}
