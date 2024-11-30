import 'dart:io';

void main() {
  String s;
  stdout.write("Enter your name:");
  s = stdin.readLineSync()!;
  stdout.write("Your name is '$s");
}
