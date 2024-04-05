#include <iostream>

using namespace std;

int main() {
    string A, B, reverseA, reveresB;
    cin >> A >> B; //입력

    for (int i = 2; i >= 0; i--) { //역으로 저장
        reverseA += A[i];
        reveresB += B[i];
    }

    cout << max(reverseA, reveresB); //둘 중 큰 값 출력
}