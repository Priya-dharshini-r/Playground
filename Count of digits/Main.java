#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,a=0;
  cin>>n;
  do
  {
    n=n/10;
    a++;
  }while(n>0);
  cout<<a;
}