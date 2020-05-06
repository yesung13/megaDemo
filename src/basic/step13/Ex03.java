package basic.step13;

import java.util.Random;
import java.util.Scanner;

/*
 * # 연산자 기호 맞추기 게임
 * 1. 1~10 사이의 랜덤 숫자 2개를 저장한다.
 * 2. 1~4 사이의 랜덤 숫자 1개를 저장한다.
 * 3. 위 숫자는 연산자 기호에 해당된다.
 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지
 * 4. 사용자는 연산자 기호를 맞추는 게임이다.
 * 예) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    정답 : 2번
 */

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int num1 = ran.nextInt(10) + 1;
		int num2 = ran.nextInt(10) + 1;
		int num3 = 0;
		int operation = ran.nextInt(4) + 1;

		
		if (operation == 1) {
			num3 = num1 + num2;
		} else if (operation == 2) {
			num3 = num1 - num2;
		} else if (operation == 3) {
			num3 = num1 * num2;
		} else if (operation == 4) {
			num3 = num1 % num2;
		}
		
		System.out.println(num1 + " ? " + num2 + " = " + num3);
		System.out.println("1.(+) 2.(-) 3.(*) 4.(%)");
		System.out.print("연산자를 선택하세요: ");
		int answer = sc.nextInt();
		
		if(answer == operation) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
		

	}

}
