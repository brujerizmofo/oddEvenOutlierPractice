package practice;

//not yet working
public class TestEvenOddOutlierMethod {
	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 5, 6, 8, 10, 12, 20 };
		int[] arr2 = { 1, 3, 5, 7, 6, 9, 11, 21 };
		System.out.println(evenOddOutlier(arr1));
		System.out.println(evenOddOutlier(arr2));
	}

	public static int evenOddOutlier(int[] arr) {
		int oddCount = 0;
		int evenCount = 0;
		int outOdd = 0;
		int outEven = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
				outEven = arr[i];
			}
			if (arr[i] % 2 != 0) {
				oddCount++;
				outOdd = arr[i];
			}

		}
		if (evenCount < oddCount) {
			return outEven;
		} else
			return outOdd;

	}
}
