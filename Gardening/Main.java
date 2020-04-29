#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int row;
  int col;
  int tree;
  cin>>row>>col>>tree;
  if(tree%2==0)
  {
	if(row%2==1 && col%2==1)
    {
      cout<<"It is a mango tree";
    }
    else
    {
      cout<<"It is not a mango tree";
    }
  }
    else
      cout<<"It is not a mango tree";
  }
