#include <iostream>
using namespace std;

int main() {
	int M, N;
	cin >> M >> N;
	int a, b;
	int boxArr[101] = {};
	for (int i = 0; i < M; i++) {
		boxArr[i] = i+1;
	}
	for (int i = 0; i < N; i++) {
		cin >> a >> b;
		swap(boxArr[a - 1], boxArr[b - 1]);
	}
	for (int i = 0; i < M; i++) {
		cout << boxArr[i] << " ";
	}
	return 0;

}
void swap(int num1, int num2) {
	int temp = 0;

	temp = num1;
	num1 = num2;
	num2 = temp;
};

