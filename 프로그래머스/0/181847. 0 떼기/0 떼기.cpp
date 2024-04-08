#include <string>
#include <vector>

using namespace std;

string solution(string s) {
    string answer = "";
    int i = 0;
    while (s[i] == '0') {
    i++;
}
for (int j = i; j < s.size(); j++) {
    answer += s[j];
}

return answer;
}