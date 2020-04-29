#include<iostream>
using namespace std;
int main()
{
int fs,fd,fsh,as,ad,ash,ss,sd,ssh;
cin>>fs>>fd>>fsh>>as>>ad>>ash>>ss>>sd>>ssh;
int a=(fs*fd)/100;
int b= fs-a+fsh;
int c=(as*ad)/100;
int d= as-c+ash;
int e= (ss*sd)/100;
int f= ss-e+ssh;
cout<<"In Flipkart Rs."<<b<<"\n";
cout<<"In Snapdeal Rs."<<d<<"\n";
cout<<"In Amazon Rs."<<f<<"\n";
if(b<=d && b<=f)
  cout<<"He will prefer Flipkart";
  else if(d<=f && d<=b)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
}

