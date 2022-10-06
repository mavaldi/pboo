#include<queue>
#include<iostream>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int T, n, m, prt, test, arr[1001];
    priority_queue<int> q;
    cin >> T;
    while(T--)
    {
        int rslt = 1;
        cin >> n >> m;
        for(int i=0; i<n; i++)
        {
            cin >> arr[i];
            q.push(arr[i]);
        }
        prt = arr[m];
        while(!q.empty())
        {
            test = q.top(); q.pop();
            if(prt < test)
            {
                rslt++;
            }
            else
            {
                break;
            }
        }
        cout << rslt << "\n";
        rslt = 1;
    }
}
