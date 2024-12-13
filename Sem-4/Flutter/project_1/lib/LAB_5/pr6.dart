import 'dart:io';

void main(){
  print("Enter size:");
  int n=int.parse(stdin.readLineSync()!);

  int sum=0;
  List<int> list=[];


  for(int i=0;i<n;i++){
    print("Enter ${i+1} number:");
    int num=int.parse(stdin.readLineSync()!);
    if(num%3==0 || num%5==0){
      sum += num;
    }
    list.add(num);
  }
  print("Sum is $sum");
}