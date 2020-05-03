package step18;

/*
 * # 369게임[2단계]
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 */

public class Ex02 {
	public static void main(String[] args) {

		int i = 1;
		while (i <= 50) {

			// 예)
			// 6(십의 자리가 3의 배수로 취급할 가능성이 있어 x != 0)
			// 30(일의 자리가 3의 배수로 취급될 가능성이 있어 y != 0)

			int x = i / 10; // x = 0
			int y = i % 10; // y = 6

			int cnt = 0;
			if (x == 3 || x == 6 || x == 9) { //369가 두번씩 들어가는 경우를 위한 조건문
				cnt = cnt + 1;
			}
			if (y == 3 || y == 6 || y == 9) {
				cnt = cnt + 1;
			}

			// if (x != 0 && x % 3 == 0) { // 0 % 3 == 0
			// cnt = cnt + 1;
			// }
			// if (y != 0 && y % 3 == 0) { // 6 % 3 == 0
			// cnt = cnt + 1;
			// }

			if (cnt == 2) {
				System.out.println(i+" (짝짝)");
			} else if (cnt == 1) {
				System.out.println(i+" (짝)");
			} else {
				System.out.println(i);
			}

			i += 1;

		}

	}

}
