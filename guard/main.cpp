#include<queue>
#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int T, sum, ans, n, x[2002];
    cin >> T;
    while(T--){
        sum = 0;
        cin >> n;
        priority_queue<int> q, p;
        for(int i=0; i<n; i++){
            cin >> x[i];
            sum += x[i];
        }
        if(sum%n!=0) cout << -1 << "\n";
        else {
            ans = 0;
            int avg = sum/n;
            for(int i=0; i<n; i++){
                if(x[i] > avg)p.push(x[i]);
                else if(x[i] < avg)q.push(-x[i]);
            }
            while(!p.empty() || !q.empty()){
                int low, high;
                low = -q.top() , q.pop();
                high = p.top() , p.pop();
                int lif = (high - low)/2;
                high -= lif;
                low +=lif;
                ans++;
                if(low > avg) p.push(low);
                else if(low < avg) q.push(-low);
                if(high > avg) p.push(high);
                else if(high < avg) q.push(-high);
            }
            cout << ans << endl;
        }
    }
    return 0;
}
