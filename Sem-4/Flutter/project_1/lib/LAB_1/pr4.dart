import 'dart:io';

void main(){
  double? m1,m2,m3,m4,m5;

  stdout.write("Enter marks - 1:");
  m1=double.parse(stdin.readLineSync()!);

  stdout.write("Enter marks - 2:");
  m2=double.parse(stdin.readLineSync()!);

  stdout.write("Enter marks - 3:");
  m3=double.parse(stdin.readLineSync()!);

  stdout.write("Enter marks - 4:");
  m4=double.parse(stdin.readLineSync()!);

  stdout.write("Enter marks - 5:");
  m5=double.parse(stdin.readLineSync()!);

  double total=m1+m2+m3+m4+m5;
  
  double per=(total/500)*100;

  stdout.write("Percentage is $per");

}