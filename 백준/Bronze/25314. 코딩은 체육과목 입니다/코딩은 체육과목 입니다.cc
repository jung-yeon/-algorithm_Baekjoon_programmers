#include <iostream>
using namespace std;

int main() {
	int N;
	cin >> N;

	string intName = "int";
	string longName = "long ";

	string result = "";

	int cyclesNum = N / 4;

	for (int i = 0; i < cyclesNum; i++) {
		result += longName;
	}
	cout << result + intName;
	return 0;

}