import 'dart:io';

void main(){
  int n;
  String s;

  print("Enter number:");
  s=stdin.readLineSync()!;

  List l=s.split('');

  n=int.parse(l.reversed.join());
  print(n);
}