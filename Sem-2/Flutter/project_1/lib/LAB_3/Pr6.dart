import 'dart:io';

void main(){
  bool play=true;
  int even=0,odd=0;

  while(play){
    print("Enter number:");
    int n=int.parse(stdin.readLineSync()!);

    if(n==0) {
      play = false;
      continue;
    }else if(n > 0 && n%2 == 0){
      even += n;
    }else if(n < 0 && n%2 != 0){
      odd += n;
    }
  }
  print("Sum of even $even");
  print("Sum of odd $odd");
}