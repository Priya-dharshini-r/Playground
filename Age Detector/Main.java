#include<iostream>
int main(){
  signed int current, birth, a;
  std::cin>>birth>>current;
  if(current<birth)
  {
    birth=100-birth;
    a=birth+current;
   std::cout<<a;
  }
  else
  {
  std::cout<<current-birth;
  }
  return 0;
}