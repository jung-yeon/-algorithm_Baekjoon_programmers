#include <string>
#include <algorithm>
#include <vector>

using namespace std;

int solution(vector<int> numlist) {
    int answer = 0;
    for(int i =0; i< numlist.size(); i++){
        if(numlist[i] < 0){
            answer = i;
            return answer;
        }
    }
    
    return -1;
}