#include<iostream>
#include<stack>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    long n, c;
    stack<long> stek;
    cin >> n;
    long sum = n-1;
    for(long i=0; i<n; i++)
    {
        cin >> c;
        stek.push(c);
    }
    long a, b;
    while(stek.size() != 1){
        a = stek.top();
            stek.pop();
        b = stek.top();
            stek.pop();
        if(a > b)
        {
            stek.push(b);
            a = stek.top();
                stek.pop();
            b = stek.top();
                stek.pop();
            if(a >= b)
            {
                stek.push(a);
                stek.push(b);
            }
            else
            {
                stek.push(b);
                sum++;
            }
        }
        else
        {
            stek.push(b);
        }

    }
    cout << sum << endl;

}
