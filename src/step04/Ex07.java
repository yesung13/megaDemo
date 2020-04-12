package step04;

/*
 * step01~04 정리
 * 
 */
public class Ex07 {
	public static void main(String[] args) {

		// 11:25 ~ 11:45(20분). 최소 화폐매수 10분

		int a = 10;
		a = 20;

		// 문제 1) 값 교체하기
		int x = 10;
		int y = 20;

		int temp = x; // temporary(임시의~)
		x = y; // x=20
		y = temp; // y=10
		System.out.printf("x=%d, y=%d\n", x, y);

		// 문제 2) 과락
		int kor = 100;
		int eng = 100;
		int math = 49;

		int total = kor + eng + math;
		double avg = total / 3.0d;
		System.out.println(avg >= 60 && kor >= 60 && eng >= 60 && math >= 60);

		// 문제 3) 최소 화폐매수 구하기
		// 정답 3) 5천원(1장), 1천원(3장), 5백원(1개), 1백원(2개)
		int money = 8700;

		int fiveThou = money / 5000;
		int oneThou = (money % 5000) / 1000;
		int fiveHund = (money % 1000) / 500; // 700 / 500
		int oneHund = (money % 500) / 100;
		System.out.println("5천원:" + fiveThou + "장\t" + "1천원:" + oneThou + "장\t" + "5백원:" + fiveHund + "개\t" + "1백원:"
				+ oneHund + "개\t");
	}
}
