package step05;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 문제 1) 숫자 2개를 입력받아, 합 출력
		System.out.println("두개의 정수 입력: ");
		int num1 = sc.nextInt(), num2 = sc.nextInt();
		System.out.println("두 수의 합: " + (num1 + num2));
		System.out.println("=========================");

		// 문제 2) 숫자 1개를 입력받아, 홀수이면 true 출력
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		System.out.println(num + "은(는) " + (num % 2 == 1) + "(홀수)입니다.");
		System.out.println("=========================");

		// 문제 3) 성적을 입력받아, 60점 이상이고 100점 이하이면 true 출력
		System.out.println("성적 입력: ");
		int score = sc.nextInt();
		System.out.println(score >= 60 && score <= 100);

	}

}
