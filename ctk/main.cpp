#include<bits/stdc++.h>
using namespace std;
void sliding(vector<int>&v,int k){
deque<int>q;
vector<int>res;
 for(int i=0;i<v.size();i++){
    while(!q.empty() && i-q.front()>=k){
        q.pop_front();
     }
   while(!q.empty() && v[q.back()]< v[i]){
       q.pop_back();
    }
    q.push_back(i);
     if(i>=k-1)res.push_back(v[q.front()]);
  }
  for(int i=0;i<res.size();i++){
         cout<<res[i]<<" ";
      }
  }
  int main(){
  int t,n,k,m;

  scanf("%d",&t);
  while(t--){
      cin>>n>>k;
       vector<int>v;
       vector<int>ans;
      for(int i=0;i<n;i++){
          cin>>m;
          v.push_back(m);
      }
      sliding(v,k);

  cout<<endl;
  }


  return 0;}
