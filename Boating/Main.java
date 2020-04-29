#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int wt,adult,children;
  cin>>wt;
  cin>>adult;
  cin>>children;
  if(((adult*75)+(children*30))<wt)
  {
    cout<<"Boat is stable";
  }
  else
  {
    cout<<"Boat will drow";
  }
}