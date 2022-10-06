#include<iostream>
#include<cstdio>
#include<algorithm>
#include<set>
#include<stack>
using namespace std;
#define gc getchar_unlocked
set<int> s;
stack<int> stck;


void Get( int &ret ){
    ret = 0; char inp=gc(); int k1=1;
    while (inp<'0' || inp>'9'){
        if (inp=='-') k1=-1; inp=gc();}
    while ('0'<=inp && inp<='9')
        ret=(ret<<3)+(ret<<1)+(int)(inp-'0'), inp=gc();
    if (k1<1) ret=-ret;
}

int main(){
    int n, toffee;
    Get(n);
    while(n--){
        Get(toffee);
        if(s.count(toffee) == 0){
            s.insert(toffee);
            stck.push(toffee);
            printf("%d ", toffee);
        }
    }
    printf("\n");
    while(!stck.empty()){
        printf("%d ", stck.top());
        stck.pop();
    }
    return 0;
}
