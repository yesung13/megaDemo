package step11;

import java.util.Random;
import java.util.Scanner;

/*
 * # 홀짝 게임
 * 1. 1~100사이의 랜덤 숫자를 저장한다.
 * 2. 저장된 랜덤 숫자를 보여주고,
 * 3. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.
 */

// 직접풀이
public class Ex01_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int rNum = ran.nextInt(100) + 1; //[0 ~ 100]

		System.out.println("랜덤 숫자: " + rNum);

		System.out.println("1.홀수");
		System.out.println("2.짝수");

		System.out.print("번호를 선택하세요 : ");
		int choice = sc.nextInt();

		// 홀수
		if (rNum % 2 == 1 && choice == 1) {
			System.out.println(rNum + " 은(는) 홀수가 맞습니다");
		}
		if (rNum % 2 == 1 && choice == 2) {
			System.out.println(rNum + " 은(는) 홀수아닙니다. 짝수입니다.");
		}

		// 짝수
		if (rNum % 2 == 0 && choice == 2) {
			System.out.println(rNum + " 은(는) 짝수가 맞습니다");
		}
		
		if (rNum % 2 == 0 && choice == 1) {
			System.out.println(rNum + " 은(는) 짝수아닙니다. 홀수입니다.");
		}

	}

}
