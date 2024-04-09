#include <string>
#include <vector>

using namespace std;

int solution(int chicken) {
    int answer = 0;
     while(chicken != 1)
    {
        answer += chicken / 10;
        if(chicken / 10 > 0)
        {
            chicken = chicken % 10 + chicken / 10;
        }
        else
            break;
    }
    return answer;
}
