package buoi2;

public class function {

	static void inputdata(int arr[], int number) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = number;
		}
		// Sử dụng vòng lặp để in từng phần tử của mảng
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(); // Xuống dòng sau khi in xong mảng
	}

	public static void main(String[] args) {
		int arr[] = new int[6];
		inputdata(arr, 4);
	}
}
