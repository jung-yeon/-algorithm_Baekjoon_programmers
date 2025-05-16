#include <vector>
#include <unordered_map>
using namespace std;

int solution(vector<int> nums)
{
	 int answer = 0;
    unordered_map<int, int> pocketmons;
    
    for (auto num : nums){
        pocketmons[num]++;
    }
    
    answer = min(pocketmons.size(), nums.size()/2);
    
    return answer;
}