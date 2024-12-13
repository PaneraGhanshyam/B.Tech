import 'dart:io';

void main(){
  PhoneBook p= PhoneBook();
  p.addContacts();
  p.addContacts();
  print(p.map);
}
class PhoneBook{
  Map<int,String> map={};

  void addContacts(){
    print("Enter number:");
    int num = int.parse(stdin.readLineSync()!);
    print("Enter name:");
    String name = stdin.readLineSync()!;
    map[num] = name;
  }
}