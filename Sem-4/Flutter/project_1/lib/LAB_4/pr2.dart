import 'dart:io';

void main(){
  print("Enter number - 1 :");
  int n1=int.parse(stdin.readLineSync()!);

  print("Enter number - 2 :");
  int n2=int.parse(stdin.readLineSync()!);

  print(findMaxOFTwo(number1: n1, number2: n2));
}
int findMaxOFTwo({required number1,required number2}){
  if(number1>number2) {
    return number1;
  } else {
    return number2;
  }
}