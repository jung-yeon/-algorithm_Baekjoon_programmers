#include <string>
#include <vector>
#include <queue>
using namespace std;

vector<int> solution(vector<int> progresses, vector<int> speeds) {
    vector<int> answer;
    queue<int> days;
    int preEnd = 0;
    int maxDay = 0;
    int progressCnt=0;
       // 각 작업이 완료되기까지 필요한 일 수를 계산하여 큐에 저장
    for(int i = 0; i < progresses.size(); i++) 
    {
        int day = (100 - progresses[i] + speeds[i] - 1) / speeds[i]; ; // 올림 계산
        days.push(day);
    }
    while(!days.empty()) 
    {
            int current = days.front(); // 첫 번째 작업의 완료 일 수
            days.pop();
            int count = 1; // 현재 배포할 기능의 개수

            // 같은 배포 그룹에 포함될 수 있는 기능들을 처리
            while(!days.empty() && days.front() <= current) {
                count++;
                days.pop();
            }

            answer.push_back(count);
    }

    return answer;
}
