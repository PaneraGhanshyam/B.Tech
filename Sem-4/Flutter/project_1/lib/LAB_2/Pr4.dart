import 'dart:io';

void main(){
  int? m1,m2,m3,m4,m5;

  print("Enter mark1:");
  m1=int.parse(stdin.readLineSync()!);

  print("Enter mark2:");
  m2=int.parse(stdin.readLineSync()!);

  print("Enter mark3:");
  m3=int.parse(stdin.readLineSync()!);

  print("Enter mark4:");
  m4=int.parse(stdin.readLineSync()!);

  print("Enter mark5:");
  m5=int.parse(stdin.readLineSync()!);

  double per=((m1+m2+m3+m4+m5)*100)/500;

  if(per<35)
    print("Fail.");
  else if(per>=35 && per<45)
    print("Pass class.");
  else if(per>=45 && per<60)
    print("Second class.");
  else if(per>=60 && per<70)
    print("First class.");
  else if(per>=70)
    print("Distinction.");
}