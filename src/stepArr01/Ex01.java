package stepArr01;

// 변수    : 값 한개 저장
// 배열    : (같은 종류의)값 여러개 저장
// 클래스 : (여러 종류의)값 여러개 저장

public class Ex01 {
	public static void main(String[] args) {
		
		int num = 10;				// 변수
		
		//          힙 메모리에(new) 정수(int)형 방 3개를 생성해줘!
		int[] arr = new int[3];		// 배열
		
		System.out.println(arr);
		System.out.println(arr.length);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		// java.lang.ArrayIndexOutOfBoundsException: 3
		// System.out.println(arr[3]);
		

//		int[] scores = new int[3];
//		scores[0] = 11;
//		scores[1] = 23;
//		scores[2] = 54;
		
		// 배열의 축약형		
		int[] scores = {11, 23, 54};
	}
}
