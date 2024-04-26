#include <string>
#include <vector>
#include <iostream>
using namespace std;

int solution(int number, int limit, int power) {
    int answer = 0;
    vector<int> vNum;
    for (int i = 1; i <= number; i++) {
        int cnt = 1;
        for (int j = 1; j <= i/2; j++) {
            if ((i % j) == 0) {
                cnt++;
            }
        }
        vNum.push_back(cnt > limit ? power:cnt);
    }
    for (vector<int>::iterator iter = vNum.begin();iter!=vNum.end();++iter) {
        answer += *iter;
    }
    return answer;
}