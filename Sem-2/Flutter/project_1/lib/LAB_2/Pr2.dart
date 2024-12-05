import 'dart:io';

void main(){
  int? num1,num2;

  print("Enter number 1:");
  num1=int.parse(stdin.readLineSync()!) ?? 1;

  print("Enter number 2:");
  num2=int.parse(stdin.readLineSync()!) ?? 1;

  print("Enter operator:");
  String? op=stdin.readLineSync();

  if(op=='+'||op=='-'||op=='*'||op=='/'){
    if(op=='+')
      print("$num1 $op $num2 = ${num1+num2}");
    if(op=='-')
      print("$num1 $op $num2 = ${num1-num2}");
    if(op=='*')
      print("$num1 $op $num2 = ${num1*num2}");
    if(op=='/')
      print("$num1 $op $num2 = ${num1/num2}");
  }
}