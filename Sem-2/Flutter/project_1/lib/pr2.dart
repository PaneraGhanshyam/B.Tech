import 'dart:io';

void main() {
  int num1;
  int num2;

  stdout.write("Enter number 1:");
  num1 = int.parse(stdin.readLineSync()!);

  stdout.write("Enter number 2:");
  num2 = int.parse(stdin.readLineSync()!);

  stdout.write("Sum is ${num1 + num2}");
}
