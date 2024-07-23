#include <iostream>
#include <string.h> 
using namespace std;
//================================================================

class CStack
{
private:
    int m_arrBuffer[10000];

    int m_unPosition;
public:
    CStack();
    virtual ~CStack();

    void Push(int value);
    int Pop();
    int Size();
    bool Empty();
    int Top();
};
//================================================================

CStack::CStack()
{
    m_arrBuffer[10000] = {0,};
    m_unPosition = 0;
}
//================================================================

CStack::~CStack()
{
}
//================================================================

void CStack::Push(int value)
{
    m_arrBuffer[m_unPosition] = value;
    m_unPosition++;
}
//================================================================

int CStack::Pop()
{
    int popValue = 0;
    if(Empty())
    {
        return -1;
    }
    popValue = m_arrBuffer[m_unPosition - 1];
    m_unPosition--;
    return popValue;
}
//================================================================

int CStack::Size()
{
    return m_unPosition;
}
//================================================================

bool CStack::Empty()
{
    if(m_unPosition == 0)
    {
        return 1;
    }
    return 0;
}
//================================================================

int CStack::Top()
{
    int topValue = 0;
    if(Empty())
    {
        return -1;
    }
    topValue = m_arrBuffer[m_unPosition - 1];
    return topValue;
}
//================================================================

int main()
{
    CStack* stack = new CStack();
    int T = 0;
    cin >> T;
    string s;
    int result[T] = {0,};
    int resultPos = 0;
    for(int i = 0; i < T; i++)
    {
        cin>> s;
        // s = "pop";
        int num = 0;
        if(s == "push")
        {
            cin >> num;
            stack->Push(num);
            continue;
        }
        else if(s == "pop")
        {
            result[resultPos] =  stack->Pop();
            resultPos++;
            continue;
        }
        else if(s == "size")
        {
            result[resultPos] =  stack->Size();
            resultPos++;
            continue;
        }
        else if(s == "empty")
        {
            result[resultPos] =  stack->Empty();
            resultPos++;
            continue;
        }
        else if(s == "top")
        {
            result[resultPos]  =  stack->Top();
            resultPos++;
            continue;
        }
    }

    for(int i = 0; i<resultPos; i++)
    {
        cout<< result[i] <<endl;
    }

    return 0;
}