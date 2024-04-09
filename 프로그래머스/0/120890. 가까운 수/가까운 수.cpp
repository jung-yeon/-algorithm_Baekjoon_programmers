#include <string>
#include <vector>

using namespace std;

int solution(vector<int> array, int n) { //6,7,9   8
    int answer = 0;
    int min = abs(n - array[0]); //2
    answer = array[0];
    for (int i = 1; i < array.size(); i++) {
            int a = abs(n - array[i]); //1
            if (min > a) { //
                min = a; //1
                answer = array[i]; //7
            }
            else if(min == a){
                min = a;
                answer = array[i-1] > array[i] ?array[i] : array[i-1]; 
            }
    }
    return answer;
}