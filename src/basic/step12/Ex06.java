package basic.step12;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가운데 숫자 맞추기 게임
 * 1. 150~250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 * 예)
 * 		249		: 4
 */

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int rNum = ran.nextInt(101) + 150; // [0 ~ 101] + 150
		System.out.println("랜덤 숫자 게임");
		int answer = rNum % 100 / 10;

		System.out.print("랜덤숫자의 가운데 숫자 입력\n" + rNum + "\t: ");
		int myAnswer = sc.nextInt();

		if (answer == myAnswer) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("실패입니다.");
		}

	}
}
