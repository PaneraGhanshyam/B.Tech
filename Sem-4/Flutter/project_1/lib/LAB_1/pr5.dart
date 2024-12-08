import 'dart:io';

void main(){
  double? met,feet;

  stdout.write("Enter meter:");
  met=double.parse(stdin.readLineSync()!);

  feet=met*3.280839895;

  stdout.write("Feet is : $feet");
}
