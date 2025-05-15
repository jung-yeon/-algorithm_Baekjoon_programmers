#include <iostream>

using namespace std;

int main()
{
	int nArr[9][9] = { 0 };
	int N = 9;

	uint16_t unRow = 0;
	uint16_t unColumn = 0;
	
	int nMin = 101;
	int nMax = -1;

	for (uint8_t i = 0; i < 9; i++)
	{
		scanf("%hhu %hhu %hhu %hhu %hhu %hhu %hhu %hhu %hhu"
			, &nArr[i][0]
			, &nArr[i][1]
			, &nArr[i][2]
			, &nArr[i][3]
			, &nArr[i][4]
			, &nArr[i][5]
			, &nArr[i][6]
			, &nArr[i][7]
			, &nArr[i][8]);
	}

	while (N--)
	{
		uint8_t unXpos, unYpos = 0;

		for (uint8_t i = 0; i < 9; i++)
		{
			for (uint8_t j = 0; j < 9; j++)
			{
				if (nArr[i][j] > nMax)
				{
					nMax = nArr[i][j];
					unRow = i;
					unColumn = j;
				}
			}

		}
	}

	cout << nMax << endl;
	cout << unRow + 1 << " " << unColumn + 1;
}


