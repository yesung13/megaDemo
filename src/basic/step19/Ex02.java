package basic.step19;

import java.util.Random;

/*
 * # 랜덤학생
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 */

// 추후 랜덤으로 했을 경우 중복 점수를 처리하는 로직 필요
// 예) 공동 1등이 생길 수 있음.

public class Ex02 {

	public static void main(String[] args) {
		Random ran = new Random();

		double avg = 0.0d;
		int sum = 0;

		int passCnt = 0; // 60점 이상 합격자 수

		int highScore = 0; // 1등 점수
		int highCnt = 0; // 1등 순번

		int i = 1;
		while (i <= 5) {
			int score = ran.nextInt(100) + 1;
			System.out.println(i + "번째 학생 점수: " + score);

			sum = sum + score; // 총점을 구하기 위함

			if (score >= 60) { // 60점 이상의 합격자를 구하기 위함
				passCnt = passCnt + 1;
			}

			if (highScore < score) { // 1등을 구하기 위함. 중요 로직
				highScore = score;
				highCnt = i; // 1등의 순번 저장
			}

			i += 1;
		}
		avg = sum / 5.0d;

		System.out.println("총 점: " + sum + "점");
		System.out.println("총 평균: " + avg + "점");
		System.out.println("총 합격생: " + passCnt + "명");
		System.out.println();

		System.out.println("[1등]\n순번: " + highCnt + "번째 학생, " + "점수: " + highScore + "점");

	}

}
