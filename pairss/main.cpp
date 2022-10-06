#include <cstdio>
#include<iostream>
#include<algorithm>
using namespace std;
#define MAX 1000001
#define ll long long

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    long long n, sum = 0, arr[MAX];
    cin >> n;
    for(ll i=0; i<n; i++){
        cin >> arr[i];
    }
    for(ll j=0; j<n; j++){
        for(ll k=j+2; k<n; k++){
            for(ll a=j+1; a<k; a++){
                if(arr[a] < min(arr[k], arr[j])){
                    sum++;
                }
                if(arr[a] >= min(arr[k], arr[j])){
                    break;
                }
            }
        }
    }
    cout << sum + (n-1) << endl;

}
