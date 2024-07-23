#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

bool visited[100001];
vector<int> vec[100001];
int result[100001];
int cnt = 0;
int N,M,R = 0;
int u,v = 0;

void dfs(int num)
{
    if(visited[num] == 1)
    {
        return;
    }
    visited[num] = 1;
    cnt++;
    result[num] = cnt;
    for(int i = 0; i<vec[num].size(); i++)
    {
        dfs(vec[num][i]);
    }
}

int main()
{
    scanf("%d %d %d",&N,&M,&R);
    for(int i = 1; i<=M; i++)
    {
        scanf("%d %d",&u,&v);
        vec[u].push_back(v);
        vec[v].push_back(u);
    }
    for(int i = 1; i<=N; i++)
    {
        sort(vec[i].begin(),vec[i].end());
    }
    dfs(R);
    for(int i = 1; i<=N; i++)
    {
        printf("%d\n",result[i]);
    }
}
