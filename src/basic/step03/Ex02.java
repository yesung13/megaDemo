package basic.step03;

public class Ex02 {
	public static void main(String[] args) {

		// // 예) 현금이 1000원있다. 200원짜리 과자 구입 후, 잔돈 출력
		// int 현금 = 1000;
		// int 과자 = 200;
		// int 잔돈 = 현금 - 과자;
		// System.out.println("잔돈 = " + 잔돈 + "원");

		// 문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		int salary = 100; // 월급
		int beforeAnnualSalary = salary * 12; // 세전연봉
		int tax = beforeAnnualSalary / 10; // 세금
		int afterAnnualSalary = beforeAnnualSalary - tax; // 세후연봉

		System.out.println(afterAnnualSalary);

		//문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
		int score = 30 + 50 + 4;
		System.out.println("평균 : " + score / 3);

		//문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		int x = 3, y = 6;
		System.out.println("삼각형의 넓이 : " + (x * y) / 2);

		//문제4) 100초를 1분 40초로 출력
		int ss = 100 % 60;
		int mm = 100 / 60;
		System.out.println("100초 " + mm + "분" + ss + "초로 출력");

		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
		//정답5) 500원(1개), 100원(3개)  
		int bigCoin = 800 / 500;
		int smallCoin = (800 % 500) / 100;
		System.out.println("500원의 개수 : " + bigCoin);
		System.out.println("100원의 개수 : " + smallCoin);
	}

}