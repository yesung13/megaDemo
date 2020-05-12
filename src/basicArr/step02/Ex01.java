package basicArr.step02;
/*
 * # 학생성적관리 프로그램[1단계] : 학생점수
 */

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		int score = 0; // 입력한 점수
		int cnt = 0; // 첫번째 for문 만큼의 수를 지정하여 평균값을 구해주기 위해 사용

		int pass = 0; // 합격자 수

		int sum = 0; // 총합
		double avg = 0.0d; // 평균

		// 문제1) arr배열에 1~100점 사이의 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47
		System.out.println("문제1>>");
		for (int i = 0; i < 5; i++) {
			System.out.print("[" + i + "]번째 학생 점수 입력: ");
			score = sc.nextInt();
			arr[i] = score;

			if (score >= 60) {
				pass += 1;
				System.out.println("[" + i + "]번째 학생 <합격>");
			} else {
				System.out.println("[" + i + "]번째 학생 <불합격>");
			}

			cnt = cnt + 1;
			sum = sum + arr[i];
		}

		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)
		System.out.println("\n문제2>>");
		
		avg = sum / (double) cnt; // 직접 숫자를 입력하는 대신 변수 형변환하여 소수점 출력 
		
		System.out.print("총점: " + sum);
		System.out.print("\n평균: " + avg);

		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명
		System.out.println("\n\n문제3>>");
		System.out.println("[합격자]: " + pass + "명");

	}

}
