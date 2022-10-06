#include <stdio.h>
#include <deque>
using namespace std;

int main()
{
    deque<int> sweet;
    int t, n, k;
    int array[10001];
    scanf("%d", &t);
    while(t--){
        scanf("%d%d", &n, &k);
        for(int j = 0; j < n; j++){
            scanf("%d", &array[j]);
            sweet.push_back(array[j]);
        }
    }
}

