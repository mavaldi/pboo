#include <bits/stdc++.h>
using namespace std;
#include <deque>

int main(){

    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n, i;
    while(1){
        cin >> n;
        if(n == 0) break;
        std::deque<int> cards;
        for(i = 1; i <= n; i++){
            cards.push_back(i);
        }
        cout << "Discarded cards: ";
        while(cards.size() > 1){
            if(cards.size() != 2)
                cout << cards.front() << ", ";
            else cout << cards.front() << "\n";
            cards.pop_front();
            cards.push_back(cards.front());
            cards.pop_front();
        }
        cout << "Remaining card: " << cards.front() << "\n";
    }
    return 0;
}
