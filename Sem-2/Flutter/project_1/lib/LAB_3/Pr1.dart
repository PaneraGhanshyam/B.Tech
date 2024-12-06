import 'dart:io';

void main(){
  print("Enter starting:");
  int n1=int.parse(stdin.readLineSync()!);

  print("Enter ending:");
  int n2=int.parse(stdin.readLineSync()!);

  for(n1;n1<=n2;n1++){
    if(n1 % 2 == 0 && n1 % 3 != 0)
      print(n1);
  }
}