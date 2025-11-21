#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<string> park, vector<string> routes) {
    vector<int> answer;
    
    vector<vector<int>> vecMap(park.size(), vector<int>(park[0].length(), 0));
    //벗어나면 초기화
    //장애물 만나면 초기화
    int startX = 0;
    int startY = 0;

    for (int i = 0; i < park.size(); i++)
    {
        string str = park[i];
        for (int j = 0; j < str.length(); j++)
        {
            if (str[j] == 'S')
            {
                startX = i;
                startY = j;
                vecMap[i][j] = 1;
            }
            else if (str[j] == 'X')
            {
                vecMap[i][j] = 4;
            }

        }
    }

    int curX = startX;
    int curY = startY;
   for (int i = 0; i < routes.size(); i++)
    {
        string left = routes[i].substr(0, 1);
        int right = stoi(routes[i].substr(2, routes[i].length() - 2));

        int moveY = curY;
        int moveX = curX;
        
        if (left == "E")
        {
            bool isPass = true;
            if (curY + right > vecMap[0].size() - 1)
            {
                isPass = false;
            }
            if(isPass)
            {
                for(int a = 0; a< right; a++)
                {
                    if (vecMap[curX][++moveY] == 4) isPass = false;
                }
            }
            if (isPass)
            {
                curY += right;
            }
        }
        else if (left == "W")
        {
            bool isPass = true;

            if (curY - right < 0)
            {
                isPass = false;
            }
            if(isPass)
            {
                for (int a = 0; a < right; a++)
                {
                    if (vecMap[curX][--moveY] == 4) isPass = false;
                }
            }
            if (isPass)
            {
               curY -= right;
            }
        }
        else if (left == "S")
        {
            bool isPass = true;

            if (curX + right > vecMap.size() - 1)
            {
                isPass = false;
            }
            if(isPass)
            {
                for (int a = 0; a < right; a++)
                {
                    if(vecMap[++moveX][curY] == 4) isPass = false;
                }
            }
            if (isPass)
            {
                curX += right;
            }
        }
        else if (left == "N")
        {
            bool isPass = true;

            if (curX - right < 0)
            {
                isPass = false;
            }
            if(isPass)
            {
                for (int a = 0; a < right; a++)
                {
                    if (vecMap[--moveX][curY] == 4) isPass = false;
                }
            }
            
            if (isPass)
            {
                curX -= right;
            }
        }
        
    }
    
    answer.push_back(curX);
    answer.push_back(curY);

    return answer;
}