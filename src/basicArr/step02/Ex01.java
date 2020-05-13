package basicArr.step02;
/*
 * # 학생성적관리 프로그램[1단계] : 학생점수
 */

import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		Random ran = new Random();

		int[] arr = new int[5];

		int tot = 0; // 총합
		double avg = 0.0d; // 평균

		// 문제1) arr배열에 1~100점 사이의 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47
		System.out.println("문제1>>");
		for (int i = 0; i < 5; i++) {
			arr[i] = ran.nextInt(100) + 1;
			tot = tot + arr[i];
			System.out.println("[" + i + "]번째 학생 점수: " + arr[i]);
		}

		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)
		System.out.println("\n문제2>>");
		avg = tot / 5.0;
		System.out.print("총합: " + tot);
		System.out.print("\n평균:" + avg);

		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명
		int cnt = 0;
		System.out.println("\n\n문제3>>");
		for (int i = 0; i < 5; i++) {
			if (arr[i] >= 60) {
				cnt = cnt + 1;
			}
		}
		System.out.println("[합격생] 총 " + cnt + "명");

	}

}
