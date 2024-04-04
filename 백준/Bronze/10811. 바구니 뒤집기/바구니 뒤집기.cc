#include <iostream>
using namespace std;

int main() {
	int N, M;
	cin >> N >> M;
	int* arr = new int[N + 1];

	for (int i = 0; i < N; i++) {
		arr[i] = i + 1;
	}
	int a, b;
	for (int i = 0; i < M; i++) {
		cin >> a >> b;
		if (b - a <= 1) {
			swap(arr[a - 1], arr[b - 1]);
		}
		else {
			//역순으로 출력
			int left = a - 1;
			int right = b - 1;
			for (int j = 0; j <= (b-a)/2 ; j++) {
				swap(arr[left+j], arr[right-j]);
			}
		}
	}
	for (int i = 0; i < N; i++) {
		cout << arr[i] << " ";
	}
	delete[] arr;
	return 0;

}
static void swap(int num1, int num2) {
	int temp = 0;
	temp = num1;
	num1 = num2;
	num2 = temp;
};

 