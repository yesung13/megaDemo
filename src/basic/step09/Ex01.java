package basic.step09;
/*
 * # 변수의 생명주기(Scope)
 */

// 강사님 설명 필요부분**

/*
 * # 변수의 종류
 * (1) 데이터 타입(종류)에 따른 분류
 * . 정수 : byte(1), short(2), int(4), long(8)
 * . 실수 : float(4), double(8)
 * . 문자 : char(2)
 * . 논리형 : boolean(1)
 * 
 * (2) 변수 선언 위치에 따른 분류
 * 1) 클래스 영역
 * 		- static 변수(클래스 변수)
 * 		- non-static 변수(인스턴스 변수)
 * 2) 메서드 영역
 * 		- 지역 변수
 */

public class Ex01 
{
	// 클래스 영역
	
	public static void main(String[] args) 
	{
		// 메서드 영역
		
		int x = 10; // 지역변수(local variable)

		if (true) {
			System.out.println("x = " + x);
			int y = 20; // lv(local variable), 지역변수
			System.out.println("y = " + y);
		}
		// System.out.println("y = " + y); // y는 지역변수이므로 에러 발생
	}

}
























