package basic.step04;

public class Ex02 {

	public static void main(String[] args) {

		// 예) 점수가 60점 이상이면 true 출력
		int score = 30;
		System.out.println(score >= 60);

		// 문제1) 3의 배수이면 true 출력
		// 힌트1) 숫자 % 3 == 0 (3의 배수)
		int num = 9;
		System.out.println(num % 3 == 0);

		// 문제2) 짝수이면 true 출력
		// 힌트2) 숫자 % 2 == 0 (짝수)
		// 힌트2) 숫자 % 2 == 1 (홀수)
		int num2 = 2;
		System.out.println("홀수:" + (num2 % 2 == 0));
		System.out.println("짝수:" + (num2 % 2 == 1));

		// 문제3)아래돈중 1000원짜리 이상화폐를 제외한
		//1000원짜리가 3장 이상이면 true 출력

		int money = 178600;
        System.out.println((money % 5000 / 1000) >= 3);


	}

}
