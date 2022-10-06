#include<stack>
#include<string>
#include<iostream>
#define MAX_LIMIT 1000000
using namespace std;
int n,i;
string s(MAX_LIMIT, '\0');
int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);
    for(int t = 1; t <= 10; t++)
    {
        scanf("%d", &n);
        scanf("%s", s.c_str());
        stack<bool> st;// 1 = 'S' , 0 = 'R'
        i = 0;
        while(i < n)
        {
            if(st.empty())
            {
                if(s[i] == 'S') st.push(1);
                st.push(0);
            }
            else if(st.size() == 1)
            {
                if(st.top() == 0)
                {
                    if(s[i] == 'R') st.pop();
                }
                else
                {
                    if(s[i] == 'S') st.pop();
                    else st.push(0);
                }
            }
            else if(st.top() == 0)
            {
                st.pop();
                if(s[i] == 'S')
                {
                    st.push(1);
                    st.push(0);
                    st.push(1);
                    st.push(0);
                }
            }
            else//st.top == 1
            {
                if(s[i] == 'R') st.push(0);
                else st.pop();
            }
            i++;
        }
        printf("%d\n", st.size());
    }
    return 0;
}
