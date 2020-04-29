#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  int n,reverse=0,remainder;
  cin>>n;
  while(n!=0)
  {
    remainder=n%10;
    reverse=reverse*10+remainder;
    n=n/10;
  }
    cout<<reverse;
	return 0;
}