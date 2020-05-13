package basicArr.step02;

/*
 * # 학생성적관리 프로그램[4단계] : 1등학생
 */
//15분
public class Ex04 {

	public static void main(String[] args) {

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
		int highScore = 0;
		int maxIdx = 0;

		for (int i = 0; i < 5; i++) {
			if (highScore < scores[i]) {
				highScore = scores[i];
				maxIdx = i;
			}
		}

		System.out.println("[1등] " + hakbuns[maxIdx] + "번 성적: " + highScore + "점");

	}

}
