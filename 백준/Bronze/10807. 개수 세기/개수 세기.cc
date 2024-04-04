#include <iostream>
using namespace std;

int main() {
	int size;
	cin >> size;
	int* arr = new int[size]; //heap 영역에 메모리 할당 나중에 delete[] arr로 꼭 메모리를 해제 해주어야 함
	int n;
	int v;//정수 v
	int cnt = 0; // v와 같은 숫자 갯수
	for (int i = 0; i < size; i++) {
		cin >> n;
		arr[i] = n;
	}
	cin >> v;
	for (int i = 0; i < size; i++) {
		if (v == arr[i]) {
			cnt++;
		}
	}

	cout << cnt << endl;

	delete[] arr;
	return 0;


}

 