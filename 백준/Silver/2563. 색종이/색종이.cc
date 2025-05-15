#include <iostream>
#include <algorithm>

using namespace std;

int main()
{
	int nArr[100][100] = { 0 };
	int N = 0;
	cin >> N;

	uint16_t unResult = 0;
	while (N--)
	{
		uint8_t unXpos, unYpos = 0;

		scanf("%hhu %hhu", &unXpos, &unYpos);
		for (uint8_t i = unXpos; i < unXpos + 10; i++)
		{
			for (uint8_t j = unYpos; j < unYpos + 10; j++)
			{
				if (!nArr[i][j])
				{
					unResult++;
					nArr[i][j] = 1;
				}
			}

		}
	}

	cout << unResult;
}


