#include<cstdio>
#include<queue>
using namespace std;

int main(){
    priority_queue<long long> pq;
    long long a = 0, b = 0, total = 0;
    long long n;
    scanf("%lld", &n);

    for(int i = 0; i < n; i++){
        long long ni;
        scanf("%lld", &ni);
        pq.push(-ni);
    }

    while(!pq.empty()){
        a = pq.top();
        pq.pop();
        if(pq.empty()) break;
        b = pq.top();
        pq.pop();
        total = total - (a + b);
        pq.push(a + b);
    }
    printf("%lld\n", total);

}
