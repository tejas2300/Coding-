class RotateArray {
	void leftRotate(int a[], int d, int n) {
		for (int j = 0; j < d; j++) {
			leftRotateByOne(a, n);
		}

	}

	void leftRotateByOne(int b[], int k) {
		int i, temp;
		temp = b[0];
		for (i = 0; i < k - 1; i++) {
			b[i] = b[i + 1];

		}
		b[k - 1] = temp;
	}

	void printArray(int c[], int l) {
		for (int i = 0; i < l; i++) {
			System.out.print(c[i] + " ");
		}
	}

	public static void main(String[] args) {
		RotateArray r = new RotateArray();
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		r.leftRotate(arr, 3, 6);
		r.printArray(arr, 6);
	}
}