#include <iostream>
#include <algorithm>

using namespace std;

int main()
{
	ios_base::sync_with_stdio(false); cin.tie(0); cout.tie(0);

	int N;
	cin >> N;

	int* A = new int[N];

	for (int i = 0; i < N; i++)
	{
		int a;
		cin >> a;
		*(A + i) = a;
	}
	sort(A, A + N);

	int M;
	cin >> M;
	int* B = new int[M];

	for (int i = 0; i < M; i++)
	{
		int b;
		cin >> b;
		cout << (binary_search(A, A + N, b) ? "1" : "0")  << " ";

	}
}

