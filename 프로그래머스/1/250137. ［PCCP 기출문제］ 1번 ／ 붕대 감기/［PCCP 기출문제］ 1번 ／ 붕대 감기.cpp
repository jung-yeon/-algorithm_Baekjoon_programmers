#include <string>
#include <vector>

using namespace std;

int solution(vector<int> bandage, int health, vector<vector<int>> attacks) {
    int answer = 0;
    //모든 공격이 끝난 직후 남은 체력 
    //if 몬스터의 공격을 받고 캐릭터의 체력이 0이하가 되어 죽으면 -1
    int cnt = 1;
    int maxHealth = health;

    int successAttack = 0;
    for (int i = 0; i < attacks.size(); i++)
    {
        while (cnt < attacks[i][0])
        {
            successAttack++;

            if (successAttack == bandage[0])
            {
                health += bandage[2];
                successAttack = 0;
            }

            health += bandage[1];

            health = health > maxHealth ? maxHealth : health;

            cnt++;
            if (health < 1)
            {
                return -1;
            }

        }
        health -= attacks[i][1];
        successAttack = 0;
        cnt++;
        if (health < 1)
        {
            return -1;
        }


    }
    return health;
}