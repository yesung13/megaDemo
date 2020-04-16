package step09;

import java.util.Scanner;

/*
 * # 최대값 구하기[1단계]
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자1를 입력하세요: ");
		int num1 = sc.nextInt();
		
		System.out.print("숫자2를 입력하세요: ");
		int num2 = sc.nextInt();
		
		System.out.print("숫자3를 입력하세요: ");
		int num3 = sc.nextInt();


		int maxNum = num1;
		if(maxNum < num2) {
			maxNum = num2;
		}
		
		if(maxNum < num3) {
			maxNum = num3;
		}
		
		System.out.println("최대값 = "+maxNum);
	}
}
