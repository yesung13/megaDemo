package step13;

import java.util.Scanner;

/*
 * # 지하철 요금 계산
 * 1. 이용할 정거장 수를 입력받는다.
 * 2. 다음과 같이 정거장 수에 따라 요금이 정산된다.
 * 3. 요금표
 * 1) 1~5	: 500원
 * 2) 6~10	: 600원
 * 3) 11,12 : 650원 (10정거장이후는 2정거장마다 50원추가)
 * 4) 13,14 : 700원 (10정거장이후는 2정거장마다 50원추가)
 * 5) 15,16 : 750원 (10정거장이후는 2정거장마다 50원추가)
 * ... 
 */

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("목적지 입력: ");
		int station = sc.nextInt();
		int fare = 0; // 요금

		if (0 < station && station <= 5) {
			fare = 500;
		} else if (6 <= station && station <= 10) {
			fare = 600;

		} else {
			if (station % 2 == 1) {
				fare = 600;
				int add = (station - 10) / 2 * 50;
				fare = fare + add + 50;
			} else if (station % 2 == 0) {
				fare = 600;
				int add = (station - 10) / 2 * 50;
				fare = fare + add;
			}
		}

		System.out.println("요금 : " + fare);

	}

}
