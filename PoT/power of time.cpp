#include<stdio.h>
#include<deque>

using namespace std;

int main(){
    int n, n2, call;
    deque<int> wrongO, trueO;

    scanf("%d", &n);

    n2 = n;
    while(n2--){
        scanf("%d", &call);
        wrongO.push_back(call);
    }
    n2 = n;
    while(n2--){
        scanf("%d", &call);
        trueO.push_back(call);
    }

    int prtc, time_total = 0;

    while(!trueO.empty()){
        if(trueO.front() == wrongO.front()){
            trueO.pop_front();
            wrongO.pop_front();
            time_total++;
        }
        else {
          prtc = wrongO.front();
          wrongO.pop_front();
          wrongO.push_back(prtc);
          time_total++;
        }
    }
    printf("%d", time_total);
}
