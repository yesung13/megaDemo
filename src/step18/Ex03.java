package step18;

import java.util.Scanner;

/*
 * # 소수찾기[1단계]
 * 1. 소수란, 1과 자기자신으로만 나눠지는 수
 * 2. 예) 2, 3, 5, 7, 11, 13, ..
 * 3. 힌트
 * 1) 해당 숫자를 1부터 자기자신까지 나눈다.
 * 2) 나머지가 0일 때마다 카운트를 센다.
 * 3) 그 카운트 값이 2이면 소수이다.
 * 4) 6/1 6/2 6/3 6/4 6/5 6/6	cnt=4	소수x
 * 
 * 정수 한 개를 입력받아, 해당 숫자가 소수인지 아닌지 판별한다.
 * 
 * cnt가 2일때 true인 이유는 소수는 자기 자신으로 나눴을 때와 1로 나눴을때 나머지가 0이기 때문이다.
 * 예) 5%1 == 0, 5%5 == 0 => cnt==2
 */

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자입력: ");
		int num = sc.nextInt();

		int cnt = 0;

		int i = 1;
		while (i <= num) {

			if (num % i == 0) {
				cnt = cnt + 1;
			}
			i += 1;
		}
		System.out.println("cnt = " + cnt);
		if (cnt == 2) {
			System.out.println("소수");
		} else {
			System.out.println("소수X");
		}
	}

}
