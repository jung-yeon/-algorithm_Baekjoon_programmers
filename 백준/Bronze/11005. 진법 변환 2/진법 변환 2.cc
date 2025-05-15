#include <iostream>

using namespace std;

int main()
{
	int nN;
	int nB;

	string res;
	cin >> nN >> nB;

	while (nN > 0)
	{
		int nChar = nN % nB;
		nN /= nB;
		if (nChar >= 0 && nChar <= 9) res+=(nChar + '0');
		else res += nChar + 'A' - 10;
	}
	for (int i = res.length() - 1; i >= 0; i--)
	{
		cout << res[i];
	}
}


