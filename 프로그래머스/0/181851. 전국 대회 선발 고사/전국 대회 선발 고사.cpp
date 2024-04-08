#include <string>
#include <vector>
#include <algorithm>

using namespace std;
bool compare(pair<int, int> v1, pair<int, int> v2) {
    return v1.second < v2.second;
}
int solution(vector<int> rank, vector<bool> attendance) {
     vector<pair<int, int>> pv1;
 for (int i = 0; i < rank.size(); i++) {
     if (attendance[i]) {
         pv1.push_back(pair<int, int>(i, rank[i]));
     }
     
 }
 sort(pv1.begin(), pv1.end(),compare);
 int answer = 0;
 answer = (pv1[0].first * 10000) + (pv1[1].first * 100) + (pv1[2].first);
 return answer;
}