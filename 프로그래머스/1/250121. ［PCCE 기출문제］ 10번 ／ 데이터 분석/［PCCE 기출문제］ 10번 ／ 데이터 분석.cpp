#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<vector<int>> solution(vector<vector<int>> data, string ext, int val_ext, string sort_by) {
    vector<vector<int>> answer;
    
    int checkExt = 0;
    int checkSort = 0;

    if (sort_by == "code") checkSort = 0;
    else if (sort_by == "date") checkSort = 1;
    else if (sort_by == "maximum") checkSort = 2;
    else if (sort_by == "remain") checkSort = 3;


    if (ext == "code") checkExt = 0;
    else if (ext == "date") checkExt = 1;
    else if (ext == "maximum") checkExt = 2;
    else if (ext == "remain") checkExt = 3;
    
    for (int i = 0; i < data.size(); i++)
    {
        if (data[i][checkExt] < val_ext)
        {
            answer.push_back(data[i]);
        }

    }

    sort(answer.begin(), answer.end(),
                 [checkSort](const vector<int>& a, const vector<int>& b) {
                return a[checkSort] < b[checkSort];
    });
   
            
    return answer;
}