import 'dart:io';

void main(){
  print("Enter size of array:");
  int n=int.parse(stdin.readLineSync()!);
  List<int> list=[];

  for(int i=0;i<n;i++){
    print("Enter ${i+1} th element: ");
    list.add(int.parse(stdin.readLineSync()!));
  }

  int odd=0,even=0;
  for(int element in list){
    if(element%2==0)
      even++;
    else
      odd++;
  }
  print("Odd numbers:$odd");
  print("Even numbers:$even");
}
