#include <iostream>
#include <cstring>
using namespace std;

int main() {
	int T;
	cin >> T;
	string* arr = new string[T];
	for (int i = 0; i < T; i++) {
		char cArr[1001];
		cin >> cArr;
		arr[i] = cArr[0];
		arr[i] += cArr[strlen(cArr) - 1];
	}

	for (int i = 0; i < T;i++) {
		cout <<arr[i]<<endl;
	}


	delete[] arr;
	return 0;
}