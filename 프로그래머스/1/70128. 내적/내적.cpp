#include <string>
#include <vector>

using namespace std;
vector<int>::iterator iter; 
int solution(vector<int> a, vector<int> b) {
    int answer = 0;
    for(int i =0; i<a.size(); i++){
        int n = a[i] * b[i];
        answer +=n; 
    }
    return answer;
}