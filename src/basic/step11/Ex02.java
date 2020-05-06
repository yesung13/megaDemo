package basic.step11;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[2단계]
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 랜덤하게 저장한다.
 * 2. 저장된 숫자를 토대로 구구단 문제를 출력한다.
 * 예)	3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */

//10분
public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		/*
		 * 구구단은 기본으로 2단부터 1~9까지 구하는 문제가 많아서 아래 처럼 표현되었다.
		 */
		int num1 = ran.nextInt(8) + 2;
		int num2 = ran.nextInt(9) + 1;

		System.out.println("문제: " + num1 + "x" + num2 + "= ?");

		int result = num1 * num2;

		System.out.print("답: ");
		int myResult = sc.nextInt();

		if (result == myResult) {
			System.out.println("정답!");
		}

		if (result != myResult) {
			System.out.println("땡!");
		}
	}

}
