import 'dart:io';

void main() {
  int? fah;
  double? cel;

  print("Enter fahrenheit:");
  fah = int.parse(stdin.readLineSync()!);

  cel = (fah - 32) / 1.8;

  print("Celsius is $cel");
}
