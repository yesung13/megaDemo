package basicArr.step04;

/*
 * 거꾸로저장
 */
public class Ex02 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int temp4[] = new int[5];

		// 문제1) arr의 값을 temp4에 거꾸로 복사후 출력
		// 예) temp4 ==> {50,40,30,20,10}
		// 힌트 : 아래

		int i = 0;
		int back = 4;
		// temp4[i] = arr[back];

		// 이동 : alt + 방향키
		for (int j = back; j >= 0; j--) {
			back = j;
			temp4[i] = arr[back];
			System.out.print(temp4[i] + " ");
			i = i + 1;
		}
		System.out.println();

		// System.out.println("거꾸로 출력");
		// System.out.print("temp4 ==> {");
		// for (i = back; i >= 0; i--) {
		// back = i;
		// temp4[i] = arr[back];
		// System.out.print(temp4[i] + " ");
		// }
		// System.out.println("}");

	}

}
