#include<set>
#include<cstdio>
#include<queue>
#include<algorithm>
using namespace std;

int main(){
    int n, tmp;
    scanf("%d", &n);
    set<int> SET;
    pair<set<int>::iterator, bool>

    n = DQ.size();
    for(int i=0; i<n-1; i++){
        tmp DQ.front(); printf("%d ", tmp):
        DQ.push_back(tmp); DQ.pop_front();
    }
    tmp = DQ.front(); printf("%d\n", tmp);
    DQ.push_back(tmp); DQ.pop_front();
    for(int i=0; i<n-1; i++){
        printf("%d ", DQ.back());
        DQ.pop_back();
    }
    printf("%d\n", DQ.back());
    DQ.pop_back();
    return 0;
}
