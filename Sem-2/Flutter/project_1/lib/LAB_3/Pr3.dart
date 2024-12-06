import 'dart:io';

void main(){
  int n;

  print("Enter number:");
  n=int.parse(stdin.readLineSync()!);
  int count=0;
  for(int i=1;i<=n;i++){
    if(n%i==0)
      count++;
  }
  if(count==2)
    print("Prime number.");
  else
    print("Not prime number.");
}