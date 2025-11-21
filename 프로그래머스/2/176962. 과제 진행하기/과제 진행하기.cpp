#include <string>
#include <vector>
#include <algorithm>
using namespace std;

vector<string> solution(vector<vector<string>> plans) {
    vector<string> answer;
    vector<pair<string, pair<int,int>>> tasks; // {name, {startTime, playTime}}

    for (auto& plan : plans) {
        string name = plan[0];
        int h = stoi(plan[1].substr(0,2));
        int m = stoi(plan[1].substr(3,2));
        int t = stoi(plan[2]);
        tasks.push_back({name, {h*60 + m, t}});
    }

    sort(tasks.begin(), tasks.end(), [](auto &a, auto &b) {
        return a.second.first < b.second.first;
    });

    vector<pair<string,int>> stack; // 멈춘 과제 {name, 남은시간}
    int curTime = tasks[0].second.first; // 현재 시간
    for (int i = 0; i < tasks.size(); ++i) {
        string name = tasks[i].first;
        int start = tasks[i].second.first;
        int duration = tasks[i].second.second;

        while (!stack.empty() && curTime < start) {
            auto &top = stack.back();
            if (curTime + top.second <= start) {
                curTime += top.second;
                answer.push_back(top.first);
                stack.pop_back();
            } else {
                top.second -= (start - curTime);
                curTime = start;
                break;
            }
        }

        curTime = start;
        if (i + 1 < tasks.size()) {
            int nextStart = tasks[i+1].second.first;
            if (curTime + duration > nextStart) {
                stack.push_back({name, (curTime + duration) - nextStart});
                curTime = nextStart;
            } else {
                curTime += duration;
                answer.push_back(name);
            }
        } else {
            curTime += duration;
            answer.push_back(name);
        }
    }

    while (!stack.empty()) {
        answer.push_back(stack.back().first);
        stack.pop_back();
    }

    return answer;
}