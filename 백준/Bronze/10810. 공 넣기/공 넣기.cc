#include <iostream>
using namespace std;

int main() {
	int M, N;
	cin >> M >> N;
	int a, b, c;
	int boxArr[101] = {};
	for (int i = 0; i < N; i++) {
		cin >> a >> b >> c;
		for (int j = a - 1; j < b ; j++) {
			boxArr[j] = c;
		}
	}

	for (int i = 0; i < M; i++) {
		cout << boxArr[i] << " ";
	}
	return 0;

}