import 'dart:io';

void main(){
  List<String> l=[];
  l.add("hello how are you.");
  print(l[0].split(" ").last.length);
  print(l[0].split(" ").reversed.join(" "));
}