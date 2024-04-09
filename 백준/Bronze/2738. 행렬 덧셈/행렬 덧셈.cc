/*
* cin과 scanf의 차이
* 입력받을 변수형의 타입을 정해주냐 그렇지 않냐의 차이
* 
* cin의 경우 operator를 사용하여 자동으로 해당 뒤에 오는 변수의 타입을 보고 판단하여 변수를 입력받음
* 
* operator : 모든 공백문자(띄어쓰기나 엔터, 탭 등)을 입력시에 무시해버림
*/

/*
* 
*/
#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int N, M;
    cin >> N >> M;

    vector<vector<int>> v1;
    int** arr1 = new int*[N];
    int** arr2 = new int*[N];
    int** arr3 = new int* [N];
    for (int i = 0; i < N; i++) {
        arr1[i] = new int[M];
        arr3[i] = new int[M];
        for (int j = 0; j < M; j++) {
            int a;
            cin >> a;
            arr1[i][j] = a;
        }
    }
    for (int i = 0; i < N; i++) {
        arr2[i] = new int[M];

        for (int j = 0; j < M; j++) {
            int a;
            cin >> a;
            arr2[i][j] = a;
        }
    }
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            arr3[i][j] = arr1[i][j] + arr2[i][j];
        }
    }
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            cout << arr3[i][j] << " " ;
        }
        cout << endl;
    }
    for (int i = 0; i < N; i++) {
        delete[] arr1[i];
        delete[] arr2[i];
        delete[] arr3[i];
    }    

    delete[] arr1;
    delete[] arr2;
    delete[] arr3;
    
    return 0;
}