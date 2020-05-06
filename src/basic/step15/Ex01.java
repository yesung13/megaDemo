package basic.step15;
/*
 * # 반복문 while
 * 1. 반복문의 조건 3가지
 * 1) 초기식
 * 2) 조건식
 * 3) 증감식
 * 
 * 2. 구조
 * 초기식;
 * while(조건식){
 * 		조건식이 참일 동안 실행할 문장;
 * 		증감식;
 * }
 * 
 * 
 */

public class Ex01 {

	public static void main(String[] args) {

		// 예) 1~5까지 출력
		int i = 1; // 초기식
		while (i <= 5) { // 조건식
			System.out.println(i);
			i = i + 1; // 증감식
		}
	}

	/*
	 * 증감식 방식 
	 * i = i + 1;
	 * 1) i+= 1;
	 * 2) ++i (전위형)
	 * 3) i++; (후위형)
	 * 
	 */

}
