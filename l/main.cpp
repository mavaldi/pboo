#include <iostream>
#include<cstdio>
using namespace std;

int main()
{
    for(int i=1; i<100; i++)
    {

        if(i % 3 == 0 && i % 9 != 0)
        {
            printf("%d\n", i);
            continue;
        }
        if(i % 9 == 0)
        {
            printf("%d\n\n", i);
            continue;
        }
        printf("%d ", i);
    }
}
