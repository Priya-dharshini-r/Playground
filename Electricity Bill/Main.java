#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int unit;
  int cost;
  cin>>unit;
  if(unit<=200)
  {
	cost=unit*0.5;
    cout<<"Rs."<<cost;
  }
   else if(unit<=400)
   {
      cost=(unit*0.65)+100;
      cout<<"Rs."<<cost;
   }
   else if(unit<=600)
   {
      cost=(unit*0.85)+200;
      cout<<"Rs."<<cost;
   }
    else if(unit>=600)
    {
      cost=(unit*1.25);
      cout<<"Rs."<<cost;
    }
  else
  {
    cout<<" ";
  }
}
    
    
