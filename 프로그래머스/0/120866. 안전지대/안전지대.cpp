#include <string>
#include <vector>

using namespace std;

int solution(vector<vector<int>> board) {
    int answer = 0;
    int n = board.size();
    int dx[] = { -1,-1,-1,0,0,1,1,1 };
    int dy[] = { -1,0,1,-1,1,-1,0,1 };

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (board[i][j] == 1) {
                answer++;
                for (int z = 0; z < 8; z++) {
                    int x_dx = i + dx[z];
                    int y_dy = j + dy[z];

                    if ((-1 < x_dx && x_dx < n)
                        && (-1 < y_dy && y_dy < n)
                        && (board[x_dx][y_dy] == 0)) {
                        board[x_dx][y_dy] = 2;
                        answer++;
                    }
                }
            }
        }
    }
    answer = (n*n) - answer;
 
    return answer;
}