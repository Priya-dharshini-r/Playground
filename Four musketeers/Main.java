#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x1,y1,x2,y2,x3,y3;
  cin>>x1>>y1>>x2>>y2>>x3>>y3;
  float x,y;
  x=(x1+x2+x3);
  x=x/3;
  cout<<x;
  y=(y1+y2+y3);
  y=y/3;
  cout<<"\n"<<y;
}