#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n, a;
    vector<int> v;
    vector<int>::iterator ip;
    cin >> n;
    while(n--){
        cin >> a;
        v.push_back(a);
    }
    ip = unique(v.begin(), v.begin() + n);

    v.resize(distance(v.begin(), ip));

    for(ip = v.begin(); ip != v.end(); ++ip){
        cout << *ip << " ";
    }


}
