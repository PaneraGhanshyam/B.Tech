import 'dart:io';

void main(){
  List<String> list=["Delhi",
    "Mumbai", "Bangalore",
    "Hyderabad","Ahmedabad"];

  print(list);
  list[list.indexOf("Ahmedabad")]="Surat";
  print(list);

}