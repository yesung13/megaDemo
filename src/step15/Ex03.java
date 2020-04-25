package step15;
//# 반복문 기본문제[2단계]

public class Ex03 {

	public static void main(String[] args) {
		// 문제1) 1~5까지의 합 출력
		// 정답 1) 15
		int i = 1;
		int sum = 0;
		while (i <= 5) {
			System.out.println("sum: " + sum + " i: " + i);
			sum = sum + i;
			System.out.println("sum+i: " + sum);
			i++;
		}
		System.out.println("정답: " + sum);

		// 문제2) 1~10까지 반복해 3미만 7이상만 출력
		// 정답2) 1, 2, 7, 8, 9, 10
		i = 1;
		while (i <= 10) {
			if (i < 3 || 7 <= i) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();

		// 문제3) 문제2의 조건에 맞는 수들의 합 출력
		// 정답3) 37
		i = 1;
		sum = 0;
		while (i <= 10) {
			if (i < 3 || 7 <= i) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println("정답: " + sum);

		// 문제4) 문제2의 조건에 맞는 수들의 개수 출력
		// 정답4) 6
		i = 1;
		int cnt = 0;
		while (i <= 10) {
			if (7 <= i || i < 3) {
				cnt = cnt + 1;
			}
			i++;
		}
		System.out.println("cnt = "+cnt);

	}

}
