import 'dart:io';

void main(){
  int? num1,num2,num3;

  print("Enter number1:");
  num1=int.parse(stdin.readLineSync()!);

  print("Enter number2:");
  num2=int.parse(stdin.readLineSync()!);

  print("Enter number3:");
  num3=int.parse(stdin.readLineSync()!);

  print("Max is : ${num1>num2 ? (num1>num3 ? num1:num3):(num2>num3 ? num2:num3)}");
}