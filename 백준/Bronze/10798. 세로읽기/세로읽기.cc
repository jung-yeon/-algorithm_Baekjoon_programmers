#include <iostream>
#include <algorithm>

using namespace std;
struct A
{
	char nNums[15];
};

int main()
{
	ios_base::sync_with_stdio(false); cin.tie(0); cout.tie(0);

	A* arr = new A[5];
	
	for (int n = 0; n < 5; n++)
	{
		int nCnt = 0;
		while (true)
		{
			char a = cin.get();
			if (a == '\n') break; 

			*(((arr + n)->nNums) + nCnt) = a;
			if (nCnt == 15)
			{
				break;
			}
			nCnt++;
		}
	}

	for (int n = 0; n < 15; n++)
	{
		for (int i = 0; i < 5; i++)
		{
			char nResult = *(((arr + i)->nNums) + n);
			if (nResult >= '0' && nResult <= '9'
				|| nResult >= 65 && nResult <= 90
				|| nResult >= 97 && nResult <= 122)
			{
				cout << nResult;
			}
		}
	}
    return 0;
}

