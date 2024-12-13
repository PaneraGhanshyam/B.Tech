import 'dart:io';

void main(){
  List<int> list1=[1,2,3,7,8,9,10],list2=[1,2,8,9,10];
  for(int ele in list1){
    if(list2.contains(ele)){
      print(ele);
    }
  }
  List<int> commonElements = list1.toSet().intersection(list2.toSet()).toList();
  print(commonElements);
}