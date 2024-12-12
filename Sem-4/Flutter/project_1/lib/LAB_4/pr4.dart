import 'dart:io';

void main(){
  print("Enter number:");
  int n=int.parse(stdin.readLineSync()!);

  if(check(n: n)==1){
    print("it is prime.");
  }else{
    print("it is not prime.");
  }
}

int check({required int n}){
  int count=0;
  for(int i=1;i<=n;i++){
    if(n%i==0){
      count++;
    }
  }
  if(count==2){
    return 1;
  }else{
    return 0;
  }
}