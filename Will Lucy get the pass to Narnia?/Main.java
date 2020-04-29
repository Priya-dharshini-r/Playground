#include<iostream>
using namespace std;
int main()
{
  int a,b;
  int operation;
  cin>>a>>b;
  cin>>operation;
  cout<<"Enter first number : "<<"Enter second number : "<<"Menu";
  cout<<"\n1.Addition";
  cout<<"\n2.Subtraction";
  cout<<"\n3.Multiplication";
  cout<<"\n4.Division";
  cout<<"\n5.Remainder";
  switch(operation)
  {
    case 1:
      cout<<"\n"<<a+b;
      break;
    case 2:
      cout<<"\n"<<a-b;
      break;
    case 3:
      cout<<"\n"<<a*b;
      break;
    case 4:
      cout<<"\n"<<a/b;
      break;
    case 5:
      cout<<"\n"<<a%b;
      break;
    default:
      cout<<"\nInvalid operation";
  }
}