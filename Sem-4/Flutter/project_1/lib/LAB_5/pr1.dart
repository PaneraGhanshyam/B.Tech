import 'dart:io';

void main(){
  List<int> l=[];
  for(int i=0;i<5;i++){
    print("Enter ${i+1} number:");
    l.add(int.parse(stdin.readLineSync()!));
  }

  l.sort();
  print(l);
}