#include <string>
#include <vector>

using namespace std;

int solution(vector<vector<int>> dots) {
    int answer = 0;
    int xMin = 256;
    int xMax = -256;
    int yMin = 256;
    int yMax = -256;
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 2; j++) {
            if (dots[i][0] < xMin) {
                xMin = dots[i][0];
            }
            else if (dots[i][1] < yMin) {
                yMin = dots[i][1];
            }
            else if (dots[i][0] > xMax) {
                xMax = dots[i][0];
            }
            else if (dots[i][1] > yMax) {
                yMax = dots[i][1];
            }
        }

    }
    answer = (yMax - yMin) * (xMax - xMin);
    return answer;
}