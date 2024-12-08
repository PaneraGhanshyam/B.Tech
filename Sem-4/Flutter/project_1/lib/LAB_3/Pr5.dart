import 'dart:io';

void main(){
  String s;

  print("Enter String:");
  s=stdin.readLineSync()!;

  List l=s.split('');

  s=l.reversed.join();
  print(s);
}