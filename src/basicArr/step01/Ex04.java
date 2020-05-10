package basicArr.step01;

public class Ex04 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int temp1[] = new int[5];
		int temp2[] = new int[5];
		int temp3[] = new int[5];

		// 문제1) arr 의 값을 temp1 에 복사후 출력
		// temp1 ==> {10, 20, 30, 40, 50}
		System.out.println(">>문제1");
		for (int i = 0; i < 5; i++) {
			temp1[i] = arr[i];
			System.out.print(temp1[i] + " ");

		}

		// 문제2) arr 의 값의 2배를 temp2에 복사후 출력
		// temp2 ==> {20, 40, 60, 80 , 100}
		System.out.println("\n>>문제2");
		for (int i = 0; i < 5; i++) {
			temp2[i] = arr[i] * 2;
			System.out.print(temp2[i] + " ");
		}

		// 문제3) arr 의 값에 i를 더한값을 temp3 에 복사후 출력
		// temp3 ==> {10,21,32,43,54}
		System.out.println("\n>>문제3");
		for (int i = 0; i < 5; i++) {
			temp3[i] = arr[i] + i;
			System.out.print(temp3[i] + " ");
		}

	}

}
