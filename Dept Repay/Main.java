#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,r,n;
  float a,b;
  double c,d;
  cin>>x>>r>>n;
  a=(x*r*n)/100;
  cout<<a;
  b=x+a;
  cout<<"\n"<<b;
  c=0.02*a;
  cout<<"\n"<<c;
  d=(x+a)-c;
  cout<<"\n"<<d;
}
