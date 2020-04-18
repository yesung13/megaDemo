package step11;

import java.util.Random;
import java.util.Scanner;

/*
 * # 홀짝 게임
 * 1. 1~100사이의 랜덤 숫자를 저장한다.
 * 2. 저장된 랜덤 숫자를 보여주고,
 * 3. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.
 */


// 정답
public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int rNum = ran.nextInt(100) + 1;

		System.out.println("문제[ " + rNum + " ]");
		System.out.println("1.홀수");
		System.out.println("2.짝수");

		System.out.print("번호를 선택하세요 : ");
		int choice = scan.nextInt();

		
		  /* 
		  * 비교연산자 &&를 사용하지 않고 이중if을 사용하여 표현할 수
		  * 있는 것을   나타내기 위한 로직.
		  */
		 
		if (choice == 1) {
			if (rNum % 2 == 1) {
				System.out.println("정답!");
			}
			if (rNum % 2 == 0) {
				System.out.println("오답!");
			}
		}
		if (choice == 2) {
			if (rNum % 2 == 0) {
				System.out.println("정답!");
			}
			if (rNum % 2 == 1) {
				System.out.println("오답!");
			}
		}

	}

}
