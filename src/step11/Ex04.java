package step11;

/*
 * # if문
 * # (1)
 * if(조건식){
 * 		조건식이 true 일 때 실행할 문장;
 * }
 * 
 * # (2) 양자택일
 * if(조건식){
 * 		조건식이 true일 때 실행할 문장;
 * }else{
 *		조건식이 false일 때 실행할 문장;
 * }
 * 
 * # (3) 다중택일: 여러 조건문 중 true 경우 하나만 출력
 * if(조건식){
 * 		조건식이 true일 때 실행할 문장;
 * }else if{
 *		조건식이 true일 때 실행할 문장;
 * }else{
 * 		조건식이 false일 때 실행할 문장;
 * }
 * 
 */

public class Ex04 {
	public static void main(String[] args) {
	
//		if(10 == 10) {
//			System.out.println(10);
//		}
//		if(11 == 11) {
//			System.out.println(11);
//		}
//		
//		if(10 == 10) {
//			System.out.println(10);
//		}
//		else if(11 == 11) {
//			System.out.println(11);
//		}
		
		int score = 87;
		if(score >= 60) {
			System.out.println("합격생");
		}
		if(score < 60) {
			System.out.println("불합격생");
		}
		//---------------------------------------
		if(score >= 60) {
			System.out.println("합격생");
		}
		else {
			System.out.println("불합격생");
		}
		
		
		
	}
}
