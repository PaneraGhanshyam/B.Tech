import 'dart:io';

void main() {
  int num1;
  int num2;

  print("Enter number 1:");
  num1 = int.parse(stdin.readLineSync()!);

  print("Enter number 2:");
  num2 = int.parse(stdin.readLineSync()!);

  print("Sum is ${num1 + num2}");
}
