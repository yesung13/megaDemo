package basicArr.step03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1001, 20, 1002, 45, 1003, 54 };

		int idx = 0;

		for (int i = 0; i < 6; i++) {
			System.out.println("[" + i + "]" + arr[i] + " ");
		}

		// 학번과 점수가 한쌍이다 1001:20 , 1002:45 , 1003:54

		// 문제1) 학번을 입력하면 점수 출력
		System.out.println("\n>>>문제1");
		System.out.print("학번 입력: ");
		int hakbun = sc.nextInt();

		int score = 0;

		if (hakbun / 1000 > 0) {
			for (int i = 0; i < 6; i++) {
				if (arr[i] == hakbun) {
					hakbun = arr[i];
					i = i + 1;
					score = arr[i];
				}
			}
			System.out.println("학번: " + hakbun + " 점수: " + score);

		} else {
			System.out.println("등록되지 않은 학번입니다.");
		}

		// 문제2) 점수를 입력하면 학번 출력
		System.out.println("\n>>>문제2");
		System.out.print("점수 입력: ");

		score = sc.nextInt();

		if (score / 100 <= 1) {
			for (int i = 0; i < 6; i++) {
				if (arr[i] == score) {
					score = arr[i];
					idx = i; // 무한루프에 빠지므로 새로운 변수에 i값 저장
					idx = idx - 1;
					hakbun = arr[idx];
				}
			}
			System.out.println("학번: " + hakbun + " 점수: " + score);
		} else {
			System.out.println("등록되지 않은 학번입니다.");
		}

	}

}
