#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> mats, vector<vector<string>> park) 
{
    int answer = 0;
    vector<vector<int>> dp(park.size(), vector<int>(park[0].size()));

    for (int i = 0; i < park.size(); i++)
    {
        for (int j = 0; j < park[0].size(); j++)
        {
            if (!park[i][j].compare("-1"))
            {
                dp[i][j] += 1;
                if (i != 0 && j != 0)
                {
                    dp[i][j] += min(min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]);
                    answer = max(answer, dp[i][j]);
                }
            }
        }
    }

    sort(mats.begin(), mats.end());

    for (int i = mats.size() - 1; i >= 0 ; i--)
    {
        if (mats[i] <= answer)
        {
            return mats[i];
        }
    }

    return -1;
}