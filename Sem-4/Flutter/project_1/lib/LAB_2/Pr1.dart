import 'dart:io';

void main(){
    int? num;
    stdout.write("Enter number:");
    num=int.parse(stdin.readLineSync()!);

    if(num<0){
      stdout.write("Negative number.");
    }else if(num>0){
      stdout.write("Positive number.");
    }else{
      stdout.write("Neither negative nor positive.");
    }
}