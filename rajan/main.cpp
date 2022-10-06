#include <cstdio>
#include <stack>
using namespace std;
stack<int> stek;
#define oo 999999

int getnum(){
	int res=0;
	char c;
	bool neg = false;
	while(1){
		c=getchar_unlocked();
		if(c=='-') neg=true;
		if(c==' ' || c=='\n') continue;
		else break;
	}
	if(c!='-' ) res=c-'0';
	while(1){
		c=getchar_unlocked();
		if(c>='0' && c<='9') res = 10 * res + c - '0';
		else break;
	}
	if(neg) res *= - 1;
	return res;
}

int main(){
	int n, sum = 0;
	n = getnum();
	while(n--){
		int a = -oo;
		int height;
		height = getnum();

		while(!stek.empty()){
			if ((stek.top()<=a) || (height<=a)){
                break;

                sum++;

			}
			if(height >= stek.top()){
				a = stek.top(); stek.pop();
			}

			else if (height < stek.top()){
                break;
			}
		}

		stek.push(height);
	}
		printf("%d\n", sum);
	return 0;
}
