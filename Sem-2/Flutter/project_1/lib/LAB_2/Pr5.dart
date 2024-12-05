import 'dart:io';

void main(){
  int? num1,num2,num3;

  print("Enter number1:");
  num1=int.parse(stdin.readLineSync()!);

  print("Enter number2:");
  num2=int.parse(stdin.readLineSync()!);

  print("Enter number3:");
  num3=int.parse(stdin.readLineSync()!);

  if(num1>num2){
    if(num1>num3)
      print("$num1 is max.");
    else
      print("$num3 is max.");
  }else{
    if(num2>num3)
      print("$num2 is max.");
    else
      print("$num3 is max.");
  }
}